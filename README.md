# Microservicios con Spring Cloud Feign

## Microservicios

- Servicio Canchas (puerto 8081)
- Servicio Reservas (puerto 8082)

## Descripción

El servicio de reservas se comunica con el servicio de canchas para verificar si una cancha existe antes de crear una reserva.


## Cambios implementados

Para lograr la comunicación entre microservicios se realizaron los siguientes cambios:

- Se agregó la dependencia de OpenFeign en el archivo pom.xml
- Se habilitó Feign en el proyecto con la anotación @EnableFeignClients
- Se creó un cliente Feign para comunicarse con el servicio de canchas
- Se modificó el servicio de reservas para validar si la cancha existe antes de crear una reserva



## Ejemplo de uso

#Buscar cancha
{
  "canchaId": 1
}

Crear una cancha:

```json
    {
        "canchaId" : 1,
        "nombreCliente": "Cachupin",
        "fecha": "2026-04-03",
        "horaInicio": "12:00",
        "horaFin": "13:30"
    }


