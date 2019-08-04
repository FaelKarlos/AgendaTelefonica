/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import modelo.Agenda;
import modelo.Pessoa;

/**
 *
 * @author rafael
 */
public class Principal {

    public static void main(String args[]) throws IOException {

        Scanner ler = new Scanner(System.in);
        Pessoa p = new Pessoa();
        Agenda use = new Agenda();
        int op = 1;
        while (op != 0) {
        BufferedReader inputStr;
        BufferedWriter outputStr;
        String data;
        try {
            inputStr = new BufferedReader(new FileReader("agenda.txt"));
            outputStr = new BufferedWriter(new FileWriter("agenda.txt"));

            System.out.println("Escolha uma opcao: "
                    + "\n1 - Adcionar"
                    + "\n2 - Buscar"
                    + "\n3 - Relatorio"
                    + "\n4 - Alterar"
                    + "\n5 - Excluir"
                    + "\n0 - Sair:");
            op = ler.nextInt();
            if (op == 1) {
                String nome = null, telefone = null, celular = null, endereco = null, email = null, dia = null, mes = null, ano = null;
                System.out.println("Digite o nome do contato: ");
                nome = ler.next();
                System.out.println("Digite o telefone do contato: ");
                telefone = ler.next();
                System.out.println("Digite o celular do contato: ");
                celular = ler.next();
                System.out.println("Digite o endereco do contato: ");
                endereco = ler.next();
                System.out.println("Digite o email do contato: ");
                email = ler.next();
                System.out.println("Digite o dia de nascimento do contato: ");
                dia = ler.next();
                System.out.println("Digite o mes de nascimento do contato: ");
                mes = ler.next();
                System.out.println("Digite o ano de nascimento do contato: ");
                ano = ler.next();
                p = new Pessoa(nome, telefone, celular, endereco, email, dia, mes, ano);

                use.adiciona(p);
                System.out.println("" + use.relatorio());
            } else if (op == 2) {
                System.out.println("Digite nome para busca: ");
                String nom = ler.next();
                use.consultaPorNome(nom);
            } else if (op == 3) {
                System.out.println("" + use.relatorio());
            } else if (op == 4) {
                System.out.println("Digite o nome para busca: ");
                String noal = ler.next();
                String nome = null, telefone = null, celular = null, endereco = null, email = null, dia = null, mes = null, ano = null;
                System.out.println("Digite o nome do contato: ");
                nome = ler.next();
                System.out.println("Digite o telefone do contato: ");
                telefone = ler.next();//ler.next();
                System.out.println("Digite o celular do contato: ");
                celular = ler.next();
                System.out.println("Digite o endereco do contato: ");
                endereco = ler.next();
                System.out.println("Digite o email do contato: ");
                email = ler.next();//ler.next();
                System.out.println("Digite o dia de nascimento do contato: ");
                dia = ler.next();
                System.out.println("Digite o mes de nascimento do contato: ");
                mes = ler.next();
                System.out.println("Digite o ano de nascimento do contato: ");
                ano = ler.next();
                p = new Pessoa(nome, telefone, celular, endereco, email, dia, mes, ano);
                use.altera(noal, p);
            } else if (op == 5) {
                System.out.println("Digite o nome do contato para exclusao: ");
                String noexc = ler.next();
                use.exclui(noexc);
            }
            while (p!=null) {
                outputStr.write(p.toString());
                break;
            }
            inputStr.close();
            outputStr.close();
        } catch (IOException ie) {
            ie.printStackTrace();
        }
        }
    }
}
