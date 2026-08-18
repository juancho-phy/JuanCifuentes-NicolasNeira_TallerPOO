public class Main {


    /**Objetos de prueba para confirmar funcionalidad de clases creadas por ahora */
    public static void main(String[] args) {

        Automovil autoGasolina = new Automovil(
                "ABC123",
                "Mazda",
                "3",
                2022,
                30000000,
                4,
                "Gasolina"
        );

        Automovil autoElectrico = new Automovil(
                "XYZ789",
                "BYD",
                "Dolphin",
                2024,
                30000000,
                4,
                "Electrico"
        );

        System.out.println("Precio automóvil gasolina: $" + autoGasolina.calcularPrecioFinal());
        System.out.println("Precio automóvil eléctrico: $" + autoElectrico.calcularPrecioFinal());

        Automovil autoPrueba = new Automovil(
                "ABC123",
                "Mazda",
                "3",
                2022,
                30000000,
                8,
                "Gasolina"
        );
    }
}