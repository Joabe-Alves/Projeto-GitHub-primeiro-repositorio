package com.Testeqcerto.teste.BANCO;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;

public class Conta_c extends Conta {



    public Conta_c(Pessoa Titular, Tipo TIPO) {
        super.nconta = l;
        super.tipo = TIPO;
        super.titular = Titular;
        if (TIPO == Tipo.corrente){
        super.agencia = "103";}else{super.agencia = "167";}

    }


        Random random = new Random();
        int o = random.nextInt(1000000,5000000);
        String l = String.valueOf(o);


    @Override
    public String toString() {
        String returtxt = "__________________________________________________\n";

        returtxt += "CONTA [{Nome " + Conta_c.titular.getNome() + " -- "+ "CPF" + " ***" + Conta_c.titular.getCPF().substring(0,5) + "*** " + " -- \n " + "Agência " +  Conta_c.getAgencia() + " -- " + "Numero da conta " +  Conta_c.getNconta() +  " --" + "Tipo " + getTipo() + "\n\n";



        return  returtxt;
    }
}
