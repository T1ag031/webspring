package com.example.spring;

import com.example.bd.BLL.ClienteBLL;
import com.example.bd.DAL.Cliente;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class registarcontroller {
    @GetMapping("/voltar1")
    public String index() {
        return "index";
    }

   /* @GetMapping("/register")
    public static void register(@RequestParam("nomeinput") String nome, @RequestParam("nifinput") int nif, @RequestParam("mailinput") String email, @RequestParam("cpostalinput") String codpostal, @RequestParam("nportainput") int nPorta, @RequestParam("ruainput") String rua,
                                @RequestParam("userinput") String user, @RequestParam("passinput") String pass){

        Cliente c = new Cliente();

        c.setNome(nome);
        c.setNif(nif);
        c.setEmail(email);
        c.setCodpostal(codpostal);
        c.setRua(rua);
        c.setNporta(nPorta);
        c.setUsername(user);
        c.setPassword(pass);

        ClienteBLL.create(c);

    }*/
}
