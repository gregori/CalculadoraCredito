/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoracredito;

import java.util.Scanner;

/**
 *
 * @author rodrigo
 */
public class CalculadoraCredito {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numeroConta, saldoInicial, despesas,
                creditos, limiteCredito, novoSaldo;
        
        Cliente cliente;
        
        // habilita a entrada de dados pelo usuário
        Scanner entrada = new Scanner(System.in);
        /*
        Pedir o número da conta
        inserir o numero da conta
        */
        System.out.print("Informe o número da conta: ");
        numeroConta = entrada.nextInt();
        
        /*
        PEdir o saldo inicial
        inserir o saldo inciial
        */
        System.out.print("Informe o saldo inicial: ");
        saldoInicial = entrada.nextInt();
        
        /*   
        Pedir o valor das despesas
        inserir o valor das despesas
        */
        System.out.print("Informe o valor das despesas: ");
        despesas = entrada.nextInt();
        
        /*
        pedir o valor dos creditos
        inserir o valor dos creditos
        */
        System.out.print("Informe o valor dos créditos: ");
        creditos = entrada.nextInt();
        
        /*
        pedir o valor do limite de credito
        inserir o valor do limite de credito
        */
        System.out.print("Informe o limite de crédito: ");
        limiteCredito = entrada.nextInt();
        
        cliente = new Cliente(numeroConta, saldoInicial, despesas, creditos,
                        limiteCredito);
        
        // calcular o novo saldo
        novoSaldo = cliente.getNovoSaldo();
        
        // exibir o novo saldo
        System.out.printf("O novo saldo é: %d%n", novoSaldo);
        
        // se o saldo excede o limite de crédito imprime mensagem ao usuário
        if (cliente.isCreditoExcedido()) {
            System.out.println("Limite de credito excedido.");
        }
    }
    
}
