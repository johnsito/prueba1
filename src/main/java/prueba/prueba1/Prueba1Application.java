package prueba.prueba1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class Prueba1Application {

    @GetMapping("/")
    public String home(){

        return "Bienvenidos a la app de Creative Minds" +
                "<br> <img src=\"https://miviaje.com/wp-content/uploads/2018/09/cano-cristales.jpg\" alt=\"modelado\">";
    }

    @GetMapping({"/error"})
    public String getError(){
        return "error";
    }

    public static void main(String[] args) {
        SpringApplication.run(Prueba1Application.class, args);
    }

}
