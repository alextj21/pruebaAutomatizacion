# language:es
@compraProductoRegistro
Característica: realizar compra de producto Registro
  yo como usuario quiero registrarme, ingresar al menu de productos y realizar una compra

  Antecedentes: crear registro usuario
    Dado que ingreso a la tienda y selecciono crear cuenta

  Esquema del escenario: compra registro producto exitoso
    Y ingreso los datos solicitados en los formularios
      | correo   | nombre   | apellido   | contraseña   | dia   | mes   | año   | empresa   | direccion   | direccion2   | ciudad   | estado   | codigoPostal   | informacion   | telefono   | telefonoMovil   |
      | <correo> | <nombre> | <apellido> | <contraseña> | <dia> | <mes> | <año> | <empresa> | <direccion> | <direccion2> | <ciudad> | <estado> | <codigoPostal> | <informacion> | <telefono> | <telefonoMovil> |
    Y hago click en el boton registro
    Y realizo la compra del producto
    Entonces valido que aparezca la aprovacion de la compra

    Ejemplos: 
      | correo                | nombre    | apellido | contraseña | dia | mes     | año  | empresa | direccion | direccion2 | ciudad       | estado  | codigoPostal | informacion | telefono | telefonoMovil | usuario          |
      | alex_xo27fd@gmail.com | alejandro | roldan   |     123456 |   2 |January  | 2021 | prueba  | cra 24    | cra 33     | BARRANQUILLA | Alabama |        11011 | prueba      |  2563214 |   31024569874 | alejandro roldan |
  