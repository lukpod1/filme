package br.com.lucas.starkfilm;

import br.com.lucas.starkfilm.model.Filme;
import br.com.lucas.starkfilm.repository.FilmeRepository;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StarkfilmApplication implements CommandLineRunner{
    
    @Autowired
    private FilmeRepository filmeRepository;
    
    public static void main(String[] args) {
        SpringApplication.run(StarkfilmApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Filme f1 = new Filme(null, "Vingadores - Guerra Infinita", "Joias");
        filmeRepository.saveAll(Arrays.asList(f1));
    }
    
    
}
