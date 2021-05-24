#----------------------MÉTODOS AUXILIARES-------------------------------------

ic_known_var = function (x, var, alpha){
  n=length(x)
  media=mean(x)
  cuantil=qnorm(1-alpha/2)
  lim_inf=media-cuantil*sqrt(var)/sqrt(n)
  lim_sup=media+cuantil*sqrt(var)/sqrt(n)
  return(c(lim_inf, lim_sup))
}

ic_dif_mean_known_var =function(x, y, n1, n2, conf){
  
  mu1=mean(x)
  mu2=mean(y)
  mu3=mu1-mu2
  stder=sqrt((var(x)/n1) + (var(y)/n2))
  z=1.645
  if(conf==0.95){
    z=2
  }
  else if(conf==0.99){
    z=2.576
  }
  lim_inf=mu3-z*sqrt(stder)
  lim_sup=mu3+z*sqrt(stder)
  return(c(lim_inf, lim_sup))
}

mean.boot=function(x, index){
  return(c(mean(x[index]), var(x[index])/length(index)))
}


var.boot=function(x, index){
  return(c(var(x[index])))
  }







#--------------------PARTE 2: Estimación Clásica---------------------------

Data=read.csv( file="PYE2DataSet115.csv", header=TRUE)
if(!require(boot)){install.packages("boot")}
if(!require(DescTools)){install.packages("DescTools")}
if(!require(PropCIs)){install.packages("PropCIs")}


set.seed(2021)

#-------------------------TAREA 1.1---------------------------------------

#Estas cuatro variables son las medias del grupo completo de tiempo de
#sueño y pasos realizados y las varianzas del grupo completo de tiempo
#de sueño y pasos realizados.
cl_mean_sleep_comp=mean(Data$sleeptime)
cl_mean_steps_comp=mean(Data$steps)
cl_var_steps_comp=var(Data$steps)
cl_var_sleep_comp=var(Data$sleeptime)

cl_mean_sleep_comp
cl_mean_steps_comp
cl_var_steps_comp
cl_var_sleep_comp

summary(Data)

#Estas cuatro variables son las medias de una m.a.s de 200 individuos de
#de tiempo de sueño y pasos realizados y las varianzas de esas m.a.s. en 
#ambas variables.
l_i=sample(1:800, 1)
samp=sample(Data[ l_i:(l_i+199), ], 10)
mas_sleep=samp$sleeptime
mas_steps=samp$steps



cl_mean_sleep_mas=mean(mas_sleep)
cl_mean_sleep_mas
cl_mean_steps_mas=mean(mas_steps)
cl_mean_steps_mas
cl_var_sleep_mas=var(mas_sleep)
cl_var_sleep_mas
cl_var_steps_mas=var(mas_steps)
cl_var_steps_mas



#------------------------TAREA 1.2  && TAREA 1.3--------------------------------


#Utilizaremos la funcion groupwiseMean de la libreria rcompanion para obtener
#la media de pasos y sueño de ambos grupos.

steps_mean_by_sex=rcompanion::groupwiseMean(data=Data, var="steps", group="Sex")
steps_mean_m=steps_mean_by_sex[1,3]
steps_mean_m
steps_mean_v=steps_mean_by_sex[2,3]
steps_mean_v

sleeptime_mean_by_sex=rcompanion::groupwiseMean(data=Data, var="sleeptime", group="Sex")
sleeptime_mean_m=sleeptime_mean_by_sex[1,3]
sleeptime_mean_m
sleeptime_mean_v=sleeptime_mean_by_sex[2,3]
sleeptime_mean_v

#Al mismo tiempo, utilizaremos un bucle para obtener el tiempo de sueño y
#los pasos realizados por ambos grupos 

vector_steps_m=vector(length = 5053)
vector_sleeptime_m=vector(length = 5053)
vector_steps_v=vector(length = 4947)
vector_sleeptime_v=vector(length = 4947)
contador_m=1
contador_v=1
for(i in 1:10000){
  if(Data[i,3]=="M"){
    vector_steps_m[contador_m]=Data[i,6]
    vector_sleeptime_m[contador_m]=Data[i,5]
    contador_m=contador_m+1
  }
  else{
    vector_steps_v[contador_v]=Data[i,6]
    vector_sleeptime_v[contador_v]=Data[i,5]
    contador_v=contador_v+1
  }
}

#Ahora obtendremos las varianzas de las dos variables evaluadas de ambos grupos

var_steps_m=var(vector_steps_m)
var_steps_m
var_sleeptime_m=var(vector_sleeptime_m)
var_sleeptime_m

var_steps_v=var(vector_steps_v)
var_steps_v
var_sleeptime_v=var(vector_sleeptime_v)
var_sleeptime_v


#Obtenemos muestras de 200 individuos de ambos grupos para obtener la media y
#varianza de las dos variables.

mas_steps_m=sample(vector_steps_m, 200)
mas_sleeptime_m=sample(vector_sleeptime_m, 200)

mean_steps_mas_m=mean(mas_steps_m)
mean_steps_mas_m
mean_sleeptime_mas_m=mean(mas_sleeptime_m)
mean_sleeptime_mas_m

var_steps_mas_m=var(mas_steps_m)
var_steps_mas_m
var_sleeptime_mas_m=var(mas_sleeptime_m)
var_sleeptime_mas_m


mas_steps_v=sample(vector_steps_v, 200)
mas_sleeptime_v=sample(vector_sleeptime_v, 200)

mean_steps_mas_v=mean(mas_steps_v)
mean_steps_mas_v
mean_sleeptime_mas_v=mean(mas_sleeptime_v)
mean_sleeptime_mas_v

var_steps_mas_v=var(mas_steps_v)
var_steps_mas_v
var_sleeptime_mas_v=var(mas_sleeptime_v)
var_sleeptime_mas_v



#------------------------- Parte 2: INTERVALOS----------------------------------




#----------------------------TAREA 2.1-----------------------------------------

#Tenemos que obtener los intervalos de confianza para la media, varianza y 
#proporción al nivel de 90%, 95% y 99% para las variables sleeptime y steps
#de una muestra de 200 individuos. Para ello, utilizaremos las muestras que se
#obtuvieron anteriormente, mas_sleep y mas_steps.


#Intervalos de confianza con varianza desconocida para la media de pasos
ic_90_steps_unk=t.test(samp$steps, conf.level = 0.9)
ic_90_steps_unk$conf.int

ic_95_steps_unk=t.test(samp$steps, conf.level = 0.95)
ic_95_steps_unk$conf.int

ic_99_steps_unk=t.test(samp$steps, conf.level = 0.99)
ic_99_steps_unk$conf.int

#Intervalos de confianza con varianza conocida para la media de pasos
ic_90_steps=ic_known_var(samp$steps, cl_var_steps_mas, 0.1)
ic_90_steps

ic_95_steps=ic_known_var(samp$steps, cl_var_steps_mas, 0.05)
ic_95_steps

ic_99_steps=ic_known_var(samp$steps, cl_var_steps_mas, 0.01)
ic_99_steps

#Intervalos de confianza con varianza desconocida para la media de sueño
ic_90_sleeptime_unk=t.test(samp$sleeptime, conf.level = 0.9)
ic_90_sleeptime_unk$conf.int

ic_95_sleeptime_unk=t.test(samp$sleeptime, conf.level = 0.95)
ic_95_sleeptime_unk$conf.int

ic_99_sleeptime_unk=t.test(samp$sleeptime, conf.level = 0.99)
ic_99_sleeptime_unk$conf.int

#Intervalos de confianza con varianza conocida para la media de sueño
ic_90_sleeptime=ic_known_var(samp$sleeptime, cl_var_sleep_mas, 0.1)
ic_90_sleeptime

ic_95_sleeptime=ic_known_var(samp$sleeptime, cl_var_sleep_mas, 0.05)
ic_95_sleeptime

ic_99_sleeptime=ic_known_var(samp$sleeptime, cl_var_sleep_mas, 0.01)
ic_99_sleeptime


#Intervalos de confianza para la varianza de una sola muestra para la variable
#steps

ic_90_steps_var=stests::var.test(samp$steps, conf.level=0.9)
ic_90_steps_var$conf.int

ic_95_steps_var=stests::var.test(samp$steps, conf.level=0.95)
ic_95_steps_var$conf.int

ic_99_steps_var=stests::var.test(samp$steps, conf.level=0.99)
ic_99_steps_var$conf.int

#Intervalos de confianza para la varianza de una sola muestra para la variable
#sleeptime

ic_90_sleeptime_var=stests::var.test(samp$sleeptime, conf.level=0.9)
ic_90_sleeptime_var$conf.int

ic_95_sleeptime_var=stests::var.test(samp$sleeptime, conf.level=0.95)
ic_95_sleeptime_var$conf.int

ic_99_sleeptime_var=stests::var.test(samp$sleeptime, conf.level=0.99)
ic_99_sleeptime_var$conf.int


#Intervalos de confianza para la proporción de una muestra.

BinomCI(table(samp$Sex)[1], length(samp$Sex), conf.level = 0.90,
        method = "clopper-pearson")

BinomCI(table(samp$Sex)[1], length(samp$Sex), conf.level = 0.95,
        method = "clopper-pearson")

BinomCI(table(samp$Sex)[1], length(samp$Sex), conf.level = 0.99,
        method = "clopper-pearson")



#------------------------------TAREA 2.2----------------------------------------


#Tenemos que obtener los intervalos de confianza para la media, varianza y 
#proporción al nivel de 90%, 95% y 99% para las variables sleeptime y steps
#para poblaciones generales.

#Intervalos de confianza para la media de steps

replicas_steps= boot(data=samp$steps, mean.boot, R=5000)
replicas_steps

boot.ci(replicas_steps, conf=0.90)
boot.ci(replicas_steps, conf=0.95)
boot.ci(replicas_steps, conf=0.99)

#Intervalos de confianza para la media de sleeptime

replicas_sleeptime= boot(data=samp$sleeptime, mean.boot, R=5000)
replicas_sleeptime

boot.ci(replicas_sleeptime, conf=0.90)
boot.ci(replicas_sleeptime, conf=0.95)
boot.ci(replicas_sleeptime, conf=0.99)

#Intervalos de confianza para la varianza de steps


replicas_steps_var=boot(data=samp$steps, var.boot, R=5000)
replicas_steps_var

boot.ci(replicas_steps_var, conf=0.9)
boot.ci(replicas_steps_var, conf=0.95)
boot.ci(replicas_steps_var, conf=0.99)

#Intervalos de confianza para la varianza de sleeptime


replicas_sleeptime_var=boot(data=samp$sleeptime, var.boot, R=5000)
replicas_sleeptime_var

boot.ci(replicas_sleeptime_var, conf=0.9)
boot.ci(replicas_sleeptime_var, conf=0.95)
boot.ci(replicas_sleeptime_var, conf=0.99)









#------------------------------TAREA 3------------------------------------------

#Ahora tenemos que estimar los intervalos de confianza para la diferencia de 
#medias, la razón de varianzas, diferencia de proporciones, al nivel de confianza
#del 90%, 95% y 99%, para las variables Data$Sleeptime y Data$steps agrupados por
#la variable Data$Sex. Para ello utilizaremos los vectores que contenian los 
#valores de esas variables separados por el sexo de los individuos.


#Intervalos de confianza para la diferencia de medias de pasos con varianzas 
#desconocidas e iguales

ic_90_dif_mean_steps_unk=t.test(x=vector_steps_m, y=vector_steps_v, paired=FALSE,
                         var.equal = TRUE, conf.level = 0.90)
ic_90_dif_mean_steps_unk

ic_95_dif_mean_steps_unk=t.test(x=vector_steps_m, y=vector_steps_v, paired=FALSE,
                         var.equal = TRUE, conf.level = 0.95)
ic_95_dif_mean_steps_unk

ic_99_dif_mean_steps_unk=t.test(x=vector_steps_m, y=vector_steps_v, paired=FALSE,
                            var.equal = TRUE, conf.level = 0.99)
ic_99_dif_mean_steps_unk


#Intervalos de confianza para la diferencia de medias de pasos con varianzas
#conocidas

ic_90_dif_mean_steps=ic_dif_mean_known_var(x=vector_steps_m, y=vector_steps_v,
                                           n1=length(vector_steps_m), 
                                           n2=length(vector_steps_v),
                                           conf=0.9)
ic_90_dif_mean_steps

ic_95_dif_mean_steps=ic_dif_mean_known_var(x=vector_steps_m, y=vector_steps_v,
                                           n1=length(vector_steps_m), 
                                           n2=length(vector_steps_v),
                                           conf=0.95)
ic_95_dif_mean_steps

ic_99_dif_mean_steps=ic_dif_mean_known_var(x=vector_steps_m, y=vector_steps_v,
                                           n1=length(vector_steps_m), 
                                           n2=length(vector_steps_v),
                                           conf=0.99)
ic_99_dif_mean_steps


#Intervalos de confianza para la diferencia de medias de sueño con varianzas 
#desconocidas e iguales

ic_90_dif_mean_sleeptime_unk=t.test(x=vector_sleeptime_m, y=vector_sleeptime_v,
                             paired=FALSE, var.equal = TRUE, conf.level = 0.90)
ic_90_dif_mean_sleeptime_unk

ic_95_dif_mean_sleeptime_unk=t.test(x=vector_sleeptime_m, y=vector_sleeptime_v,
                                paired=FALSE, var.equal = TRUE, conf.level = 0.95)
ic_95_dif_mean_sleeptime_unk

ic_99_dif_mean_sleeptime_unk=t.test(x=vector_sleeptime_m, y=vector_sleeptime_v,
                                paired=FALSE, var.equal = TRUE, conf.level = 0.99)
ic_99_dif_mean_sleeptime_unk


#Intervalos de confianza para la diferencia de medias de sueño con varianzas
#conocidas

ic_90_dif_mean_sleeptime=ic_dif_mean_known_var(x=vector_sleeptime_m,
                                               y=vector_sleeptime_v,
                                               n1=length(vector_sleeptime_m), 
                                               n2=length(vector_sleeptime_v),
                                               conf=0.9)
ic_90_dif_mean_sleeptime

ic_95_dif_mean_sleeptime=ic_dif_mean_known_var(x=vector_sleeptime_m,
                                               y=vector_sleeptime_v,
                                               n1=length(vector_sleeptime_m), 
                                               n2=length(vector_sleeptime_v),
                                               conf=0.95)
ic_95_dif_mean_sleeptime

ic_99_dif_mean_sleeptime=ic_dif_mean_known_var(x=vector_sleeptime_m,
                                               y=vector_sleeptime_v,
                                               n1=length(vector_sleeptime_m), 
                                               n2=length(vector_sleeptime_v),
                                               conf=0.99)
ic_99_dif_mean_sleeptime

#Intervalos de confianza para la razón de varianzas de pasos 

ic_raz_var_steps_90=var.test(vector_steps_m, vector_steps_v, conf.level = 0.90)
ic_raz_var_steps_90

ic_raz_var_steps_95=var.test(vector_steps_m, vector_steps_v, conf.level = 0.95)
ic_raz_var_steps_95

ic_raz_var_steps_99=var.test(vector_steps_m, vector_steps_v, conf.level = 0.99)
ic_raz_var_steps_99

#Intervalos de confianza para la razón de varianzas de pasos 

ic_raz_var_sleeptime_90=var.test(vector_sleeptime_m, vector_sleeptime_v, conf.level = 0.9)
ic_raz_var_sleeptime_90

ic_raz_var_sleeptime_95=var.test(vector_sleeptime_m, vector_sleeptime_v, conf.level = 0.95)
ic_raz_var_sleeptime_95

ic_raz_var_sleeptime_99=var.test(vector_sleeptime_m, vector_sleeptime_v, conf.level = 0.99)
ic_raz_var_sleeptime_99

#Intervalos de confianza para la proporción de la población

table(Data$Sex)

BinomCI(table(Data$Sex)[1], length(Data$Sex), conf.level = 0.90,
        method = "clopper-pearson")

BinomCI(table(Data$Sex)[1], length(Data$Sex), conf.level = 0.95,
        method = "clopper-pearson")

BinomCI(table(Data$Sex)[1], length(Data$Sex), conf.level = 0.99,
        method = "clopper-pearson")


#Intervalos de confianza para la diferencia de medias en poblaciones normales 
#para la variable steps


dif_mean_steps_gen_90=ic_dif_mean_known_var(Data$steps[Data$Sex=="M"], 
                                            Data$steps[Data$Sex=="V"],
                                            length(Data$steps[Data$Sex=="M"]),
                                            length(Data$steps[Data$Sex=="V"]),
                                            0.9)
dif_mean_steps_gen_90

dif_mean_steps_gen_95=ic_dif_mean_known_var(Data$steps[Data$Sex=="M"], 
                                            Data$steps[Data$Sex=="V"],
                                            length(Data$steps[Data$Sex=="M"]),
                                            length(Data$steps[Data$Sex=="V"]),
                                            0.95)
dif_mean_steps_gen_95


dif_mean_steps_gen_99=ic_dif_mean_known_var(Data$steps[Data$Sex=="M"], 
                                            Data$steps[Data$Sex=="V"],
                                            length(Data$steps[Data$Sex=="M"]),
                                            length(Data$steps[Data$Sex=="V"]),
                                            0.99)
dif_mean_steps_gen_99


#Intervalos de confianza para la diferencia de medias en poblaciones normales
#para la variable sleeptime

dif_mean_sleeptime_gen_90=ic_dif_mean_known_var(Data$sleeptime[Data$Sex=="M"], 
                                            Data$sleeptime[Data$Sex=="V"],
                                            length(Data$sleeptime[Data$Sex=="M"]),
                                            length(Data$sleeptime[Data$Sex=="V"]),
                                            0.9)
dif_mean_sleeptime_gen_90

dif_mean_sleeptime_gen_95=ic_dif_mean_known_var(Data$sleeptime[Data$Sex=="M"], 
                                                Data$sleeptime[Data$Sex=="V"],
                                                length(Data$sleeptime[Data$Sex=="M"]),
                                                length(Data$sleeptime[Data$Sex=="V"]),
                                                0.95)
dif_mean_sleeptime_gen_95

dif_mean_sleeptime_gen_99=ic_dif_mean_known_var(Data$sleeptime[Data$Sex=="M"], 
                                                Data$sleeptime[Data$Sex=="V"],
                                                length(Data$sleeptime[Data$Sex=="M"]),
                                                length(Data$sleeptime[Data$Sex=="V"]),
                                                0.99)
dif_mean_sleeptime_gen_99


#Intervalos de confianza para la diferencia de medias con varianzas desconocidas
#pero iguales en poblaciones normales para la variable steps

dif_mean_steps_gen_90_unk=t.test(Data$steps[Data$Sex=="M"],
                                     Data$steps[Data$Sex=="V"],
                                     paired=FALSE, var.equal = TRUE,
                                     conf.level = 0.90)
dif_mean_steps_gen_90_unk

dif_mean_steps_gen_95_unk=t.test(Data$steps[Data$Sex=="M"],
                                 Data$steps[Data$Sex=="V"],
                                 paired=FALSE, var.equal = TRUE,
                                 conf.level = 0.95)
dif_mean_steps_gen_95_unk

dif_mean_steps_gen_99_unk=t.test(Data$steps[Data$Sex=="M"],
                                 Data$steps[Data$Sex=="V"],
                                 paired=FALSE, var.equal = TRUE,
                                 conf.level = 0.99)
dif_mean_steps_gen_99_unk



#Intervalos de confianza para la diferencia de medias con varianzas desconocidas
#pero iguales en poblaciones normales para la variable sleeptime

dif_mean_sleeptime_gen_90_unk=t.test(Data$sleeptime[Data$Sex=="M"],
                                     Data$sleeptime[Data$Sex=="V"],
                                     paired=FALSE, var.equal = TRUE,
                                     conf.level = 0.90)
dif_mean_sleeptime_gen_90_unk

dif_mean_sleeptime_gen_95_unk=t.test(Data$sleeptime[Data$Sex=="M"],
                                     Data$sleeptime[Data$Sex=="V"],
                                     paired=FALSE, var.equal = TRUE,
                                     conf.level = 0.95)
dif_mean_sleeptime_gen_95_unk

dif_mean_sleeptime_gen_99_unk=t.test(Data$sleeptime[Data$Sex=="M"],
                                     Data$sleeptime[Data$Sex=="V"],
                                     paired=FALSE, var.equal = TRUE,
                                     conf.level = 0.99)
dif_mean_sleeptime_gen_99_unk



#Intervalos de confianza para la razon de varianzas de la variable steps

raz_var_steps_gen_90=var.test(Data$steps[Data$Sex=="M"],
                              Data$steps[Data$Sex=="V"], conf.level = 0.90)
raz_var_steps_gen_90

raz_var_steps_gen_95=var.test(Data$steps[Data$Sex=="M"],
                              Data$steps[Data$Sex=="V"], conf.level = 0.95)
raz_var_steps_gen_95

raz_var_steps_gen_99=var.test(Data$steps[Data$Sex=="M"],
                              Data$steps[Data$Sex=="V"], conf.level = 0.99)
raz_var_steps_gen_99



#Intervalos de confianza para la razon de varianzas de la variable sleeptime

raz_var_sleeptime_gen_90=var.test(Data$sleeptime[Data$Sex=="M"],
                              Data$sleeptime[Data$Sex=="V"], conf.level = 0.90)
raz_var_sleeptime_gen_90

raz_var_sleeptime_gen_95=var.test(Data$sleeptime[Data$Sex=="M"],
                              Data$sleeptime[Data$Sex=="V"], conf.level = 0.95)
raz_var_sleeptime_gen_95

raz_var_sleeptime_gen_99=var.test(Data$sleeptime[Data$Sex=="M"],
                              Data$sleeptime[Data$Sex=="V"], conf.level = 0.9)
raz_var_sleeptime_gen_99






















