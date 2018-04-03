#install.packages('RgoogleMaps') 
library(RgoogleMaps)
library(dplyr)

mycenter=c(37.501001, 127.038787)
mymap<-GetMap(
  center = mycenter,
  zoom=11,
  maptype = 'road',
  destfile = 'wifi.jpg'
)


svd<-read.csv('seoul.csv', header = T)
#데이터를 불러 올때 유니코드로 불러오거나 UTF-8로 불러온다 메모장을 이용
data3<-rename(svd,
              company=설치기관.회사.,
              lat=설치위치.Y좌표.,
              lon=설치위치.X좌표.
              )
#데이터를 알아볼수 있게 rename

kt<-data3 %>% filter(company=='KT')
skt<-data3 %>% filter(company=='SKT')


p<-PlotOnStaticMap(mymap,
                   lat=data3$lat,
                   lon=data3$lon,
                   destfile = 'wifi_point.jpg',
                   cex=0.3,pch=10,col='red'
)

print(p);
dev.off()

