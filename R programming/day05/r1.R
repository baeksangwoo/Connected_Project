library(ggplot2)

mpg<-as.data.frame(ggplot::mpg)



mpg<-rename(mpg, city=cty)
mpg<-rename(mpg, highway=hwy)

#geom_point는 점으로 된 분포도를 나타낸다.
#xlim and Ylim은 축 범위를 나타냅니다.
ggplot(data = mpg,aes(x=displ,y=highway))+geom_point()+xlim(2,8)+ylim(10,50)


#midwest 데이터와 mpg의 데이터 를 이욜해 분석문제를 해결하시오

#mpg 데이터의 cty와 hwy의 간의 상관 관계는?

ggplot(data=mpg,aes(x=city,y=highway))+geom_point()
#도시 연비와 고속도로 연비는 상관 관계에 있다.

ggplot(data=midwest, aes(x=poptotal,y=popasian))+geom_point()+xlim(0,150000)+ylim(0,10000)

fname <- 'c:\rproject\mygraph.png'
savePlot(filename = fname,type='png')
dev.off()
mpg