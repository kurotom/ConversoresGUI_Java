# Conversor

Conversores utilizando lenguaje Java y Swing.

* Conversor de moneda (moneda fija chilena, CLP).

* Conversor de temperatura.


## Requisitos:

El convertidor de moneda debe:

- Convertir de la moneda de tu país a Dólar
- Convertir de la moneda de tu país  a Euros
- Convertir de la moneda de tu país  a Libras Esterlinas
- Convertir de la moneda de tu país  a Yen Japonés
- Convertir de la moneda de tu país  a Won sul-coreano


Recordando que también debe ser posible convertir inversamente, es decir:

- Convertir de Dólar a la moneda de tu país
- Convertir de Euros a la moneda de tu país
- Convertir de Libras Esterlinas a la moneda de tu país
- Convertir de Yen Japonés a la moneda de tu país
- Convertir de Won sul-coreano a la moneda de tu país



# Componentes

## Menu conversor

Este cuadro de diálogo debe permitir al usuario escoger entre las opciones de conversión, según los requisitos solo es necesario hacer un conversor de moneda pero en caso que desees implementar otras funciones en la foto anexada podemos ver una opción de menú con otras funciones.

* Utilice la clase **JOptionPane** de la biblioteca *Javax*.
* Utilice el método **showInputDialog** como un objeto para presentar más de una opción.


![](menu-conversion.png)


## Input usuario

Este cuadro de diálogo debe permitir al usuario ingresar el valor o la cantidad de dinero que desea convertir, por ejemplo: el usuario ingresará la cantidad de Pesos Colombianos que quiere convertir a Dólares

Recuerda que este input debe estar validado y no debe aceptar otro tipo de caracteres que no sean del tipo numéricos.

* Utilice el método **showInputDialog** para que el usuario inserte un valor.


![](2.png)


### Alerta de valor no válido

En la tarjeta Cuadro de diálogo - Entrada de valor especificamos que no deben permitirse otro tipo de caracteres que no sean números, ahora si el usuario introduce letras o caracteres especiales y presiona ok debe ser mostrado un mensaje apuntando que el valor no es válido.

* Utilice el método **showMessageDialog** para validar la entrada para que no se acepten caracteres no numéricos.


## Lista de opciones

Este cuadro de dialogo debe permitir al usuario escoger entre las diferentes monedas a la que desea convertir su dinero.

* Utilice la clase **JOptionPane** de la biblioteca *Javax*.
* Utilice el método **showInputDialog** como un objeto para presentar más de una opción para la conversión.


![](opciones-conversion.png)


## Mostrar valor convertido

Es hora de mostrar para nuestro usuário el valor de la conversión realizada.

* Utilice el método **showMessageDialog** para mostrar el valor de la conversión.


![](3.png)



## Preguntar si quiere continuar

Nuestro cliente desea que nuestro usuario decida que desea hacer después de realizar la primera conversión. Presentamos las siguientes opciones:

- Yes: Debe llevar nuevamente a nuestro usuario a menu principal para escoger una opción de conversión.
- No: Debe mostrar un mensaje de "Programa Finalizado"
- Cancel: Debe mostrar un mensaje de "Programa Finalizado"

* Utilice el método **showConfirmDialog** para preguntar al usuario si desea continuar usando el programa.


![](image.png)



## Finalizacion del programa

Como lo definimos en la tarjeta Cuadro de diálogo - ¿Desea continuar? si el usuario selecciona la opción No o Cancel utilice **showMessageDialog** para que pueda cerrar el programa con el mensaje "Programa Terminado".



## Extra - Opcional

Después de que el usuario haga clic en continuar en el programa, presente el cuadro de opciones de conversión para que pueda verificar otro valor en una moneda diferente.

Realiza más de un programa de conversión, además de moneda, puede hacer de temperatura, kilometraje, años luz, entre otros, deja volar tu imaginación.



