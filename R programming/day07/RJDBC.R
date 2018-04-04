#install.packages('RJDBC')
#install.packages("DBI")

# 순서 
# 1. Driver Loading
# 2. Connection
# 3. Statement
# 4. ResultSet
# 5. Close

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
sqlstr<-'SELECT * FROM EMP';
# 4. ResultSet
emp<-dbGetQuery(conn,sqlstr);
# 5. Close
dbDisconnect(conn)


