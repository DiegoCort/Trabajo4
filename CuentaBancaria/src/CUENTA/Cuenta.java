package CUENTA;
import java.util.*;
import tipoCuenta.CuentaAhorros;
import tipoCuenta.CuentaCorriente;
public class Cuenta {
    
    public static void main(String [] args){
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Entrando a tu cuenta de ahorros");
        System.out.print("Ingresar saldo inicial: $");
        float saldo = entrada.nextFloat();
        System.out.print("Ingrese la tasa de interes:");
        float tInteres = entrada.nextFloat();
        
        CuentaAhorros CuentaBancaria1 = new CuentaAhorros(saldo, tInteres);
        
        System.out.print("Ingresar cantidad a consignar: $");
        float cantidadC = entrada.nextFloat();
        CuentaBancaria1.Consignar(cantidadC);
        
        System.out.print("Ingrese cantidad a retirar: ");
        float cantidadR = entrada.nextFloat();
        CuentaBancaria1.Retirar(cantidadR);
        CuentaBancaria1.ExtractoMensual();
        CuentaBancaria1.ImprimiCuentaAhorros();
        
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        
        
        
    }
    
}
