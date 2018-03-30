 package
 console > install.packages('ggplot2')
library(ggplot2)
data <- c(10,10,20,30,30,30)
qplot(data)

# sample data
mpg

qplot(data=mpg,y=hwy,x=drv)
