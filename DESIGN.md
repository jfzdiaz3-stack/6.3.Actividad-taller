classDiagram
    class Cliente {
        -String nombre
        -String telefono
        +Cliente(nombre, telefono)
        +getNombre() String
        +anadirVehiculo(Vehiculo v) void
    }

    class Vehiculo {
        <<abstract>>
        #String matricula
        #String modelo
        +Vehiculo(matricula, modelo)
        +getMatricula() String
        +getModelo() String
    }

    class Coche {
        -int numeroPuertas
        +Coche(matricula, modelo, numeroPuertas)
        +getNumeroPuertas() int
    }

    class Moto {
        -String cilindrada
        +Moto(matricula, modelo, cilindrada)
        +getCilindrada() String
    }

    class Reparacion {
        -String fecha
        -String descripcion
        -double coste
        +Reparacion(fecha, descripcion, coste)
        +generarFactura() void
    }

    class Mecanico {
        -String nombre
        -String especialidad
        +Mecanico(nombre, especialidad)
        +reparar(Reparacion r) void
        +getNombre() String
    }

    class Taller {
        -String nombre
        +Taller(nombre)
        +asignarReparacion(Mecanico m, Reparacion r) void
    }

    <<Interface>> Especialista
    class Especialista {
        <<Interface>>
        +reparar(Reparacion r) void
    }

    class Factura {
        -int idFactura
        -double total
        -String fechaEmision
        +Factura(idFactura, reparacion)
        +imprimirFactura() void
    }

    Cliente "1" --o "*" Vehiculo : posee >
    Vehiculo <|-- Coche
    Vehiculo <|-- Moto
    Vehiculo "1" --* "0..*" Reparacion : tiene >
    Reparacion "1" -- "1" Factura : genera >
    Mecanico ..|> Especialista
    Taller ..> Mecanico : usa
    Mecanico "1" --o "*" Reparacion : realiza
