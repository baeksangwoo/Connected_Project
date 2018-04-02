st<-read.csv('csv_exam_csv',header= F)

colnames()

na.omit(st[.c('id','class','ko')])
st2<-na.omit()
#국어 , 영어 수학 성적의 평균을 구하여 
#vector를 만든다

avg<-colMeans(st[.c('ko','en','ma')],na.rm=T)

#NA 값을 모두 0으로 바꾸시