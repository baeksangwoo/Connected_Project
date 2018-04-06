#HIVE를 연동하여 R을 돌리기

library(rJava)
library(RJDBC)
library(DBI)
library(ggplot2)
library(dplyr)

drvName<- 'org.apache.hive.jdbc.HiveDriver';
id<- 'root';
pwd<- '111111'
url<-'jdbc:hive2://192.168.111.100:10000'

hive_lib <-'c:\\java_hive_lib'
.jinit();
.jaddClassPath(dir(hive_lib,full.names = T));
.jclassPath();

# 1. Driver Loading
drv <- JDBC(driverClass = drvName,
            classPath='hive-jdbc-1.0.1.jar')
# 2. Connection


conn<- dbConnect(drv,url,id,pwd)

# 3. Statement
#SQL 문으로 년도와 달 딜레이된 총 합을 받는다.
sqlstr<-'select Year,Month,COUNT(*) 
from airline_delay where Month IN (1,2,3,4,5,6,7,8,9,10,11,12) AND ArrDelay>0 
GROUP BY Year, Month';
 

# 4. ResultSet
air <-dbGetQuery(conn,sqlstr)


# 5. Close
dbDisconnect(conn)


#air에서 년도만 가져와서 추출

air_06 <- air[air$year=='2006',]
air_07 <- air[air$year=='2007',]
air_08 <- air[air$year=='2008',]

# 년도에서 월을 빠짐없이 추출하여 저장
# 행렬에서 x, y로 보면 
# air_06[ , c(-1)]은 1열을 빼고 받겠다는 의미 C는 벡터 값을 의미한다.

new_air_06 <-air_06[,c(-1)]
new_air_07 <-air_07[,c(-1)]
new_air_08 <-air_08[,c(-1)]


#데이터 분석 화면을 구현

ggplot(data=new_air_06, aes(x=new_air_06$month, y=new_air_06$'_c2',fill="2006"))+
  geom_line()+geom_point()+ 
  geom_line(data=new_air_07, aes(x=new_air_07$month, y=new_air_07$'_c2'),colour="red")+ geom_point(data=new_air_07, aes(x=new_air_07$month, y=new_air_07$'_c2'),colour="red")+geom_line(data=new_air_08, aes(x=new_air_08$month, y=new_air_08$'_c2'),colour="blue")+ geom_point(data=new_air_08, aes(x=new_air_08$month, y=new_air_08$'_c2'),colour="blue")

