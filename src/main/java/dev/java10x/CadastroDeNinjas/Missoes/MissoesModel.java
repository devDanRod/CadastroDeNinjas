package dev.java10x.CadastroDeNinjas.Missoes;

import dev.java10x.CadastroDeNinjas.NinjaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table (name = "tb_missoes")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class MissoesModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private StatusMissao status;

    @OneToMany(mappedBy = "missoes")
    private List<NinjaModel> ninjas = new ArrayList<>();


}
