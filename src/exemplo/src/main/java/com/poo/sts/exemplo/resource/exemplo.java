package com.poo.sts.exemplo.resource;

import org.springframework.web.bind.annotation.*;

import java.util.Random;

@RestController
@RequestMapping("/exemplos")
public class exemplo {
    @GetMapping
    public String retornaHello() {
        return "Hello world";
    }
    @GetMapping("/{nome}")
    public String mensagemComNome(@PathVariable String nome) {
        return "Olá <br>" + nome;
    }
    @GetMapping("/soma")
    public double soma(@RequestParam double n1,@RequestParam double n2) {
        return n1 + n2;
    }

    @GetMapping("/JogarDado")
    public String dados(@RequestParam int qtdDados, @RequestParam int aposta) {
        if (aposta > (qtdDados*6) || qtdDados > 4) {
            return "Aposta invalida";
        } else {
            int resultado = 0;
            Random dado = new Random();
            for (int i = 1; i <= qtdDados; i++) {
                resultado += dado.nextInt(6)+1;
            }
            return "<h1>Resultado: "+resultado+"</h1><br><b>seu percentual de acertividade da aposta: "+ Math.round((((double)aposta/(double)resultado)*100)-100)+ " %</b>";
        }
    }
}
