import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nombre;
    private List<Vehiculo> vehiculos = new ArrayList<>();

    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    public void addVehiculo(Vehiculo v) {
        vehiculos.add(v);
    }
}
