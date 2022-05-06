package com.Testeqcerto.teste;

import com.Testeqcerto.teste.BANCO.*;


public class main {


    public static void main(String[] args) {

        Pessoa Joabe = new Pessoa("jOABE", "12313");
        Conta_c cont1 = new Conta_c(Joabe, Conta_c.Tipo.corrente);

        Pessoa Jon = new Pessoa("jOÂO", "1235413");
        Conta_c cont2 = new Conta_c(Jon, Conta_c.Tipo.corrente);


        cont1.deposito(20000);

        cont2.deposito(20400);

        cont2.Transferencia(cont1,3400);



        Banco adim = new Banco();
        adim.contas.add(cont1);
        adim.contas.add(cont2);

        System.out.println(adim.contas.get(0));

    }

}
