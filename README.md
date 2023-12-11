# ProyectoPrograDou
Numero del Grupo: 6

Nombres de los integrantes:
Hugo Osvaldo Flores Velasquez || Joaquin Rodrigo Hernandez Espinoza

Enunciado:
Este es un sistema de reserva de asientos de autobús que permite a los clientes elegir y reservar asientos de forma conveniente. Los clientes pueden seleccionar fácilmente los datos de su viaje a través de una interfaz amigable que les permite seleccionar si desean realizar un viaje de solo ida o de ida y vuelta, la fecha de cada viaje, y los puntos de partida y destino, tomando luego esta información para buscar posibles alternativas de autobuses entre las cuales el cliente pueda elegir la que más le convenga. Una vez elegidos el o los autobuses, el sistema le permite al cliente visualizar una representación gráfica de los asientos dentro del autobús, mostrándoles los asientos disponibles, asientos ocupados, y asientos premium (más caros), permitiéndoles seleccionar todos los que desee ocupar. El sistema finalmente entrega los pasajes a reservar, mostrando información detallada sobre cada uno, el punto de partida, destino, número de asiento, categoría (Semi cama o Salón Cama), piso (1 o 2), fecha del viaje y costo del pasaje, además de un breve resumen del total de pasajes a reservar y el costo total de todos ellos. Si el cliente cambia de parecer en algún momento, el sistema siempre permite volver atrás manteniendo guardados los datos ingresados hasta ese momento para no tener que ingresarlos nuevamente, solo cuando el cliente recibe el resumen de la reserva y oprime en confirmar, la reserva queda realizada y ya no se podrá cambiar, terminando el proceso.

Diagrama de clases UML:


Diagrama de casos de uso:
![image](https://github.com/SonodaPopin/ProyectoPrograDou/assets/146202298/05f9e092-1167-4525-8e83-753f4513249f)

Patrón de diseño utilizado:
Nuestro sistema emplea el patrón Builder para crear múltiples instancias de Tickets y Asientos dentro de panelTickets y panelBus respectivamente, las principales ventajas de utilizar este patrón son primero, que nos permiten crear fácilmente grandes cantidades de estas clases las cuales requieren de muchos parámetros para crearse, sin tener que reescribir cada parámetro cada vez que se quiera crear una nueva clase. La segunda ventaja es que empleando Random dentro de nuestros builders, hemos creado un sistema para rellenar algunos de los parámetros de las clases con datos creados aleatoriamente cada vez que se crean usando builder, haciendo que el programa se vea mucho más realista ya que siempre entrega opciones nuevas y diferentes cada vez que se realiza una búsqueda.

Captura de pantalla de la Interfaz
![image](https://github.com/SonodaPopin/ProyectoPrograDou/assets/146202298/d3807201-9af1-496f-94ce-71e02a8ee43f)

![image](https://github.com/SonodaPopin/ProyectoPrograDou/assets/146202298/cf90a126-2be9-4d0e-aefd-12bed268111e)

![image](https://github.com/SonodaPopin/ProyectoPrograDou/assets/146202298/c582ee07-809e-4177-8012-498655a6ff83)

Deciciones tomadas:
La primera desición importante que tomamos como equipo fue nuestra manera de dividir el trabajo, esto vino como un aprendizaje por nuestros resultados en la tarea 3, la cual fue un completo desastre debido a nuestra mala organización la cual llevaba a que cada quien hacía el código a su manera, y cuando uno quería usar el código del otro, este no le era de utilidad y tenía casi que reescribirlo completamente, perdiendo muchísimo tiempo. Por ello esta vez nos hemos dividido las tareas cada uno especializándose en ciertos aspectos del proyecto de manera que no nos "pisáramos" sino más bien complementaramos mutuamente, modelo que nos ha hecho trabajar de una manera muy eficiente al no estar perdiendo tiempo en entender o cambiar el código del otro.

La segunda desición importante vino luego de una converzación con el profesor Hecht, el cual, al aclararnos algunas dudas sobre nuestro diagrama de casos de uso, nos hizo darnos cuenta de que nuestro programa no hacía exactamente lo que se pedía en el enunciado inicial, ya que el enunciado se refería a que esta fuera una aplicación para ser usada por un miembro de la empresa para poder reservar asientos, mientras que nosotros la creamos para ser usada directamente por el cliente. Finalmente, debido a que ya teníamos construido nuestro plan de trabajo y avanzado bastante en la interfaz gráfica, decidimos mantener nuestro plan inicial de proyecto y centrarnos en hacerlo lo mejor posible para la funcionalidad que le habíamos propuesto.

La tercera desición importante es mas bien el no haber tomado otra desición, pues, debido a que nuestro equipo está conformado por estudiantes pasando por un duro fin de semestre, el tiempo no estaba de nuestro lado, por lo que se nos pasó por la mente la opción de simplificar el sistema eliminando ciertas opciones que teníamos  planeadas para hacerlo más básico y por ende más corto, opciones como el crear Tickets y Asientos aleatorios, el poder elegir pasaje de ida y vuelta, y el poder elegir múltiples asientos a la vez no serían parte del sistema si hubieramos tomado esta desición, pero finalmente, decidimos que queríamos entregar nuestro sistema con todas las funciones que teníamos planeadas a pesar de que esto significara un retraso en la fecha de entrega.

Problemas encontrados:

Como se ha mencionado recién en nuestra tercera desición importante, un problema encontrado fue que quizás nuestro proyecto era demasiado ambicioso para el poco tiempo y poca experiencia que teníamos, al final la solución a este problema fue, como ya se ha mencionado, sacrificar la puntualidad para entregar un trabajo de mayor calidad.

Otro problema recurrente fue la dificultad para consultar a un referente, pues nuestro grupo pasó por el contratiempo las primeras semanas de que el referente que se nos había asignado, era alguien que no conocíamos ya que ninguno de los dos era parte de su clase práctica, esto fue de gran impacto negativo ya que ese fue el periodo donde más trabajamos en el proyecto debido a que luego teníamos un gran número de certámenes por delante. Eventualmente intentamos cambiar de referente a la clase de los miércoles, pero ya era demasiado tarde, habíamos avanzado tanto como pudimos y tuvimos que frenar el desarrollo abruptamente por los certámenes, los cuales imposibilitaron asistir a dichas clases a hablar con la referente o desarrollar más el proyecto. Finalmente en la última semana, habiendo terminado los certámenes el día miércoles 5, reanudamos el desarrollo del proyecto el día jueves 6, e intentamos ese mismo día contactar a la referente vía teams, pero lamentablemente, a día de hoy 11 de diciembre, no hemos recibido ninguna respuesta de su parte, por lo que no nos queda más que entregar el proyecto como está.

Un último problema que no es tan problema sino más bien una observación, es que a medida que avanzábamos en el código, íbamos ganando experiencia con la cual créabamos código cada véz más avanzado y eficiente, esto nos hacía darnos cuenta de que partes de nuestro código hecho anteriormente se veía bastante "arcaico", es decir, desorganizado, ineficiente, o con partes innecesarias o desaprovechadas. Algunas de estas cosas las cambiamos, pero en general, decidimos no cambiar mucho el código hecho anteriormente, ya que como estaba hecho cumplía con su funcionalidad, y no disponíamos de tanto tiempo como para empezar a cambiarlo todo. Las partes más destacables que podrían hacerse diferente están dentro del package de panelPrincipal, que contiene varias componentes que podrían haberse retutilizado en lugar de crear nuevas, así como todo el package Numeros y Ciudades, los cuales se podrían haber creado de otra forma sin tantas clases que hacen casi lo mismo, pero eso ya quedará como aprendizaje a futuro.
