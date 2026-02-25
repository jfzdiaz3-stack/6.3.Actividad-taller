# 6.3.Actividad-taller

1. ¿Por qué he elegido composición entre Vehiculo y Reparacion?
He utilizado composición entre Vehiculo y Reparacion porque una reparación no puede existir sin un vehículo.
El historial de reparaciones forma parte del propio vehículo y depende completamente de él.
Si el vehículo deja de existir, sus reparaciones también desaparecen.
Esto encaja con la composición porque:
- La relación es fuerte
- La vida de la parte depende del todo
- La reparación no tiene sentido por sí sola


2. ¿Por qué no he usado agregación?
La agregación implica que las partes pueden existir independientemente del todo.
En este caso, una reparación no puede existir sin un vehículo asociado, así que la agregación no sería adecuada.


3. ¿Qué ventaja tiene usar la interfaz Especialista?
Usar la interfaz Especialista aporta varias ventajas importantes:
- Permite polimorfismo: cualquier clase que implemente Especialista puede realizar reparaciones.
- Reduce el acoplamiento: el taller no depende de una clase concreta, solo de un comportamiento (reparar()).
- Facilita ampliaciones futuras: se pueden crear nuevos tipos de especialistas sin modificar el código existente.
- Sigue el principio de programar contra interfaces, lo que hace el diseño más flexible y mantenible.

Si quieres, puedo ayudarte a revisar tu README completo para que quede perfecto o añadirle una estructura más profesional.
