FROM amazoncorretto:17.0.9-al2023

# Establece el directorio de trabajo
WORKDIR /app

COPY target/inventory-0.0.1.jar /app/app.jar

# Exponer el puerto de la aplicación
EXPOSE 9092

CMD ["java", "-jar", "app.jar"]