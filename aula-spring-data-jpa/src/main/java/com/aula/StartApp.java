package com.aula;

import com.aula.model.User;
import com.aula.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StartApp implements CommandLineRunner {
    @Autowired
    UserRepository userRepository;
    @Override
    public void run(String... args) throws Exception {
        User user = new User();
        user.setName("jucelino");
        user.setUsername("jk");
        user.setPassword("123456");
        userRepository.save(user);

        for(User u : userRepository.findAll()){
            System.out.println(u);
        }
    }
}
