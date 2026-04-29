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

    @Column(name = "id")
    private long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "img_url")
    private String imgUrl;

    @Column(name = "idade")
    private int idade;

    @Column(unique = true)
    private String email;

    @ManyToOne
    @JoinColumn(name = "missoes_id")
    private MissoesModel missoes;

}
