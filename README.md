# RESTfulWS
Evidencia para la materia Computación en Java Avanzado.

## Instalación
**Requerimientos**
- Git
- Eclipse
- Java EE
- Maven
- Apache Tomcat

**Pasos**
1. Clonar repositorio `git clone https://github.com/CesarCavazos97/RESTfulWS`  
2. Abrir proyecto desde Eclipse
3. Limpiar y construir proyecto
4. Clic derecho al proyecto en Eclipse.
5. Seleccionar `Exportar -> Archivo WAR`.
6. Acceder al manager tomcat `http://localhost:{PORT}/manager` con credenciales de usuario con rol `admin-gui`
7. Seleccionar archivo `.war` creado anteriormente
8. Desplegar

## Uso
A continuacion se explican los métodos disponibles para esta aplicación correspondientemente a cada ruta de acceso:

**Ruta api/v1/**  
1. **GET**: Lista los recursos disponibles.
2. **OPTIONS**: Documentación.

**Ruta api/v1/file**  
1. **GET**: Descarga archivo en base al parámetro path. 
```
api/v1/file/?path=
```
2. **POST**: Sube algún archivo con los parámetros name, dir y file.
```
api/v1/file/ name="imagen.jpg" dir="/Files" file@/Users/User/Downloads/imagen.jpg --form
```
3. **DELETE**: Elimina un archivo mediante el parámetro path.
```
api/v1/file/?path=
```
4. **OPTIONS**: Documentación.

**Ruta api/v1/directory**  
1. **GET**: Lista los archivos de un directorio con el parámetro dir. 
```
api/v1/directory/?dir=
```
2. **OPTIONS**: Documentación.

**Ruta api/v1/notify**  
1. **GET**: Lista las notificaciones enviadas.
2. **POST**: Envía una notificación en base a los parámetros subject, message, toAddress y ccAddress.
```
api/v1/notify subject="Test" message="Test Mensaje" toAddress="ej@contoso.com" ccAddress="ej2@contoso.com"
```
3. **OPTIONS**: Documentación.

**Ruta api/v1/user**  
1. **GET**: Lista los usuarios.
2. **POST**: Crea un usuario mediante los parámetros username, password y fullName.
```
api/v1/user username="user" password="pass" fullName="Cesar Cavazos"
```
3. **OPTIONS**: Documentación.

**Ruta api/v1/user/{username}**  
1. **GET**: Muestra la información del usuario.
2. **PUT**: Actualiza la información del usuario mediante los parámetros username, password y fullName.
```
api/v1/user/user username="user" password="pass" fullName="Cesar Cavazos"
```
3. **DELETE**: Elimina al usuario.
4. **OPTIONS**: Documentación.

## Créditos
- **2683453** Cesar Mauricio Cavazos Rodriguez

## Licencia
El código está disponible bajo la licencia **GNU GPL-3.0**