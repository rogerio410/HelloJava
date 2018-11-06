package aplicacao;

import modelos.ContaBancaria;
import modelos.ContaCorrente;

// JAVA EH PERIGOSO D++
public class AppBanco {

//    String teste = "Teste";

    public static void main(String[] args) {

        // conta_bancaria = ContaBancaria(123, "Rogerio", 0)
        ContaBancaria contaBancaria = new ContaBancaria("Rogerio", 0);
        ContaBancaria contaBancaria2 = new ContaBancaria("Rogerio");
        ContaBancaria contaCorrente = new ContaCorrente("John", 800);


        contaBancaria.depositar(1000);
        contaCorrente.transferir(contaBancaria2, 300);
        contaCorrente.transferir(contaBancaria2, 600);
        contaBancaria.transferir(contaBancaria2, 500);

        ContaBancaria.transferir(contaCorrente, contaBancaria2, 50);

        print("Saldo: " + contaBancaria);
        print("Saldo 2: " + contaBancaria2);
        print("Saldo CC: " + contaCorrente);

//        contaBancaria.saldo += 1000; violacao de DC


    }

    static void print(String msg){
        System.out.println(msg);
    }

}
