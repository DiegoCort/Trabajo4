
package CUENTA;

public class CuentaBancaria {
    
/**
 * ATRIBUTOS DE LA CUENTA
 */
    
    protected float saldo, tAnual, cMensual=0;
    protected int nConsignaciones=0, nRetiros=0;
    
    /**
     * CONTRUCTOR DE CLASE CON PARAMETROS DE LA CUENTA
     * @param saldo 
     * @param tAnual 
     */
    
    public CuentaBancaria(float saldo, float tAnual){
        
        this.saldo=saldo;
        this.tAnual=tAnual;    
    }
    
    /**
     * 
     * @param c CANTIDAD A CONSIGNAR
     */
    public void Consignar(float c){ //METODO PARA CONSIGNAR
        
        saldo=saldo+c;//SE ACTUALIZA EL SALDO 
        nConsignaciones=nConsignaciones+1;//SE ACTUALIZA NUMERO DE CONSIGNACIONES
    } 
    
    /**
     * 
     * @param c CANTIDAD A RETIRAR
     */
    public void Retirar(float c){//METODO PARA RETIRAR
        float saldoN =saldo-c;
        if(saldoN>=0){//SI LA CANTIDAD ES MENOR AL SALDO, EL RETIRO NO SE HACE
            saldo-=c;
            nRetiros=nRetiros+1;        
        }else{
            System.out.println("Fondos insuficientes");
        }
    }
    
    public void CalcularInteres(){//METODO PARA CALCULAR INTERES MENSUAL
        
        float tMensual=tAnual/12;   //tasa anual a mesual
        float iMensual=saldo*tMensual;//INTERES MENSUAL
        saldo+=iMensual;
    }
    
    public void ExtractoMensual(){//METODO PARA CALCULAR LOS EXTRACTOS MENSUALES
        
        saldo-=cMensual;
        CalcularInteres();
    }
    
}
