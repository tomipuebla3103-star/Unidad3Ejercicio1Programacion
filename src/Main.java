//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    CuentaBancaria cuenta = new CuentaBancaria("Alex olivares",
            "5484248100515");

    cuenta.setSaldoActual(1000);
    cuenta.retirarSaldo(575);
    cuenta.depositarMonto(200);
    cuenta.mostrarInformación();
}
