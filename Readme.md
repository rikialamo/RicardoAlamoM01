# RicardoAlamoM02

## Ejercicio 2 de Desarrollo deaplicaciones multiplataformas


Crea la segunda pantalla en el mismo proyecto(investiga como). Deberás realizar un lógin tal y como se muestra en el figma, en el caso de que el usuario y contraseña sean admin en el TextView de abajo saldrá “Usuario y contraseña correcta” en caso contrario “Usuario o contraseña incorrecta”. Investigar por vuestra cuenta como iniciar la aplicación en la Activity login. Pista → se configura en el AndroidManifest.xml. Una vez que iniciemos el login deberá pasar a la pantalla del contador pasando el dato del nombre del usuario (aparecerá en la parte baja de la pantalla de contador donde ponía “by nombre_alumno”).(ACTUALIZADO)


![Captura de Pantalla 1](img/capturaProfesor.png)

Esta es la imagen dada por el por el profesor a traves de la aplicació de figma

 
![main_aplication](img/captura.png)

 
Y esta es la panatlla de la aplicación hecha por mi, en ella vemos que las 4 partes principlales están presentes, manteniendo proporciones unas con otras.

1. Texto.
    - utilizo un textView para poner esa palabra, la fuente la saco de figma y este objeto está asociado al borde superior.
1. TextBox.
    - utilizo dos TextInputLayout para introducir los datos de usuario y contraseña.
1. Boton.
    - El boton al ser pulsado lanza un setOnClickListener que contiene una función que combruebe el usuario y la contraseña, si fueran correctos llama a la segunda ventana poniendo en la parte inferior el nombre de usuario