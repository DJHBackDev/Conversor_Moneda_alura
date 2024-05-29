# Conversor de Monedas

Este proyecto es una aplicación Java de consola que permite convertir dólares estadounidenses (USD) a diversas monedas extranjeras utilizando la API de ExchangeRate-API.

## Características

- Convierte de dólares estadounidenses (USD) a las siguientes monedas:
    - Pesos Argentinos (ARS)
    - Pesos Chilenos (CLP)
    - Euros (EUR)
    - Libras Esterlinas (GBP)
    - Yenes Japoneses (JPY)
    - Reales Brasileños (BRL)
    - Dólares Canadienses (CAD)
    - Dólares Australianos (AUD)
    - Yuanes Chinos (CNY)
    - Rupias Indias (INR)

## Prerrequisitos

- Java 8 o superior
- Biblioteca JSON (`org.json`)

## Instalación

### Usando Maven

Si estás utilizando Maven para gestionar tus dependencias, añade la siguiente dependencia a tu `pom.xml`:

```xml
<dependency>
    <groupId>org.json</groupId>
    <artifactId>json</artifactId>
    <version>20210307</version>
</dependency>
```

## Sin Maven
Si no estás usando Maven, puedes descargar el JAR de la biblioteca JSON desde [aqui](https://mvnrepository.com/artifact/org.json/json) y agregarlo manualmente a tu proyecto.

## Uso
Clona este repositorio o descarga los archivos del proyecto.
Asegúrate de que la biblioteca JSON está incluida en tu classpath.
Compila y ejecuta el programa principal.

Ejecución del Programa
Para ejecutar el programa, abre una terminal y navega al directorio del proyecto. Luego, compila y ejecuta el archivo Principal.java:


<code>
javac Principal/Principal.java <br>
java Principal.Principal <br>
</code>

El programa te presentará un menú con las opciones de conversión disponibles. Selecciona una opción e ingresa la cantidad en dólares que deseas convertir. El programa mostrará el monto convertido en la moneda seleccionada.


## Ejemplo
````
******************************************
1) de dolar a pesos argentinos
2) de dolar a pesos chilenos
3) de dolar a euros
4) de dolar a libras esterlinas
5) de dolar a yenes japoneses
6) de dolar a reales brasileños
7) de dolar a dólares canadienses
8) de dolar a dólares australianos
9) de dolar a yuanes chinos
10) de dolar a rupias indias
11) Salir
******************************************
````
Seleccione una opción: 1

Ingrese la cantidad en dólares a cambiar: 100

Monto convertido: 9300.0 ARS

## Contribución
Las contribuciones son bienvenidas.
Si deseas mejorar este proyecto, por favor, sigue estos pasos:

*Haz un fork del repositorio.*

*Crea una nueva rama (git checkout -b feature/nueva-caracteristica).*

*Realiza los cambios necesarios y haz commit (git commit -am 'Agregar nueva característica').*

*Sube los cambios a tu fork (git push origin feature/nueva-caracteristica).*

*Abre un Pull Request.*