#language:es
@Login
Característica: Inicio de Sesion
  yo como usuario inicio sesion en la pagina

  Esquema del escenario: login exitoso
    Dado que ingreso a la tienda  y selecciono iniciar sesion
    Y realizo el login con los datos requeridos
      | correo   | clave   |
      | <correo> | <clave> |
      
    Cuando doy click en iniciar sesion
    Entonces valido que aparezca mi nombre de usuario
      | usuario   |
      | <usuario> |
      
    Ejemplos: 
      | correo            | clave  | usuario      |
      | arivera@gmail.com | 123456 | alex rivera  |
