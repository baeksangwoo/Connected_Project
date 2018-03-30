m1<-matrix(c(1, 2, 3, 4, 5, 6, 7, 8, 9), nrow=3)
m1
m2<-matrix(c(1, 2, 3, 4, 5, 6, 7, 8, 9), ncol=3, byrow=TRUE)
m2

colnames(m1)<-c('오소리','고구마','솜사탕')
rownames(m1)<-c('동물','채소','설탕')

m1[c('채소','설탕'),c(2,3)]

m1*5

m1*m1

cc1<-m1[,1]
