
library(rJava)
library(RJDBC)
library(DBI)

drvName<- 'oracle.jdbc.driver.OracleDriver';
id<- 'ruser';
pwd<- '111111'
url<-'jdbc:oracle:thin:@localhost:1521:XE'

# 1. Driver Loading
drv <- JDBC(driverClass = drvName,classPath = 'c:\\java_hive_lib\\ojdbc6.jar')
# 2. Connection

conn<- dbConnect(drv,url,id,pwd)

# 3. Statement

sqlstr1<-"select * from CAR where LOCATION='서울특별시' ";
sqlstr2<-"select * from CAR where LOCATION='인천광역시' ";
sqlstr3<-"select * from CAR where LOCATION='경기도' ";

# 4. ResultSet
car1<-dbGetQuery(conn,sqlstr1);
car2<-dbGetQuery(conn,sqlstr2);
car3<-dbGetQuery(conn,sqlstr3);

# 5. Close
dbDisconnect(conn)


location=c('서울','경기','인천')
options(scipen=10000000)
ggplot(data=car1, aes(x=YEAR, y=TOTAL, group=1))+geom_line()+
  geom_line(data=car2,aes(x=YEAR, y=TOTAL, group=2),colour='green')+
  geom_line(data=car3,aes(x=YEAR, y=TOTAL, group=3),colour='blue')+
  geom_point(data=car1,aes(x=YEAR, y=TOTAL),colour='red')+
  geom_point(data=car2,aes(x=YEAR, y=TOTAL),colour='green')+
  geom_point(data=car3,aes(x=YEAR, y=TOTAL),colour='blue')

#3 개의 데이터를 합쳐서 보여주기

ggplot(car1,aes(x=YEAR, y=TOTAL))+geom_line()+
  geom_line(data=pressure2,aes(x=temperature, y=pressure/2),colour='red')+
  geom_point(data=pressure2,aes(x=temperature, y=pressure/2),colour='red')
