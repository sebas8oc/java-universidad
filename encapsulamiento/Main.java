void main() {
    CuentaBancaria cuenta1 = new CuentaBancaria();

    cuenta1.setNumeroCuenta("1014977544");
    cuenta1.setTitular("Sebastian Otero");
    cuenta1.setSaldo(1000000);
    cuenta1.mostrarInformacion();
    cuenta1.Depositar(100000);
    cuenta1.mostrarInformacion();
}
//
