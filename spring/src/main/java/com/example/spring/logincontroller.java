package com.example.spring;

import com.example.bd.BLL.ClienteBLL;
import com.example.bd.DAL.Cliente;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Optional;

@Controller
public class logincontroller {
    @GetMapping("/voltar")
    public String index() {
        return "index";
    }

    @PostMapping("/logger")
    public String login(Model model, Cliente cliente) {
        /*Cliente c = ClienteBLL.verifyLoginWeb(cliente);
        IndexController ic = new IndexController();

        if (c != null){
            var option = Optional.<String>empty();
            option = Optional.of(c.getUsername());

            return "menucliente";
        }else {
            model.addAttribute("Erro", "Cliente não Encontrado");
            return "login";
        }*/


        /*String user = request.getParameter("username");
        String pass = request.getParameter("password");
        ModelAndView model = null;

        List<Cliente> clientes = ClienteBLL.findClienteEntities();

        for (Cliente c : clientes){
            if (c.getUsername().equals(user) && c.getPassword().equals(pass)){
                model= new ModelAndView("/menucliente");
            }
            else {
                model= new ModelAndView("/login");
            }
        }
        return model;*/
        return "menucliente";
    }
}