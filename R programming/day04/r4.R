st<-read.csv('csv_exam.csv',header= F)

st

colnames(st)<-c('id','class','ma','en','si')

na.omit(st[.c('id','class','ko')])

st2<-na.omit()



#국어 , 영어 수학 성적의 평균을 구하여 
#vector를 만든다

avg<-colMeans(st[.c('ko','en','ma')],na.rm=T)

#NA 값을 모두 0으로 바꾸시오 

st$ko <-ifelse(is.na(st$ko),0,st$ko)
st$en <-ifelse(is.na(st$en),0,st$en)
st$ma <-ifelse(is.na(st$ma),0,st$ma)