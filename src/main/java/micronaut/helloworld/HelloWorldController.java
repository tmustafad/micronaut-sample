package micronaut.helloworld;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/helloWorld")
public class HelloWorldController {

    @Get("/")
    public String index() {
        return "Hello Micronaut !!!!";
    }
}