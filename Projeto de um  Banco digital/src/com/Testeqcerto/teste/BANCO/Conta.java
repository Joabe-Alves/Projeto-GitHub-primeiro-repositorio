package com.Testeqcerto.teste.BANCO;


import java.util.Random;

 abstract class Conta implements Tranzacoes {

    public enum Tipo {corrente, poupança}

    protected Tipo tipo;
    protected double saldo;
    protected static String nconta;
    protected static String agencia;
    protected static Pessoa titular;





    public void Transferencia(Conta_c contaD , float valor ){
    saldo -= valor;
    contaD.saldo += valor;
    transfV(valor,contaD);

      System.out.println("       \n\n");
  }


  public void saque(float valor){
   saldo -= valor;

     saquev(valor,saldo);
      System.out.println("       \n\n");
   }


    public void deposito(float valor){
      saldo += valor;

     depositoV(valor, saldo);
      System.out.println("       \n\n");
    }




    public double getSaldo() {
        return saldo;
    }

    public static String getNconta() {
        return nconta;
    }

    public static String getAgencia() {
        return agencia;
    }

    public Tipo getTipo() {
        return tipo;
    }



 }
