getcsv <- function(){
  data <- read.csv('csv_exam3.csv',header = F,stringsAsFactors = F, encoding = 'UTF-8');
  class(data$V2)
  return(data)
}


writedata<-function(df){
  write.csv(df,file='result0328.rda')
  
}

data<-getcsv()


data$avg<-round(rowMeans(data[,c(3:5)]),2)


writedata(data)

newdata<-read.csv('result0328.csv',header = F, stringsAsFactors = F, encoding = 'UTF-8')


