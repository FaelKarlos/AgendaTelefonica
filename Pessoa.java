/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author rafael
 */
public class Pessoa{

    String nome;
    private String telefone;
    private String celular;
    private String endereco;
    private String email;
    private String dia;
    String mes;
    private String ano;

    public Pessoa() {
    }

    public Pessoa(String nome, String telefone, String celular, String endereco, String email, String dia,String mes,String ano) {
        this.nome = nome;
        this.telefone = telefone;
        this.celular = celular;
        this.endereco = endereco;
        this.email = email;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "\n|=========================================================================================================================================|"
                +"\n|Pessoa :" + "  Nome=" + nome+ ", Telefone=" + telefone + ", Celular=" + celular + ", Endereco=" + endereco + ", Email=" + email + ", Data=" + dia + '/' +mes+'/'+ano+'|'
                +"\n|=========================================================================================================================================|";
    }

}