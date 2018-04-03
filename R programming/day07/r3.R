wc<-function(a){
  library(KoNLP)
  library(dplyr)
  library(stringr)
  library(wordcloud)
  library(RColorBrewer)
  library(ggplot2)
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
  wf <- head(wf[order(wf$Freq,decreasing = T),],50)
  
  
  if(a==1)
  {
    jpeg(filename = "wc.jpg", width = 680, height = 680, quality = 100);
    
    pal<-brewer.pal(7,'Set1');
    set.seed(1234);
    p=wordcloud(words=wf$vc, freq = wf$Freq, min.freq = 1,max.words = 200, 
                random.order = F,
                rot.per = 0.1,
                scale = c(3,0.5),
                colors = pal);
  }else
  {
    jpeg(filename = "wcbar.jpg", width = 980, height = 980, quality = 100);
    
    order<-head(wf[order(wf$Freq),],30)
    order<-order$vc;
    p<-ggplot(
      data=wf,
      aes(x=wf$vc,y=wf$Freq))+
      ylim(0,30)+geom_col()+
      coord_flip()+
      scale_x_discrete(limit =order)+
      geom_text(aes(label=freq), hjust=-0.3)
    }
  print(p);
  dev.off();  
  
}
