#language:es
@Registro
Característica: crear registro usuario
  yo como usuario quiero ir a la pagina de inicio y crear mi cuenta

  Esquema del escenario: Creacion usuario exitoso
    Dado que ingreso a la tienda y selecciono crear cuenta
    Y ingreso los datos solicitados en los formularios
      | correo   | nombre   | apellido   | contraseña   | dia   | mes   | año   | empresa   | direccion   | direccion2   | ciudad   | estado   | codigoPostal   | informacion   | telefono   | telefonoMovil   |
      | <correo> | <nombre> | <apellido> | <contraseña> | <dia> | <mes> | <año> | <empresa> | <direccion> | <direccion2> | <ciudad> | <estado> | <codigoPostal> | <informacion> | <telefono> | <telefonoMovil> |
    Y hago click en el boton registro
    Entonces valido que aparezca mi nombre en la sesion iniciada
      | usuario   |
      | <usuario> |

    Ejemplos: 
      | correo                | nombre    | apellido | contraseña | dia | mes     | año  | empresa | direccion | direccion2 | ciudad       | estado  | codigoPostal | informacion | telefono | telefonoMovil | usuario          |
      | alex_xo99fd@gmail.com | alejandro | roldan   |     123456 |   2 |January  | 2021 | prueba  | cra 24    | cra 33     | BARRANQUILLA | Alabama |        11011 | prueba      |  2563214 |   31024569874 | alejandro roldan |
