package br.com.erudio.controller;

import br.com.erudio.model.Book;
import br.com.erudio.proxy.CambioProxy;
import br.com.erudio.repository.BookRepository;
import br.com.erudio.response.Cambio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;

@RestController
@RequestMapping("book-service")
public class BookController {

    @Autowired
    private Environment environment;

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private CambioProxy proxy;

    @GetMapping(value = "/{id}/{currency}")
    public Book findBook(
            @PathVariable("id") Long id,
            @PathVariable("currency") String currency
    ) {
        Book book = bookRepository.getById(id);
        if (book == null) throw new RuntimeException("Book not found");

        Cambio cambio = proxy.getCambio(book.getPrice(),"USD", currency);

        String port = environment.getProperty("local.server.port");
        book.setEnvironment("Book port: " + port + " Cambio Port " + cambio.getEnvironment());
        book.setPrice(cambio.getConvertedValue());
        return book;
    }
}
