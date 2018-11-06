package aplicacao;

import javax.swing.*;

public class App {

    public static void main(String [] args){

        String nome;

        nome = JOptionPane.showInputDialog("Qual seu nome?");

        String msg = "Olá Java! Tudo bem? \n meu nome é: " + nome;

        JOptionPane.showMessageDialog(null, msg);
    }

}
