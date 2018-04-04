#오늘은 HTML을 이용하여
#HIVE하고 R에다 연동하는 것을 만들것이다. AND JAVA로 접목해서 

#도표를 인터넷 환경에 가져오기 
#dynamic한 도표 가능

#install.packages('plotly')

library(plotly)
library(ggplot2)
library(htmlwidgets) #html에서 기동이 되게

p<- ggplot(data=mpg, aes(x=displ,y=hwy,col=drv))+geom_point()
saveWidget(p.file='aa.html')
#col 컬러를 입히자 drv(구동 방식)에 따라 컬러를 입힌거다
#고속도로 배기량 도시 배기량이 많은자동차 
#<- 이것은 정적인 데이터



#이것은 동적으로 작동이 가능하게 해준다.
ggplotly(p)

#인터넷이 가능하게 만드는 것

#install.packages("htmlwidgets")