exdata<-function(){
  library(readxl);
  data<-read_excel('excel_exam3.xlsx',sheet=2);
  return (data);
}

writedata<-function(df){
  write.csv(df,file='result0328.csv')
  
}

data<-exdata()
data$avg<-round(rowMeans(data[,c(3:5)]),2)


writedata(data)


data

colnames(data)<-c('a','a','a','a','a')

data

mean(data$math)
colnames(data)