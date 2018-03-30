library('ggplot2')
dim(mpg)

tf<-data.frame(x=c(1:5),y=c(6:10))

tf
#컬럼의 이름을 바꾸는 것
colnames(tf)<-c('col1','col2')

tf

library(dplyr)

tfc<-rename(tf, 'xx1'=x)

mpg<-rename(mpg,'city'='cty','highway'='hwy')

mpg$total <-(mpg$city+mpg$highway)/2

hist(mpg$total)

#히스토그램 그리

View(mpg)

mpg$test<-ifelse(mpg$total>=20,'PASS','FAIL')
table(mpg$test)
as.vector(table(mpg$test))

qplot(mpg$test)

#total 연비를 3등급으로 나누고자 한다.

#30 이상 A
#20~29   B
#20미만  C
#grade라는 칼럼을 만들어 추가한다.

mpg$grade <- ifelse(mpg$total>=30, "A",ifelse(mpg$total>=20,"B","C"))


qplot(mpg$grade)