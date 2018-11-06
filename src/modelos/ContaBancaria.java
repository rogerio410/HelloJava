package modelos;

public class ContaBancaria {

    private static int contadorNumero = 1;

    int numero;
    String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldo){
        this.numero = ContaBancaria.proximoNumero();
        this.titular = titular;
        this.saldo = saldo;
    }

    public ContaBancaria(String titular){
        this(titular, 0);
    }

    private static int proximoNumero(){
        return ContaBancaria.contadorNumero++;
    }

    public void depositar(double valor){
        this.saldo += valor;
    }

    public boolean sacar(double valor){
        if (this.temSaldoSuficiente(valor)){
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    public static boolean transferir(ContaBancaria origem, ContaBancaria destino, double valor){
        return origem.transferir(destino, valor);
    }

    public boolean transferir(ContaBancaria contaDestino, double valor){
        if (this.sacar(valor)){
            contaDestino.depositar(valor);
            return true;
        }
        return false;
    }

    private boolean temSaldoSuficiente(double valor) {
        return this.obterSaldo() >= valor;
    }

    public double obterSaldo(){
        return this.saldo;
    }

    @Override
    public String toString() {
        return "ContaBancaria [" +
                "numero=" + numero +
                ", titular='" + titular + '\'' +
                ", saldo=" + obterSaldo() +
                ']';
    }
}
