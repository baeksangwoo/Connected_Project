#r8
name <- c('lee','kim','park','jang','hong')
age <-c(10,20,30,40,50)
weight<-c(40,50,60,70,80)
df<-data.frame(name,age,weight)
dim(df)
nrow(df)
ncol(df)

df[1,]

df[c(1,4),]

df2<-df[c(1:3),]
df2
mean(df2[,c('age','weight')])

df2<-df[,'age']
mean(df$age[1:3])

which(df$age==30)
sort(df$age)

mx <- which (df$age == max(df$age))
mn <- which (df$age == min(df$age))

mean(df$age[c(-mx,-mn)])

df$height<-c(180,170,160,150,155)

#weight / height*height*100
#bmi

bmi<-df$weight/df$height*df$height


df$bmi<-df$weight/(df$height*df$height)*10000
df


rowMeans(df2[,c('age','weight')])
