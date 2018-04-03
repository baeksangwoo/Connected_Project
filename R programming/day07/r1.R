#install.packages('rJava')
#install.packages('memoise')
#install.packages("KoNLP")
#install.packages('stringr')
#이제는 자바를 이용해 온라인에서 자료를 가져와서 작업할 수 있도록 한다.


#JAVA를 넣을려면 환경변수를 설정해주어야 한다. 
#컴퓨터 환경 설정에 JAVA_HOME 이라고 만들어 주고 jdk의 위치를 넣어준다.
library(rJava)
library(KoNLP)
library(dplyr)
library(stringr)
library(wordcloud)
library(RColorBrewer) #색을 다양하게 입히기 위해
useNIADic();
#단어장에 있는 명사들을 끄집어 내기 위해서 설치  

txt<-readLines('hiphop.txt');
txt<-str_replace(txt,'\\w',' ');
txt<-gsub('\\W',' ',txt);
#txt<-gsub('[0-9]',' ',txt);
#txt<-gsub('[a-z]',' ',txt);
#txt<-gsub('[A-Z]',' ',txt);
#영어를 지워 버리면 멋있지가 않다.


#특수문자를 공백으로 바꾸는데 사용된다. 
nouns<- extractNoun(txt);


wordcount<-table(unlist(nouns));
df_word<-as.data.frame(wordcount,stringsAsFactors = F)
df_word<-rename(df_word,word=Var1, freq=Freq);

df_word<-filter(df_word, nchar(word)>=2)
pal<-brewer.pal(8,"Dark2");
set.seed(1234);
wordcloud(words=df_word$word, 
          freq=df_word$freq,
          min.freq = 2,
          max.words = 200,
          random.order = F,
          rot.per=.1,
          scale = c(3,0.3),
          colors=pal)


#///////////////////////////////////책에서 



#명사만 추출하는데 사용된다.


vc<-unlist(noun);
#vector 벡터화 한다

wc<-table(vc);
#vector count 벡터화를 하면 카운트가 가능해진다.

wf<- as.data.frame(wc,stringsAsFactors = F);

wf<-filter(wf, nchar(vc)>=2);
wf<-head(wf[order(wf$Freq,decreasing = T),],650); #Freq가 20개 이상인 것을 내림차순
#wf<- filter(wf, nchar(var1)>=2) #워드 수가 2개 이상인 것만 추리겠다!
pal<-brewer.pal(8,'Dark2'); #Dark2라는 물감 통에서 8개의 색을 가져오겠다
set.seed(1234); #난수를 발생시켜서 워드클라우드의 모양을 바꾼다.


jpeg(filename ="wordcloud.jpg",width=680,heigh=680,quality = 100);

p=wordcloud(words=wf$vc, freq = wf$Freq, min.freq = 2,max.words = 200, 
          random.order = F,
          rot.per = 0.1,
          scale = c(3,0.5),
          colors = pal);
print(p);
dev.off();
  
#최소 단어 2개


#rot.per 글자가 가로 세로로 움직일 확률


#stringsAsFactors 스트링이 팩터로 들어가는 것 
#팩터 보단 string으로 하는 것이 분석하기 쉽다.
#install.packages('wordcloud') 




