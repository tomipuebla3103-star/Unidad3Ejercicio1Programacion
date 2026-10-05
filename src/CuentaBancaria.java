public class CuentaBancaria {
    private String titular;
    private String numeroCuenta;
    private double saldoActual;

    public CuentaBancaria(String titular,String numeroCuenta){
        this.titular=titular;
        this.numeroCuenta=numeroCuenta;
        if (saldoActual >= 0){
            this.saldoActual = saldoActual;
        }else{
            this.saldoActual = 0;
        }
    }

    public String getTitular(){
        return titular;
    }

    public void  setTitular(String titular) {

        this.titular = titular;
    }

    public String getNumeroCuenta(){
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta){
        this.numeroCuenta=numeroCuenta;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    public void retirarSaldo(double monto){
        if(monto <= 0){
            System.out.println("Ingresa un monto mayor a 0.");

        }else if(monto > saldoActual) {
            System.out.println("No se puede retirar el saldo.");

        }else {
            saldoActual -= monto;
            System.out.println("El retiro fue exitoso.");
        }
    }

    public void depositarMonto(double monto){
        if(monto <= 0){
            System.out.println("El monto debe ser mayor a 0");
        }else{
            saldoActual = saldoActual + monto;
       }
    }

    public void mostrarInformación(){
        System.out.println("Titula: "+ titular );
        System.out.println("Numero de cuenta: "+ numeroCuenta);
        System.out.println("Saldo actual: "+ saldoActual);
    }
}
