## Entrega 5. Formulario

Entregad un diseño y los programas correspondientes.

Vamos a crear un formulario sencillo para inscribirnos en una competición. Datos que vamos a pedir:

Nombre (30 carácteres)

Apellidos (60 carácteres)

DNI (10 carácteres)

Teléfono

Dirección (120 carácteres)

Código postal (5 carácteres)

Ciudad (30 carácteres)

Número de federado (hasta 6 carácteres)

Checkbox para indicar el sexo M/F

Campo password (10 carácteres)

y otro campo password con la confirmación del password (Sí, tienen que ser JPasswordField)

Lista desplegable con las opciones: arbitro, entrenador, tirador y director

Lista desplegable con las opciones: sable, espada y florete

Checkbox: competición individual

Checkbox: competición por equipos

Botón guardar (que se limita a mostrarlo por la pantalla del shell)



    Mejora1: comprueba los formatos de cada campo

    Mejora2: almacena los datos en un fichero, cada dato en una línea, por ejemplo

    Mejora3: comprueba que los dos passwords introducidos son iguales

    Extra1: un participante puede ser tirador, entrenador y director a la vez, pero no árbitro y otro papel. Modifica la ventana para que se pueda indicar eso

    Extra2: añade un campo lista desplegable llamado Club. Podrá tener los valores "Club de Esgrima Azahar", "Club Mediterráneo", "Sala de Armas de Valencia" y "Guerreros de Alicante".

    Extra3: si un participante está en un equipo, que exista la posibilidad de indicar en qué equipo (nombre e identificador numérico) y
            que se vean el resto de componentes (como máximo 5, uno de ellos el capitán) con la información: número de federado, nombre y apellidos. Sugiero una nueva ventana.

    Extra4: añade el escudo de la Real Federación de Esgrima de la Comunidad Valenciana