#Escoger imagen de docker para una aplicación
FROM openjdk:17-jdk-alpine

# Definir el directorio de trabajo dentro del contenedor
WORKDIR /app

# Copiar los archivos del proyecto al contenedor
# El primer . se refiere al directorio actual en el host, y el segundo . es
# el directorio de trabajo en el contenedor

COPY target/*.jar app.jar

# Exponer el puerto de la aplicación
EXPOSE 8080


#Se utiliza el comando ENTRYPOINT para especificar 
#el comando que se ejecutará al iniciar el contenedor
ENTRYPOINT ["java", "-jar", "app.jar"]