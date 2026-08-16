public abstract class Vehiculo {
    private String Placa;
    private String Marca;
    private String Modelo;
    private int Anio;
    private double PrecioBase;

    public Vehiculo() {
    }

    public String getPlaca() {
        return Placa;
    }

    public String getMarca() {
        return Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public int getAnio() {
        return Anio;
    }

    public double getPrecioBase() {
        return PrecioBase;
    }


/** Aprovechar al crear los setters para cuando sean requeridos ya tener integradas sus condiciones
 * PLACA: no puede estar vacia
 * MARCA: no puede estar vacia
 * MODELO: no puede estar vacia
 * ANIO: entre 1990 y el año actual
 * PrecioBase debe ser mayot a 0*/

    public void setPlaca(String placa) {
        if (placa == null || placa.isBlank()){
            System.out.println("Error: la placa no puede estar vacia.\nIntentelo de nuevo (ej: ABC123)");
            return;
        }

        Placa = placa;
    }

    public void setMarca(String marca) {
        if (marca == null || marca.isBlank()){
            System.out.println("Error: la marca no puede estar vacia.\nIntentelo de nuevo.");
            return;
        }

        Marca = marca;
    }

    public void setModelo(String modelo) {
        if (modelo == null || modelo.isBlank()){
            System.out.println("Error: el modelo no puede estar vacio.\nIntentelo de nuevo.");
            return;
        }

        Modelo = modelo;
    }

    /**En año agregasmos una libreria para obtener el año actual y asi no dejar estatico el año en 2026 */
    public void setAnio(int anio) {
        int anioActual = java.time.Year.now().getValue();

        if (anio < 1990 || anio > anioActual) {
            System.out.println("Error: el año debe estar entre 1990 y el año actual.\nIntentelo de nuevo.");
            return;
        }

        Anio = anio;
    }

    public void setPrecioBase(double precioBase) {
        if (precioBase <= 0){
            System.out.println("Error: el precio base del vehiculo debe ser mayor que 0.\nIntentelo de nuevo.");
            return;
        }

        PrecioBase = precioBase;
    }

    public Vehiculo(String placa, String marca, String modelo, int anio, double precioBase) {
        setPlaca(placa);
        setMarca(marca);
        setModelo(modelo);
        setAnio(anio);
        setPrecioBase(precioBase);
    }

    /**Agregamos el metodo abstracto para que hereden todas las clases hijas, pero lo dejamos vacio,
     * ya que cada una lo hace de manera diferente */

    public abstract double calcularPrecioFinal();



    public String mostrarFicha() {
        return "Placa: " + Placa +
                " | Marca: " + Marca +
                " | Modelo: " + Modelo +
                " | Año: " + Anio +
                " | Precio base: $" + PrecioBase;
    }


}
