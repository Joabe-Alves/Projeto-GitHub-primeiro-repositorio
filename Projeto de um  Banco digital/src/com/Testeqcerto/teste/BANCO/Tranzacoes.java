package com.Testeqcerto.teste.BANCO;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

abstract interface Tranzacoes {

  default String saquev(float valor, double sald){

     String returtxt = "                     BANCO FX                    \n\n\n";
           returtxt += "_________________________________________________\n";
           returtxt += "                   Comprovante                   \n";
           returtxt += "_________________________________________________\n \n";


           returtxt += "          Retirou - R$ " + valor + "\n\n";

     returtxt += "Saldo  - R$ " + sald;

     System.out.println(returtxt);
     return  returtxt;
 }



   default String depositoV(float valor, double salt){

     String returtxt = "==================== BANCO FX ===================\n\n\n";
           returtxt += "_________________________________________________\n";
           returtxt += "                   Comprovante                   \n";
           returtxt += "_________________________________________________\n \n";


           returtxt += "Entrou  - R$" + valor + "\n\n";

     returtxt += "Saldo  - R$ " + salt;

     System.out.println(returtxt);
     return  returtxt;
 }



   default String transfV(float valor, Conta_c titular){

     String returtxt = "==================== BANCO FX ===================\n";
           returtxt += "_________________________________________________\n";
           returtxt += "           Comprovante de Transferência          \n";
           returtxt += "_________________________________________________\n \n";

     returtxt += "TRANSFERENCIA FEITA A: \n";

           returtxt += "Nome " + titular.titular.getNome() + "\n";
           returtxt += "CPF " +  titular.titular.getCPF().substring(0,5) + "\n\n";
           returtxt += "Agência " +  titular.getAgencia() + "\n";
           returtxt += "Numero da conta " +  titular.getNconta() + "\n\n";


      DecimalFormat f = new DecimalFormat("R$ 0");

     returtxt += "No valor de: \n";
           returtxt +=  DecimalFormat.getCurrencyInstance().format(valor) + "\n\n";
      String d = new SimpleDateFormat("dd/MM/yyyy").format(Calendar.getInstance().getTime());
      String t = new SimpleDateFormat("hh:mm:ss").format(Calendar.getInstance().getTime());


              returtxt += "data da movimentação -  " + d + " ás " + t;
     System.out.println(returtxt);
     return  returtxt;
 }



}
