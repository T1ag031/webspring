package com.example.spring;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;
@Controller
public class encomendascontroller {
    @GetMapping("/menucliente")
    public String index() {
        return "menucliente";
    }

    @GetMapping("/verencomendas")
    public String listUsers(Model model) {
        /*List<Encomenda> prod = EncomendaBLL.findAEncomendaEntities();
        model.addAttribute("ListaProd", prod);
        System.out.println(model);*/
        return "verencomendas";
    }

}
