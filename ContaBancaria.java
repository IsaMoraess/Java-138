/*Exercício 2: Sistema de Contas Bancárias (Sobrecarga de Método)
Objetivo: Criar uma classe ContaBancaria que permite diferentes formas de depósito.
                                    Passos:
1.Defina a classe ContaBancaria com atributos private String numeroConta 
e private double saldo.
2.Crie o método public void depositar(double valor) para depósitos simples.
3.Sobrecarga o método depositar para permitir um depósito com descrição: 
public void depositar(double valor, String descricao).
4.Crie um método public double getSaldo() para retornar o saldo.
5.Teste a classe no método main, realizando depósitos e exibindo o saldo.*/

public class ContaBancaria{
    //ATRIBUTOS PRIVADOS
    private String numeroConta;
    private double saldo;

    //CONSTRUTOR
    public ContaBancaria(String numeroConta){
        this.numeroConta = numeroConta;
        this.saldo = 0.0; //Inicializa o saldo em zero
    }
    
    //MÉTODO PARA DEPÓSITO SIMPLES
    public void depositar(double valor){
        saldo += valor;  //Adiciona o valor ao saldo
    }
    
    //MÉTODO PARA DEPÓSITO COM DESCRIÇÃO
    public void depositar(double valor, String descricao){//SOBRECARGA
        saldo += valor;  //Adiciona o valor ao saldo
        System.out.println("Depósito de R$ " + valor + " - " + descricao + " realizado com sucesso.");
    }
    
    //MÉTODO PARA RETORNAR O SALDO
    public double getSaldo(){
        return saldo;
    }
}
