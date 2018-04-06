#JAVA와 R 연동하기 
#install.packages('Rserve')

#local로 할려면 Rserve::run.Rserve()

r1<-function(){
  v2<-c(1:10);
  return(v2);
}

r2<-function(){
  v2<-c(1:10);
  return(v2);
}

#JAVA와 R 연동하기 
#install.packages('Rserve')

#local로 할려면 Rserve::run.Rserve()

r3<-function(){
  time<- c('6시','7시','8시','9시','10시');
  line2<-c(1000,2000,3000,4000,5000);
  line3<-c(1000,2000,3000,4000,5000);
  line4<-c(1000,2000,3000,4000,5000);
  v3<-data.frame(time,line2,line3,line4);
  return(v3);
}