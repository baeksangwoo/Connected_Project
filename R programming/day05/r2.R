library(dplyr)



mpg2<- mpg[,c('drv','highway')]

dfd<-mpg %>% group_by(drv) %>% summarise(mean_highway =mean(highway))

dfd

ggplot(data=dfd, aes(x=reorder(drv, -mean_highway),y=mean_highway))+geom_col()

# result의 값은 highway을 drv의 기준을 삼아 mpg에서 끄집어 내서 mean(평균)을 내어 가저온 값입니다.
result <- aggregate(highway~drv, mpg, mean)
#aggregate(volume(계산할 값) ~ city+year(기준이 되는 컬럼명), data = txhousing, mean(원하는 함수))입니다

result

ggplot(data=mpg, aes(x=highway))+geom_bar()

#회사에서 생산한 suv 차종의 도시 연비가 높은지 알아 볼려고 한다. suv ㅍ차종의 대상으로 평균 cty가 가장 높은 회사 다섯곳을 막대 그래프로 표현해 보세요 막대는 연비가 높은 순서대로!

df<-mpg %>% filter(class=='suv') %>% group_by(manufacturer) %>% summarise(meancty=mean(city)) %>% arrange(desc(meancty)) %>% head(5)
#1번 방법
#suv를 대상으로 필터링을 해보자! 
#제조사 별로 그룹을 지어서 
#city의 평균을 구하여 저장한뒤 내림차순으로 정리
#높은 것 5개만 골라보자

result2<-aggregate(city~manufacturer+class,mpg,mean)
result3<-result2[result2$class=='suv']
result4<-result3[order(resutl3$city,decreasing = T)]
#2번 방법
#변수에다  제조사와 차량 종류를 대상으로 city의 평균 값을 가져온다.
#그 변수에서 차량 종류를 suv로 한정해서 저장한다.
#suv로 저장한 데이터를 내림차순으로 정돈한다.


ggplot(data=df, aes(x=reorder(manufacturer,-meancty),y=meancty))+geom_col()

suvcty


#자동차 중에 어떤 class가 가장 많은지 알아보려한다. 자동차별 빈도를 표현한 막대그래프를 만드시오

ggplot(data=mpg,aes(x=class))+geom_bar()

# 전체 데이터에서 class만 바라보고 데이터를 가져와 bar형태로 그려주면 알아서 카운트 한다.
