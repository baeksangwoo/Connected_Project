#install.packages('RgoogleMaps') 
library(RgoogleMaps)
mycenter=c(37.501001, 127.038787)
mymap<-GetMap(
    center = mycenter,
    zoom=11,
    maptype = 'road',
    destfile = 'mymap.jpg'
)

jpeg(filename = "mypoint.jpg",width=680, height=680, quality=100);

mydata<- data.frame(
                    a=c(1:5),
                    lat=c(37.501401,37.501201,37.501101, 37.501601, 37.503001),
                    lon=c(126.031787 , 127.032787, 127.138787, 127.038737, 127.018787)            );

p<-PlotOnStaticMap(mymap,
                lat=mydata$lat,
                lon = mydata$lon,
                destfile = 'mymap_point.jpg',
                cex=6,pch=10,col='red'
                )

print(p);
dev.off()