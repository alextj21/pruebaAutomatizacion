# language:es
@compraProductoLogin
Característica: realizar compra de producto 
  yo como usuario quiero iniciar sesion, ingresar al menu de productos y realizar una compra

  Antecedentes: login exitoso
    Dado que ingreso a la tienda  y selecciono iniciar sesion

  Esquema del escenario: compra login producto exitoso
    Y realizo el login con los datos requeridos
      | correo   | clave   |
      | <correo> | <clave> |
    Cuando doy click en iniciar sesion
    Y realizo la compra del producto
    Entonces valido que aparezca la aprobacion de la compra
      |validar  |
      |<validar>|

    Ejemplos: 
      | correo             | clave    |validar                            |
      | arivera@gmail.com  | 123456   |Your order on My Store is complete.|
      
