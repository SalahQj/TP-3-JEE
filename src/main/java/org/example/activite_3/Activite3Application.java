package org.example.activite_3;

import org.example.activite_3.entities.Product;
import org.example.activite_3.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Activite3Application {

    public static void main(String[] args) {
        SpringApplication.run(Activite3Application.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(ProductRepository productRepository) {

        return args -> {
            Product product = Product.builder()
                    .name("TV").price(9000).quantity(25)
                    .build();
            productRepository.save(product);

            productRepository.save(Product.builder().name("Phone").price(12000).quantity(14).build());
            productRepository.save(Product.builder().name("PC").price(40000).quantity(10).build());
            productRepository.findAll().forEach(System.out::println);

//            productRepository.save(new Product(null, "TV", 9000, 25));
        };
    }
}

