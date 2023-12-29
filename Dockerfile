# Imagen base con OpenJDK 17
FROM openjdk:17-alpine

# Establece el directorio de trabajo
WORKDIR /app

# Copia el JAR construido (asegúrate de que el nombre sea correcto)
COPY target/inventory-0.0.1.jar /app/app.jar

# Exponer el puerto de la aplicación
EXPOSE 8080

# Espera a que MongoDB esté disponible antes de iniciar la aplicación
CMD ["java", "-jar", "app.jar"]