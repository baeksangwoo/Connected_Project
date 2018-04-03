
txt1<-readLines('http://www.ytn.co.kr/_sn/0117_201804031018542626_001',encoding='UTF-8')
txt2<-readLines('http://www.ytn.co.kr/_ln/0103_201804030932232840',encoding='UTF-8')
txt3<-readLines('http://www.ytn.co.kr/_sn/1406_201804031306017121',encoding='UTF-8')


library(KoNLP)
library(dplyr)
library(stringr)
library(wordcloud)
library(RColorBrewer) #색을 다양하게 입히기 위해

useNIADic();

#영어를 지워 버리면 멋있지가 않다.

txt1<-readLines('txt1.txt');
txt2<-readLines('txt2.txt');
txt3<-readLines('txt3.txt');



txt<-c(txt1,txt2,txt3)

txt <- gsub('[0-9]','',txt)
txt <- gsub('[a-z]','',txt)
txt <- gsub('[A-Z]','',txt)
txt <- gsub('_', '',txt)
txt <- gsub('\\W', ' ',txt)
txt <- gsub(' ', ' ',txt)
txt <- gsub('  ', '',txt)
txt <- gsub('들이',' ',txt)

txt<-extractNoun(txt)

vc<- unlist(txt)
wc<- table(vc)

wf <- as.data.frame(wc,stringsAsFactors =  F)


wf<-filter(wf,nchar(wf$vc)>=2 & nchar(wf$vc) <=5 )
str(wf)
wf <- head(wf[order(wf$Freq,decreasing = T),],30)

pal<-brewer.pal(7,'Set1');
set.seed(1234);

jpeg(filename = "wordcloud3.jpg", width = 680, height = 680, quality = 100)


p = wordcloud(words=wf$vc,
              freq = wf$Freq, 
              min.freq = 1,
              max.words=200,
              random.order=F, 
              color=pal,
              scale = c(4,0.3), 
              rot.per = 0.1);

print(p);
dev.off()

wf


library(KoNLP)
library(dplyr)
library(stringr)
library(wordcloud)
library(RColorBrewer)

useNIADic()

txt1 <- readLines('txt1.txt')
txt2 <- readLines('txt2.txt')
txt3 <- readLines('txt3.txt')
txt<- c(txt1, txt2, txt3)

txt <- gsub('[0-9]','',txt)
txt <- gsub('[a-z]','',txt)
txt <- gsub('[A-Z]','',txt)
txt <- gsub('_', '',txt)
txt <- gsub('\\W', ' ',txt)
txt <- gsub(' ', ' ',txt)
txt <- gsub('  ', '',txt)
txt <- gsub('들이',' ',txt)

txt<- extractNoun(txt) # 

vc<- unlist(txt)
wc<- table(vc)

wf <- as.data.frame(wc,stringsAsFactors =  F)
wf<-filter(wf,nchar(wf$vc)>=2 & nchar(wf$vc) <=5 )
wf <- head(wf[order(wf$Freq,decreasing = T),],30)

pal<-brewer.pal(7,'Set1');
set.seed(1234);

jpeg(filename = "wordcloud2.jpg", width = 680, height = 680, quality = 100)


p=  wordcloud(words=wf$vc,
              freq = wf$Freq, 
              min.freq = 1,
              max.words=200,
              random.order=F, 
              color=pal,scale = c(8,0.2), 
              rot.per = 0.1)


print(p);
dev.off;



