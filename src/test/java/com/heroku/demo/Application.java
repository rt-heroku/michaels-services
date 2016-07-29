package com.heroku.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

import com.heroku.demo.dto.productsearch.ProductSearch;


@SpringBootApplication
public class Application implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String args[]) {
        SpringApplication.run(Application.class);
    }

    @Override
    public void run(String... args) throws Exception {
        RestTemplate restTemplate = new RestTemplate();
        ProductSearch ps = restTemplate.getForObject("http://mjacob01-inside-na01-dw.demandware.net/s/SiteGenesis/dw/shop/v16_4/product_search?q=shoes&client_id=aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa&expand=prices,images", ProductSearch.class);
        log.info(ps.toString());
    }
}
