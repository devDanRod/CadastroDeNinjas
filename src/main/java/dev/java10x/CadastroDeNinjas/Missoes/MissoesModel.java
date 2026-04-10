package dev.java10x.CadastroDeNinjas.Missoes;

import dev.java10x.CadastroDeNinjas.NinjaModel;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tb_missoes")

public class MissoesModel {

    private Long id;
    private String nome;
    private StatusMissao status;

    @OneToMany(mappedBy = "missoes")
    private List<NinjaModel> ninjas = new ArrayList<>();




}
