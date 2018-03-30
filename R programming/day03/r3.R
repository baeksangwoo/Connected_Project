library(ggplot2)
library(sqldf)

mympg <-sqldf('SELECT *, (cty)/2 AS total FROM mpg')

mympg
