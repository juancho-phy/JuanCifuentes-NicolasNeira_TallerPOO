public abstract class Vehiculo {
    private String placa;
    private String marca;
    private String modelo;
    private int anio;
    private double precioBase;

    public Vehiculo() {
    }

    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnio() {
        return anio;
    }

    public double getPrecioBase() {
        return precioBase;
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

        this.placa = placa;
    }

    public void setMarca(String marca) {
        if (marca == null || marca.isBlank()){
            System.out.println("Error: la marca no puede estar vacia.\nIntentelo de nuevo.");
            return;
        }

        this.marca = marca;
    }

    public void setModelo(String modelo) {
        if (modelo == null || modelo.isBlank()){
            System.out.println("Error: el modelo no puede estar vacio.\nIntentelo de nuevo.");
            return;
        }

        this.modelo = modelo;
    }

    /**En año agregasmos una libreria para obtener el año actual y asi no dejar estatico el año en 2026 */
    public void setAnio(int anio) {
        int anioActual = java.time.Year.now().getValue();

        if (anio < 1990 || anio > anioActual) {
            System.out.println("Error: el año debe estar entre 1990 y el año actual.\nIntentelo de nuevo.");
            return;
        }

        this.anio = anio;
    }

    public void setPrecioBase(double precioBase) {
        if (precioBase <= 0){
            System.out.println("Error: el precio base del vehiculo debe ser mayor que 0.\nIntentelo de nuevo.");
            return;
        }

        this.precioBase = precioBase;
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
        return "Placa: " + placa +
                " | Marca: " + marca +
                " | Modelo: " + modelo +
                " | Año: " + anio +
                " | Precio base: $" + precioBase;
    }


}
