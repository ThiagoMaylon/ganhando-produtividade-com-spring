package com.spring_properties_value.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SistemaMensagem implements CommandLineRunner {
//    @Value("${nome:NoReply-DIO}")
//    private String nome;
//    @Value("${email}")
//    private String email;
//    @Value("${telefones}")
//    private List<Long> telefones;
    @Autowired
    private Remetente remetente;
    @Override
    public void run(String... args) throws Exception {
        System.out.println("mensagem enviada por: "+remetente.getNome());
        System.out.println("email: "+remetente.getEmail());
        System.out.println("telefones para contado: "+remetente.getTelefones());
        System.out.println("seu cadastro foi aprovado!!");
    }
}
