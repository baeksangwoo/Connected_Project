df<-data.frame(sex = c("M","F",NA,"M","F"),score=c(5,4,3,5,NA))

df

is.na(df)

library(dplyr)
df %>% filter(is.na(score))

df %>% filter(!is.na(score)) #score 결측치 제거

df_nomiss <- df %>% filter(!is.na(score)) #score 결측치 제거




