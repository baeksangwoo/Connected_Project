df<-data.frame(sex = c("M","F",NA,"M","F"),score=c(5,4,3,5,NA))

df

is.na(df)


table(is.na(df$sex))


table(is.na(df$score))

mean(df$score)
