package dam_ed04_actividad;
public class Main {

    public static void main(String[] args) {
        //Creo el método que se pide y lo llamo en el main
    	operativa_cuenta(250.00f);
    }
    //Añado el parámetro al método tipo float nombre cantidad
    public static void operativa_cuenta (float cantidad) {
    	//Cambio el nombre de la variable de miCuenta por cuenta1 en todos sitios
    	CCuenta cuenta1;
        double saldoActual;
        
        cuenta1 = new CCuenta("Antonio LÃ³pez","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}