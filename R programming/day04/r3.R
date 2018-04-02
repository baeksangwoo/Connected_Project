df<-data.frame(sex = c("M","F",NA,"M","F"),score=c(5,4,3,5,NA))

df

is.na(df)

library(dplyr)
df %>% filter(is.na(score))

df %>% filter(!is.na(score)) #score 결측치 제거

df_nomiss <- df %>% filter(!is.na(score)) #score 결측치 제거


df_nomiss

mean(df_nomiss$score)

sum(df_nomiss$score)


df_nomiss <- df %>% filter(!is.na(score) & !is.na(sex))

df_nomiss

df_nomiss2 <-na.omit(df) #결측치 가 있는 행 없애버

df_nomiss2

mean(df$score, na.rm = T) #결측치를 제외하고 평균을 산출한다.

sum(df$score, na.rm = T)#결측치를 제외하고 합계를 산출

exam<-read.csv("csv_exam.csv")

exam[c(3,8,15),"math"] <- NA

exam


exam %>% summarise(mean_math =mean(math)) #math 평균 산출
#na 값이 섞여 있으므로 NA값만 추출된다.

exam %>% summarise(mean_math =mean(math, na.rm = T))#math 결측치를 제외하고 평균을 산출할때 na,rm=T를 써서 제거함







