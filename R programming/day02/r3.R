# NA의처리
# 결측치가 데이터에 포함되어 있을 경우 연산결과가 다음과 같이 NA로 바뀌어버리므로 주의가 필요하다.

c2 <- c(1,2,3,NA,5)
sum(c2)

# NA를 제외하고 연산을 수행
mean(c2,na.rm = T)

# NULL은 따로 처리할 필요없이 NULL을 제외한 인자들로 연산을 수행
c2 <- c(1,2,3,NULL,5)
mean(c2,na.rm = T)

f1 <- function(a,b){
  return (a+b)
}

# 문자를 정수로 cast
cc <- c('1','1','1','1','1')
mean(cc)
mean(as.numeric(cc))


# 60과 80사이만 가져와라
ccc <- c(10,40,80,20,100,70,60)
ccc[ccc >= 60 & ccc <= 80]
# 2의 배수만 가져와라
ccc <- c(12,43,84,25,101,70,60)
ccc[ccc%%2==0]

# 문자열 합치기 paste(collapse 필수)
str4 <- c('a','b','c','d')
s <- paste(str4, collapse ='_')
s