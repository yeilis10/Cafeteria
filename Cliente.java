public class Cliente {
    // 1. Atributos privados
    private int id;
    private String nombre;
    private String telefono;

    // 2. Constructor
    public Cliente(int id, String nombre, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    // 3. Getters y Setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    
    // ... otros métodos ...
}
