#emp 회사의 근속 연수(오늘 날짜 기준 일) 와 월급의
# 상관 관계를 그래프로 표현하시오


library(rJava)
library(RJDBC)
library(DBI)
library(ggplot2)

drvName<- 'oracle.jdbc.driver.OracleDriver';
id<- 'ruser';
pwd<- '111111'
url<-'jdbc:oracle:thin:@localhost:1521:XE'

# 1. Driver Loading
drv <- JDBC(driverClass = drvName,classPath = 'c:\\java_hive_lib\\ojdbc6.jar')
# 2. Connection
conn<- dbConnect(drv,url,id,pwd)
# 3. Statement
sqlstr<-'select trunc(months_between(sysdate,HIREDATE)) AS MON,SAL from emp';
# 4. ResultSet
emp<-dbGetQuery(conn,sqlstr);
# 5. Close
dbDisconnect(conn)

# 달별로 쪼개야한다.
#select trunc(months_between(sysdate,HIREDATE)) AS MON,SAL from emp;

ggplot(data=emp, aes(x=MON, y=SAL),col(C('red','green','blue')))+geom_col()
#geom_line() 꺽은선
#coord_flip 옆으로 돌려버리

#두개의 데이터를 합쳐서 보여주기
pressure2<- pressure*2
ggplot(pressure,aes(x=temperature, y=pressure))+geom_line()+
  geom_line(data=pressure2,aes(x=temperature, y=pressure/2),colour='red')+
  geom_point(data=pressure2,aes(x=temperature, y=pressure/2),colour='red')


# 1. 데이터 수집 csv
# 2. Developer를 이용하여 테이블을 생성하여 입력한다.
# 3. R을 이용하여 데이터를 분석


