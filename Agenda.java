/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author rafael
 */
public class Agenda {

    List<Pessoa> agenda;
    Map<String, List<Pessoa>> iniciais;
    Map<String, List<Pessoa>> aniversarios;
    BufferedReader lerarq;
    BufferedWriter outputStr;
    List<String> p;
    public Agenda() {
        agenda = new ArrayList();
        iniciais = new HashMap();
        aniversarios = new HashMap();
    }


    public void adiciona(Pessoa c){
       agenda.add(c);
        String key = c.nome.substring(0, 1);
      
       List<Pessoa> listaAtual = iniciais.get(key);
       if (listaAtual == null) {
       listaAtual = new ArrayList<Pessoa>();
       }
       listaAtual.add(c);
       iniciais.put(key, listaAtual); //HashMap
       //aniversario
       key = c.mes;
       listaAtual = aniversarios.get(key);
       if (listaAtual == null){
       listaAtual = new ArrayList<Pessoa>();
       }
       listaAtual.add(c);
       aniversarios.put(key, listaAtual);
       /*cont = new Pessoas(newNome, tel, cel, em,data);
       contatos.add(cont);*/
          }

    public void altera(String nome, Pessoa cont) {
        for (int i = 0; i < agenda.size(); i++) {
            System.out.println(nome+"=="+agenda.get(i).nome);
            if (agenda.get(i).nome.equals(nome)) {
                agenda.add(i, cont);
                System.out.println("Alterado com sucesso...");
                break;
            }
        }
    }

    public void exclui(String nome) {
        for (int i = 0; i < agenda.size(); i++) {
            if (agenda.get(i).nome.equals(nome)) {
                agenda.remove(agenda.get(i));
                System.out.println("Excluido com sucesso...");
            }
        }
    }

    public String consultaPorNome(String nome) {
        for (int i = 0; i < agenda.size(); i++) {
            if (agenda.get(i).nome.equals(nome)) {
                return agenda.toString();
            }
        }
        return null;
    }

    public String relatorioPorInicial(String key) {
        List<Pessoa> lista = iniciais.get(key);
        return lista.toString();
    }

    public String relatorioPorMesAniversario(String mes) {
        List<Pessoa> l = aniversarios.get(mes);
        return l.toString();
    }

    public String relatorio() {
        return agenda.toString();
    }
}
