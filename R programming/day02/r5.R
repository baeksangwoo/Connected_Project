#project day02 - r5
name <- c('김지훈','이유진','박동현','김민지')
gender <- c('m','f','m','f')
ko <- c(90,80,60,70)
ma <- c(50,60,100,20)
si <- c(87,54,79,89)
en <- c(54,67,87,88)
add <- c('서울시','광주시','대전시','부산시')
df <- data.frame(name,gender,ko,ma,si,en,add)
#학생별 과목별 평균을 구하고
#각각 vector에 넣으시오


df2<-df[,c(3:6)]
submean<-colMeans(df2)
stumean=rowMeans(df2)
names(stumean)<-df[,1]


temp<-df[,'add']
class(temp) #팩터로 나온다.


temp2<-as.character(temp)
class(temp2)
df$add<-substr(temp2,1,2)
df$add2<-substr(temp2,3,3)

df


#학생병 국어와 영어의 평균을 구하시오 vector로 추가하여 표현
#컬럼 명은 학생의 이름 '김지훈','이유진','박동현','김민지'


result<-rowMeans(df[,c(3,6)])#      (df[1,3]+df[1,6])/2

names(result)<-df$name

result

#여학생들의 과목 별 평균을 구하시오 
#단 컬럼 명은 과목 명이 표시된다.

result1<-df[gender=='f',]
r1<-colMeans(result1[,c(3:6)])
r1

result2<-df[gender=='m',]
r2<-colMeans(result2[,c(3:6)])
result2

result3<-rbind(r1,r2)
class(result3)
result4<-as.data.frame(result3)
class(result4)





dfm<-df$gender=='m'
dff<-df$gender=='f'#이것은 자료를 추가할때

dfm<-df[gender=='m',]#자료의 추가 없이 꺼내서 볼때
dff<-df[gender=='f',]

dfm
dff

mvag<-colMeans(dfm[,c(3:6)])
fvag<-colMeans(dff[,c(3:6)])

mvag
fvag


#한국어평균 이상인 학생들 중 여자만 조회하시오 

df[df$gender=='f'& mean(df[,c(3:6)]),]

mean(mvag)




qplot(x=names(mvag),y=mvag)

df$dfm<-dfm
df$dff<-dff

df

plot(x=names(submean),y=submean)
qplot(data = submean,x=names(submean),y=submean)