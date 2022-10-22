
package tipoCuenta;
import CUENTA.CuentaBancaria;

/**
 * CLASE QUE HEREDA DE CUENTA BANCARIA
 * @author 57324
 */
public class CuentaAhorros extends CuentaBancaria {
    
    private boolean activa;//ATRIBUTO PARA DEFINIR SI ESTA O NO ACTIVA
    
    /**
     * CONSTRUCTO DE LA CLASE CUENTAAHORROS
     * @param saldo
     * @param tAnual 
     */
    public CuentaAhorros(float saldo, float tAnual) {
        super(saldo, tAnual);//CONSTRUCTOR DE LA CLASE PADRE
        if(saldo<10000){//SI EL SALDO ES MENOR A 10000 ESTA INACTIVA
            activa=false;
            System.out.println("Cuenta inactiva");
        }else{
            activa=true;
        }
    }
    
    public void Consignar(float c){//METODO PARA CONSIGNAR
        
        if(activa){//SI ESTÁ ACTIVA SE REALIZA LA CONSIGANCION
            super.Consignar(c);//METODO DE LA CLASE PADRE
        }
    }
    
    public void Retirar(float c){//METODO PARA RETIRAR
        
        if(activa){//SI ESTÁ ACTIVA SE REALIZA EL RETIRO
            super.Retirar(c);//METODO DE LA CLASE PADRE
        }
    }
    
    public void ExtractoMensual(){
        
        if(nRetiros>4){//SI EL NUMERO DE RETIROS ES MAYOR A 4 SE GENERA COMICION MENSUAL
            cMensual=cMensual+(nRetiros-4)*1000;
        }
        super.ExtractoMensual();//METODO DE LA CLASE PADRE
        if(saldo<10000){ // SE REVISA QUE EL SALDO SEA MAYOR A 10000
            activa=false;
        }
    }
    
    public void ImprimiCuentaAhorros(){//METODO PARA MOSTRAR DATOS
        System.out.println("Saldo = $"+ saldo);
        System.out.println("Comision Mensual = $"+ cMensual);
        System.out.println("Numero de Transacciones = "+ (nConsignaciones+nRetiros));
    }
    
    
}
