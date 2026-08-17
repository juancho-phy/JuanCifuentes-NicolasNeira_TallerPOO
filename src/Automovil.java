public class Automovil extends Vehiculo{
    private int numeroPuertas;
    private String tipoCombustible;


    /** Al poner los set de los dos atributos automáticamente se validan al crear el objeto*/
    public Automovil(String placa, String marca, String modelo, int anio, double precioBase, int numeroPuertas, String tipoCombustible) {
        super(placa, marca, modelo, anio, precioBase);

        setNumeroPuertas(numeroPuertas);
        setTipoCombustible(tipoCombustible);
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        if (numeroPuertas < 2 || numeroPuertas>5){
            System.out.println("Error: la cantidad de puertas debe ser entre 2 y 5.\nIntentelo de nuevo.");
            return;
        }

        this.numeroPuertas = numeroPuertas;
    }

    public void setTipoCombustible(String tipoCombustible) {
        switch (tipoCombustible){
            case "Gasolina":
            case "Diesel":
            case "Electrico":
                this.tipoCombustible = tipoCombustible;
                break;
            default:
                System.out.println("Error: tipo de com bustible no valido.\nIntentelo de nuevo con alguno de estos tipos\n  (Gaolina, Diesel o Electrico)");
        }
    }

    /**Aquí aplicamos polimorfismo con el metodo abstracto de la clase Vehículo
     * el default esta de más, ya que desde los setters ya validan la información */
    @Override
    public double calcularPrecioFinal() {

        switch (tipoCombustible){
            case "Gasolina":
            case "Diesel":
                return getPrecioBase() * 1.08;

            case "Electrico":
                return getPrecioBase() * 1.04;

            default:
                return getPrecioBase();
        }

    }
}
