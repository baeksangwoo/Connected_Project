#Oracel하고 R 연동하기
library(sqldf)
library(KoNLP)
library(dplyr)
library(stringr)
library(ggplot2)
library(RgoogleMaps)
class(iris)

mydata<-sqldf('SELECT * FROM iris where Species="setosa" ')

mydata2<- iris %>% filter(Species=="setosa")

mydata3<- iris[ iris$Species=='setosa',]

#평균을 구하자

sqldata<- sqldf('SELECT AVG("Sepal.Length") AS "seplen", AVG("Sepal.Width") AS sepwid, AVG("Petal.Width") AS petwid, AVG("Petal.Length") AS petalen, Species FROM iris ')


sqldata <- colMeans(iris[,c(1:4)])

sapmena<- sapply(iris[,c(1:4)],mean)

aggredata<- apply(iris[,c(1:4)],2,tapply,INDEX=iris$Species,mean)
#한줄 요약본

#좋은 코딩 법
mydata5<- iris %>% 
                group_by(Species) %>%
                  summarise(slmean=mean(Sepal.Length),
                            swmean=mean(Sepal.Width),
                            plmean=mean(Petal.Length),
                            pwmean=mean(Petal.Width)
                            )
#직관적인 좋은 코딩 법

ggplot(data = iris, aes(x=Sepal.Length,y=Petal.Length))+geom_line()

#일반적인 도표 


ggplot(data=mydata5)

