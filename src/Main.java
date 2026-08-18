import java.util.ArrayList;

public class Main {

    /**usamos Vehiculo en la lista aunque sea abstracto y no se pueda instanciar si se puede tener
     * referencias de tipo Vehículo para los objetos hijos*/
    public static void main(String[] args) {
        ArrayList<Vehiculo> inventario = new ArrayList<>();

        /**Creacion e integracion a la lista de los vehiculos (objetos) manualmente dentro del codigo*/
        Automovil auto1 = new Automovil(
                "BYY787",
                "Chevrolet",
                "Corsa",
                2006,
                20000000,
                4,
                "Gasolina"
        );
        agregarVehiculo(inventario, auto1);

        Automovil auto2 = new Automovil(
                "FIB244",
                "Nissan",
                "Blue Bird",
                1985,
                15000000,
                4,
                "Diesel"
        );
        agregarVehiculo(inventario, auto2);

        Motocicleta moto1 = new Motocicleta(
                "DJH29J",
                "Apache",
                "RTR",
                2020,
                10000000,
                160
        );
        agregarVehiculo(inventario, moto1);

        Motocicleta moto2 = new Motocicleta(
                "ZZY44H",
                "BMW",
                "S1000RR",
                2026,
                137000000,
                999
        );
        agregarVehiculo(inventario, moto2);

        CamionCarga camion1 = new CamionCarga(
                "KJH456",
                "Kenworth",
                "T800",
                2021,
                150000000,
                12
        );
        agregarVehiculo(inventario, camion1);

        CamionCarga camion2 = new CamionCarga(
                "NMB789",
                "Volvo",
                "FH",
                2023,
                180000000,
                15
        );
        agregarVehiculo(inventario,camion2);

        /**Aplicar funcionalidades llamando los metodos*/
        System.out.println("=== INVENTARIO AUTOMOTION S.A.S. ===");

        listarInventario(inventario);

        double total = calcularValorTotalInventario(inventario);

        System.out.println("=== VALOR TOTAL DEL INVENTARIO: $" + total + " ===");

        Vehiculo encontrado = buscarPorPlaca(inventario, "BYY789");

        if (encontrado != null) {
            System.out.println("Vehículo encontrado:");
            System.out.println(encontrado.mostrarFicha());
            System.out.println("Precio final: $" + encontrado.calcularPrecioFinal());
        } else {
            System.out.println("No se encontró ningún vehículo con esa placa.");
        }

    }

    /**Metodo para agregar vehiculos al inventario */
    public static void agregarVehiculo(ArrayList<Vehiculo> inventario, Vehiculo v){
        inventario.add(v);
    }

    /**Metodo para recorrer y mostrar ficha de los vehiculos en el Inventario*/
    public static void listarInventario(ArrayList<Vehiculo> inventario) {

        for (Vehiculo v : inventario) {

            System.out.println(v.mostrarFicha());
            System.out.println("Precio final: $" + v.calcularPrecioFinal());
            System.out.println();
        }
    }

    /**Creacion de metodo calcularValorTotalInventario que recibe la lista inventario y la recorre sumando
     * todos los resultados del metodo calcularPrecioFinal guardando y retornando la variable total*/
    public static double calcularValorTotalInventario(ArrayList<Vehiculo> inventario) {

        double total = 0;

        for (Vehiculo v : inventario) {
            total += v.calcularPrecioFinal();
        }

        return total;
    }

    /**este metodo tiene como parametro la lista y la placa, en este ultimo recibe la placa scrita cuando
     * sea llamado y se empezará a recorrer la lista buscando con cual coincide y retorna el vehiculo*/
    public static Vehiculo buscarPorPlaca(ArrayList<Vehiculo> inventario, String placa) {

        for (Vehiculo v : inventario) {

            if (v.getPlaca().equals(placa)) {
                return v;
            }
        }

        return null;
    }







}