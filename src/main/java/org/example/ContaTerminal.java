package org.example;

import java.util.Scanner;

public class ContaTerminal {
    private int numero;
    private String agencia;
    private String nomeCliente;
    private Double saldo;

    public ContaTerminal(int numero, String agencia, String nomeCliente, Double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public Double getSaldo() {
        return saldo;
    }

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número da sua conta, por favor.");
        int numeroConta = scanner.nextInt();

        System.out.println("Digite o número da sua agência, por favor.");
        String agenciaConta = scanner.next();


        System.out.println("Digite seu nome completo, por favor.");
        String nomeCliente = scanner.next();

        System.out.println("Digite o saldo da sua conta, por favor.");
        Double saldoConta = Double.parseDouble(scanner.next());

        ContaTerminal cliente = new ContaTerminal(numeroConta, agenciaConta, nomeCliente, saldoConta);

        System.out.println("Olá " + cliente.getNomeCliente() + ", seja bem-vindo(a) ao seu novo banco, agradecemos " +
                "a sua confiança em guardar seu precioso dinheiro em nossos cofres. \n Seus dados são os seguintes" +
                " Agência:" + cliente.getAgencia() + "e Conta:" + cliente.getNumero() + ". \n E seu saldo de R$:" + cliente.getSaldo()
                + " já está disponível para saque!");



    }

}
