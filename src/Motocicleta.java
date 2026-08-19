public class Motocicleta extends Vehiculo {

    private int cilindraje;

    public Motocicleta(String placa, String marca, String modelo,
                       int anio, double precioBase, int cilindraje) {

        super(placa, marca, modelo, anio, precioBase);
        setCilindraje(cilindraje);
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        if (cilindraje <= 0) {
            System.out.println("Error: el cilindraje debe ser mayor a 0.");
            return;
        }

        this.cilindraje = cilindraje;
    }

    @Override
    public double calcularPrecioFinal() {
        double precio = getPrecioBase() * 1.03;

        if (cilindraje > 500) {
            precio = precio + getPrecioBase() * 0.02;
        }

        return precio;
    }
}