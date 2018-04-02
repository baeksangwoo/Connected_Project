class(welfare$income)

##[1] "numeric"

summary(welfare$income)

qplot(welfare$income)
#평균 급여 그래프

qplot(welfare$income)+xlim(0,1000)

#월급의 값이 0이거나 9999는 결측치로 판단하여 제거함
summary(welfare$income)ifelse(welfare$income %in% C(0,9999),NA,welfare$income)

table(is.na(welfare$income))


sex_income<- welfare %>% filter(!is.na(income)) %>% group_by(sex) %>% summarise(mean_income= mean(income))

sex_income

#그래프로 보았을때 남자의 월급이 여자의 두배가 나왔다
ggplot(data=sex_income, aes(x=sex, y=mean_income))+geom_col()

class(welfare$birth)

summary(welfare$birth)

qplot(welfare$birth)

#나이별 구간을 만들기 위해 전처리 작업

table(is.na(welfare$birth))
welfare$birth<-ifelse(welfare$birth == 9999,NA,welfare$birth)
table(is.na(welfare$birth))

welfare$age<-2015 -welfare$birth+1
summary(welfare$age)

qplot(welfare$age)

age_income<-welfare %>% filter(!is.na(income)) %>%
  group_by(age) %>% summarise(mean_income =mean(income))

head(age_income)

ggplot(data=age_income , aes(x=age,y=mean_income))+geom_line()

welfare<-welfare %>% mutate(ageg=ifelse(age<30 ,"young",ifelse(age<=59,"middle","old")))

table(welfare$ageg)

ageg_income<-welfare %>% filter(!is.na(income)) %>% 
  group_by(ageg) %>% summarise(mean_income=mean(income))

ageg_income

ggplot(data= ageg_income , aes(x=ageg, y=mean_income))+geom_col()+scale_x_discrete(limits = c("young","middle","old"))

sex_income<-welfare %>% filter(!is.na(income)) %>% group_by(ageg,sex) %>% summarise(mean_income= mean(income))

sex_income

ggplot(data=sex_income, aes(x=ageg,y=mean_income, fill=sex))+geom_col()+scale_x_discrete(limits =c("young","middle","old"))
#남 녀를 통합해서 넣은 데이터

#중년의 범위를 50대 후반으로 넣음 young은 30세 이하
ggplot(data=sex_income, aes(x=ageg,y=mean_income, fill=sex))+geom_col(position = "dodge")+scale_x_discrete(limits =c("young","middle","old"))

sex_age <-welfare %>% filter(!is.na(income)) %>% group_by(age,sex) %>%
  summarise(mean_income=mean(income))

sex_age

ggplot(data=sex_age, aes(x=age, y=mean_income, col= sex))+geom_line()

