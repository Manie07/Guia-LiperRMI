# Aplicación Distribuida con RMI y LipeRMI  

## Descripción  

Este proyecto implementa una aplicación distribuida cliente-servidor en **Java** utilizando **Remote Method Invocation (RMI)** con la librería **LipeRMI**. Su propósito es calcular el **Índice de Masa Corporal (IMC)** de forma remota.  

## Componentes del Proyecto  

El sistema se divide en tres partes principales:  

1. **Librería IMC:** Contiene las clases necesarias para el intercambio de datos y la definición de interfaces remotas.  
2. **Servidor:** Provee los servicios de cálculo del IMC y atiende solicitudes de los clientes.  
3. **Cliente:** Contiene una interfaz gráfica que permite a los usuarios ingresar datos y obtener el resultado desde el servidor.  

## Tecnologías Utilizadas  

- **Java SE (Standard Edition)**  
- **Remote Method Invocation (RMI)**  
- **LipeRMI** (Librería que facilita el uso de RMI en Java)  
- **NetBeans, Eclipse o IntelliJ** (IDE para desarrollo)  

## Instalación  

1. Instalar el **JDK** y configurar las variables de entorno.  
2. Descargar e instalar un **IDE para Java**.  
3. Agregar la **librería LipeRMI** al proyecto.  

## Pasos de Implementación  

### 1️⃣ Creación del Proyecto Librería IMC  

1. Crear un nuevo proyecto de tipo **Librería**.  
2. Implementar una **clase de datos** para almacenar los resultados del IMC.  
3. Definir una **interfaz remota** que exponga los métodos de cálculo del IMC.  
4. Exportar la librería como **archivo JAR**.  

### 2️⃣ Desarrollo del Servidor  

1. Crear un proyecto **Java Application** para el servidor.  
2. Agregar las dependencias de **LipeRMI** y la librería IMC.  
3. Implementar la **clase Servidor**, encargada de recibir peticiones y calcular el IMC.  
4. Implementar la clase de cálculo del IMC.  
5. Ejecutar el servidor.  

### 3️⃣ Desarrollo del Cliente  

1. Crear un proyecto **Java Application** para el cliente.  
2. Agregar las dependencias de **LipeRMI** y la librería IMC.  
3. Diseñar la **GUI (VentanaPrincipal)** para ingresar los datos.  
4. Implementar la conexión del cliente con el servidor.  
5. Ejecutar la aplicación cliente.  

## Ejecución del Sistema  

1. **Iniciar el Servidor:**  
   ```sh
   java -jar Servidor.jar

2. **Iniciar el Servidor:**  
   ```sh
   java -jar Cliente.jar

3. Ingresar los datos en la interfaz gráfica y calcular el IMC.
4. Visualizar los resultados obtenidos desde el servidor.


