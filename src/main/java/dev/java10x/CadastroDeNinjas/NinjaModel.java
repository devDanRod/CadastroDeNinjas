package dev.java10x.CadastroDeNinjas;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import dev.java10x.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;

// Entity vai transformar a classe em uma tabela
@Entity
@Table(name = "tb_cadastro")


public class NinjaModel {
    @Id// anotação para  que atributo logo abaixo sera o id do banco
    @GeneratedValue(strategy = GenerationType.IDENTITY) // gera que o atributo seja auto-incremente
    private long id;
    private String nome;
    private int idade;
    private String email;

    @ManyToOne
    @JoinColumn(name = "missoes_id")
    private MissoesModel missoes;



    public NinjaModel() {
    }

    public NinjaModel(String nome, int idade, String email) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "NinjaModel{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", email='" + email + '\'' +
                '}';
    }
}
