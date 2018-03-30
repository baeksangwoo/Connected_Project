library('googleVis')
library('lubridate')
head(Fruits)
class(Fruits)
banana<- Fruits[Fruits$Fruit == 'Bananas',]
result <- sum(banana$Sales)

# group by 와 같은 역할
# aggregate(데이터기준, 데이터, 함수)
df122 <- aggregate(Profit~Fruit,Fruits,max)
df122
df2 <- Fruits[,c(4:6)] 
#콜럼 4,5,6을 짤라냄
apply(df2,2,sum) #colSums(df2)랑 비슷함

# 1.Fruits 데이터를 기반으로 년도별 월별 Sales와 Profit의 합을 구하시오
# 2. 1번의 결과를 기반으로 순이익(Psales)컬럼을 추가한다. 공식(Sales - Profit) *1.83

# 2. apply
# 3. sapply
#1. Fruits 데이터를 기반으로
#년도 별 월 별 Sales 와 Profit의 합을 구하시오

#2. 1번의 결과를 기반으로 순이익(psales)
# 컬럼을 추가한다.
#공식 (Sales - profit)*1.8

Fruits
ys<-cbind(Fruits,year=year(Fruits$Date))

df1<-aggregate(Sales ~ substr(Date,1,4)+substr(Date,6,7),Fruits,sum)
df1

df2<-aggregate(Profit ~ substr(Date,1,4)+substr(Date,6,7),Fruits,sum)
df2


df1$Psales <-(df1$Sales - df2$Profit)*1.83


df1

#3.년 별 월 별 세금을 계산한다.
#세금은 총 판매액Sales - profit 총 수익 * 0.1이다.
#
df3<-aggregate((Sales-Profit)*0.1 ~ substr(Date,1,4)+substr(Date,6,7),Fruits,sum)

colnames(df3)<-c('Year','Month','Fee')

df3


df1$Fee <-(df3$Sales - df4$Profit)*0.1

df1

colnames()

