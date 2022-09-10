package controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaginaController {
    @GetMapping("/")
    public String iniciar () {
        return "index";

    }
}
