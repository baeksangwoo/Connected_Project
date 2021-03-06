#데이터를 알아볼수 있게 rename
wifi<-function(a){  
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


  #데이터를 알아볼수 있게 rename
  
  kt<-data3 %>% filter(company=='KT')
  skt<-data3 %>% filter(company=='SKT')
  lg<-data3 %>% filter(company=='LGU+')

 
  if(a==1){
    jpeg(filename = "ktwifi.jpg", width = 680, height = 680, quality =100);
    p<-PlotOnStaticMap(ktmap,
                       lat=kt$lat,
                       lon=kt$lon,
                       destfile = 'ktwifi.jpg',
                       cex=1.5,
                       pch=20,
                       col=c('blue')
                       )
    print(p);
    dev.off();
    }
  if(a==2){
    jpeg(filename = "sktwifi.jpg", width = 680, height = 680, quality =100);
    p<-PlotOnStaticMap(ktmap,
                       lat=skt$lat,
                       lon=skt$lon,
                       destfile = 'sktwifi.jpg',
                       cex=1.5,
                       pch=20,
                       col=c('green')
    )
    print(p);
    dev.off();
  }
  if(a==3){
    jpeg(filename = "lgwifi.jpg", width = 680, height = 680, quality =100);
    p<-PlotOnStaticMap(ktmap,
                       lat=lg$lat,
                       lon=lg$lon,
                       destfile = 'lgwifi.jpg',
                       cex=1.5,
                       pch=20,
                       col=c('red')
    )
    print(p);
    dev.off();
  }
  
  
}

