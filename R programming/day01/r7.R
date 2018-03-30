c2<-matrix(c(80, 90, 70, 100, 80, 99, 78, 72, 90,78,82,78,99,89,78,90), nrow=4,byrow=TRUE)

rownames(c2)<-c('kim','lee','hong','jang')
colnames(c2)<-c('ko','en','si','ma')

c2

kim<-mean(c2[1,])
lee<-mean(c2[2,])
hong<-mean(c2[3,])
jang<-mean(c2[4,])



ko<-mean(c2[,1])
en<-mean(c2[,2])
si<-mean(c2[,3])
ma<-mean(c2[,4])

ko
en
si
ma


kim
lee
hong
jang