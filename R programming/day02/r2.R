c1 <- c(1:10);
sum <- 0;
# 기억용
for(i in c1){
  sum <- sum + i
}
sum

# 한줄이면 끝
sum(c1)