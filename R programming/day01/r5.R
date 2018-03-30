c1<-c(1:9);
c2<-c(4:10);
cs<-union(c1,c2)
cs2<-setequal(c1,c2)
result <- c(1:3) %in% cs
print(length(result))

c3<- seq(1,1000,5)