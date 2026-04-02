package dev.java10x.CadastroDeNinjas;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Controller {

    @RequestMapping("/boasvindas")

    public String boasVindas(){
        return "Bem vindooooo nessa porra!";
    }
}
