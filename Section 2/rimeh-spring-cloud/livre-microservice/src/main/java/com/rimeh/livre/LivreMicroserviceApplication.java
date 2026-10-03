package com.rimeh.livre;

import com.rimeh.livre.entities.Livre;
import com.rimeh.livre.repos.LivreRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LivreMicroserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(LivreMicroserviceApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(LivreRepository livreRepository) {
        return args -> {
            livreRepository.save(Livre.builder().titre("Dune").auteur("Frank Herbert").build());
        };
    }

}
