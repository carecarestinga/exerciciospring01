package com.caretronics.exerciciospring.config;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author caretronics
 */
@Controller
public class AppSpringBootController {

    @RequestMapping("/")//http://localhost:8080/
    @ResponseBody
    public String ola() {
        return "Ola, Mundo!!!!";
    }

    @RequestMapping("/ola/{nome}")//http://localhost:8080/ola/carlos
    @ResponseBody
    public String ola(@PathVariable String nome) {
        return "Ola, " + nome + " !!";
    }

    @RequestMapping("/ola2/{nome}")//http://localhost:8080/ola/carlos
    @ResponseBody
    public String ola(@PathVariable String nome, @RequestParam("horas") int horas) {

        if (horas > 18) {
            return "Boa noite, " + nome + " !!";
        }
        if (horas > 12) {
            return "Boa tarde, " + nome + " !!";
        } else {
            return "Boa dia, " + nome + " !!";
        }

    }

}
