package tipoCuenta;
import CUENTA.CuentaBancaria;

/**
 * CLASE QUE HEREDA DE CUENTA BANCARIA
 * @author 57324
 */
public class CuentaCorriente extends CuentaBancaria {
    
    float sGiro;//ATRIBUTO  QUE DEFINE CUANDO EL SALDO DE LA CUENTA ES NEGATIVO (SOBREGIRO)
    
    /**
     * CONSTRUCTO DE LA CLASE CUENTACORRIENTE
     * @param saldo
     * @param tAnual 
     */
    public CuentaCorriente(float saldo, float tAnual) {
        super(saldo, tAnual);//CONSTRUCTOR DE LA CLASE PADRE
        sGiro=0;
    }
    
    public void Retirar(float c){//METODO PARA RETIRAR
        
        float s1=saldo-c;//SE GUARDA EL SALDO TEMPORAL (s1) PARA REVISAR SI HAY UN SOBREGIRO
        if(s1<0){
            sGiro=sGiro-s1;
            saldo=0;
        }else{
            super.Retirar(c);//METODO DE LA CLASE PADRE
        }
    }
    
    public void Consignar(float c){//METODO PARA CONSIGNAR
        
        float s2=sGiro-c;
        if(sGiro>0){//SI HAY SOBREGIRO SE LE RETA A LA CANTIDAD CONSIGNADA
            if(s2>0){//SI EL SALDO TEMPORAL(s2) ES MAYOR QUE 0 SE LIVERA EL SOBREGIRO
                sGiro=0;
                saldo=s2;
            }else{//SINO SURGE EL SOBREGIRO
                sGiro=sGiro-s2;
                saldo=0;
            }
        }else{
            super.Consignar(c);//METODO DE LA CLASE PADRE
        }
    }
    
    public void ExtractoMensual(){
        
        super.ExtractoMensual();//METODO DE LA CLASE PADRE
    }
    
    public void ImprimirCuentaCorriente(){
        
        System.out.println("Saldo = $"+ saldo);
        System.out.println("Comision Mensual = $"+ cMensual);
        System.out.println("Numero de Transacciones = "+ (nConsignaciones+nRetiros));
        System.out.println("Valor del Sobregiro = $"+ (nConsignaciones+nRetiros));
    }
    
}
