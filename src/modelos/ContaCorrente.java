package modelos;

public class ContaCorrente extends ContaBancaria {

    private double limite;

    public ContaCorrente(String titular, double limite){
        super(titular);
        this.limite = limite;
    }

    @Override
    public double obterSaldo() {
        return super.obterSaldo() + this.limite;
    }
}
