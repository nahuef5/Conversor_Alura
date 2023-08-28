# Challenge ONE | Java | Conversor de Moneda y Temperatura
#challengeoneconversorlatam5

### ¡Les doy la bienvenida!
### Proyecto solución del desafío "Challenge ONE Back End - Java" Conversor de Moneda y Temperatura con Java.

####  [Página del desafío](https://www.aluracursos.com/challenges/oracle-one-back-end/conversordemoneda) 

## Contenido de este repositório
---
Código con la solución al desafío del conversor de monedas y temperatura.
Se diseñaron tres ventanas. La ventana principal inicia el programa al ejecutarse. Dentro del código, se puede encontrar la clase que representa a esta ventana, llamada "ConverterWindow".

Desde esta clase, se redirige a la ventana de temperatura o moneda, dependiendo de la elección realizada en el JCheckBox. Tanto la ventana de Moneda como la de temperatura (representadas por las clases "Coin" y "Temperature" respectivamente en el programa) permiten realizar conversiones deseadas.

En ambas ventanas, encontrará una casilla de texto donde podrá ingresar un monto. Esta casilla solo acepta valores numéricos de hasta 12 caracteres. Puede utilizar tanto el punto como la coma para separar decimales, ya que internamente se realizará la conversión de la coma a punto para representar los números decimales. Una vez ingresado el monto, puede elegir el tipo de conversión mediante un conjunto de botones de opción (JRadioButton). Al hacer clic en uno de ellos, la respuesta se mostrará automáticamente en un JLabel en la parte inferior de la ventana. Si no se ingresan valores numéricos, se mostrará un mensaje de error.

Además, las tres ventanas cuentan con botones (implementados con JLabel) para cerrar el programa. En el caso de la ventana "ConverterWindow", también hay un botón para minimizar y otro para avanzar a la siguiente ventana. Las otras dos ventanas tienen un botón que permite retroceder.

Las tres ventanas no pueden ser ampliadas y se pueden reposicionar en la pantalla según sea necesario.

Por ultimo, el programa cuenta con una clase que contiene métodos estáticos que son los encargados de realizar las operaciones de conversión.
