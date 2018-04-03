#데이터를 알아볼수 있게 rename
wifi<-function(a)
{  
  library(KoNLP)
  library(dplyr)
  library(stringr)
  library(ggplot2)
  library(RgoogleMaps)
  
  mycenter=c(37.501001, 127.038787)
  ktmap<-GetMap(
    center = mycenter,
    zoom=10,
    maptype = 'road',
    destfile = 'ktwifi.jpg'
  )
  
  sktmap<-GetMap(
    center = mycenter,
    zoom=10,
    maptype = 'road',
    destfile = 'sktwifi.jpg'
  )
  lgmap<-GetMap(
    center = mycenter,
    zoom=10,
    maptype = 'road',
    destfile = 'lgwifi.jpg'
  )
  
  
  svd<-read.csv('seoul.csv', header = T)
  #데이터를 불러 올때 유니코드로 불러오거나 UTF-8로 불러온다 
  #메모장을 이용
  data3<-rename(svd,
                company=설치기관.회사.,
                lat=설치위치.Y좌표.,
                lon=설치위치.X좌표.
  )
  
  data3
  #데이터를 알아볼수 있게 rename
  
  kt<-data3 %>% filter(company=='KT')
  skt<-data3 %>% filter(company=='SKT')
  lg<-data3 %>% filter(company=='LGU+')
  
  if(a==1){
    p<-PlotOnStaticMap(ktmap,
                       lat=kt$lat,
                       lon=kt$lon,
                       destfile = 'ktpoint.jpg',
                        cex=0.1,pch=10,col='red')
    print(p);
    dev.off();
    }
  ifelse(a==2,p<-PlotOnStaticMap(sktmap,
                            lat=data3$lat,
                            lon=data3$lon,
                            destfile = 'sktpoint.jpg',
                            cex=0.1,pch=10,col='blue'
         ),
         p<-PlotOnStaticMap(lgmap,
                            lat=data3$lat,
                            lon=data3$lon,
                            destfile ='lgpoint.jpg',
                            cex=0.1,pch=10,col='green'
         ))
  {
    print(p);
    dev.off();
  }
  

  
}

