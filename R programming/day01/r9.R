c2<-matrix(c(80, 90, 70, 100, 80, 99, 78, 72, 90,78,82,78,99,89,78,90), nrow=4,byrow=TRUE)

rownames(c2)<-c('kim','lee','hong','jang')
colnames(c2)<-c('ko','en','si','ma')

dim(c2)

c2

avg<-rowMeans(c2)
sum<-rowSums(c2)

avg
sum

c2<-cbind(c2,avg)
c2<-cbind(c2,sum)

avg<-colMeans(c2)

c2<-rbind(c2,avg)

c2

