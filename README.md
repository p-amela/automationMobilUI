**Mobile Automation Testing with Page Object Model (POM) Using Selenium**

Este proyecto demuestra cómo automatizar pruebas móviles utilizando Selenium WebDriver con el patrón Page Object Model (POM). Las pruebas automatizadas cubren flujos como la creación de cuenta y login para una aplicación móvil. El proyecto está estructurado usando Gradle como herramienta de construcción.

**Tabla de Contenidos**

• Introducción

• Tecnologías Utilizadas

• Estructura del Proyecto

• Configuración del Proyecto

**Introducción**

Este proyecto implementa pruebas automatizadas para una aplicación móvil utilizando Selenium WebDriver y el patrón de diseño Page Object Model (POM). Las pruebas cubren escenarios comunes como:

• Creación de cuenta: Validación de la creación de una nueva cuenta de usuario.

• Login: Validación del inicio de sesión de un usuario existente.

El proyecto utiliza Gradle para la gestión de dependencias y la ejecución de pruebas.

**Tecnologías Utilizadas**

• Java: Lenguaje de programación utilizado para escribir las pruebas y la lógica de automatización.

• Selenium WebDriver: Framework utilizado para automatizar las pruebas móviles.

• Appium: Para facilitar la automatización de dispositivos móviles a través de Selenium.

• Gradle: Herramienta de construcción y gestión de dependencias utilizada en este proyecto.

• Page Object Model (POM): Patrón de diseño utilizado para separar la lógica de las pruebas de la interfaz de usuario.

**Estructura del Proyecto**

La estructura del proyecto sigue el patrón Page Object Model (POM). Aquí está la organización del proyecto:

/mobile-automation-tests

│

├── /src

│   ├── /main

│   │   └── /java

│   │       └── /pages

│   │           ├── LoginPage.java

│   │           ├── HomePage.java

│   │           ├── SignUpPage.java

│   │           └── SettingsPage.java

│   ├── /test

│   │   └── /java

│   │       └── /tests

│   │           ├── LoginTest.java

│   │           ├── SignUpTest.java

│   │           └── HomeTest.java

│   └── /resources

│       └── /drivers

│           └── appium-server-setup.json

│

├── build.gradle

└── README.md

• /pages: Contiene las clases que representan las pantallas o páginas de la aplicación (ej. LoginPage, SignUpPage).

• /tests: Contiene las clases que ejecutan las pruebas utilizando las clases del modelo POM.

• /resources: Contiene archivos de configuración como los relacionados con el servidor de Appium.

**Configuración del Proyecto**

Para configurar el proyecto y comenzar a ejecutar las pruebas, sigue estos pasos:

1\. Clonar el Repositorio

Clona el repositorio en tu máquina local:

git clone https://github.com/p-amela/automationMobilUI.git

2\. Instalar las Dependencias con Gradle

Ejecuta el siguiente comando para instalar las dependencias necesarias:

gradle build

Este comando descargará todas las dependencias necesarias para ejecutar las pruebas.

3\. Configurar el Archivo android

Antes de ejecutar las pruebas, debes configurar el archivo android para indicar el dispositivo real o virtual que se utilizará. Dirígete a la carpeta /src/resources/drivers y abre el archivo android para configurarlo.

El archivo debe contener la configuración específica del dispositivo, por ejemplo:

{

`  `"appium:deviceName": "Copy\_of\_RealmeV",  // nombre del dispositivo

`  `"appium:platformVersion": "9.0", //android version

`  `"appium:appPackage": "com.sourcey.materialloginexample",

`  `"appium:appActivity": "com.sourcey.materiallogindemo.LoginActivity",

`  `"platformName": "Android",

`  `"appium:automationName": "uiautomator2"

}

Si usas un dispositivo real, asegúrate de cambiar el deviceName al nombre del dispositivo que estés utilizando.

• Si usas un dispositivo real: Puedes obtener el nombre del dispositivo con el siguiente comando:

adb devices

• Si usas un emulador, el nombre del dispositivo podría ser algo como emulator-5554.

4\. Configurar Appium y Selenium

• Instala Appium globalmente:

npm install -g appium

• Asegúrate de que el dispositivo móvil o emulador esté configurado para la automatización.

