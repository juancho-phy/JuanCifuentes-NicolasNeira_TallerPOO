public class CamionCarga extends Vehiculo {

    private double capacidadToneladas;

    public CamionCarga(String placa, String marca, String modelo,
                       int anio, double precioBase, double capacidadToneladas) {

        super(placa, marca, modelo, anio, precioBase);
        setCapacidadToneladas(capacidadToneladas);
    }

    public double getCapacidadToneladas() {
        return capacidadToneladas;
    }

    public void setCapacidadToneladas(double capacidadToneladas) {
        if (capacidadToneladas <= 0) {
            System.out.println("Error: la capacidad debe ser mayor a 0.");
            return;
        }

        this.capacidadToneladas = capacidadToneladas;
    }

    @Override
    public double calcularPrecioFinal() {
        double recargo = capacidadToneladas * 500000;
        double precio = getPrecioBase() * 1.05 + recargo;

        return precio;
    }
}