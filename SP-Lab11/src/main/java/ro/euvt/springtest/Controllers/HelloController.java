package ro.euvt.springtest.Controllers;

import ro.euvt.springtest.SpringExamples.ClientComponent;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloController {
    private ClientComponent clientComponent;

    public HelloController(ClientComponent clientComponent) {
        this.clientComponent = clientComponent;
    }

    @GetMapping("")
    public String getHello(){
        clientComponent.operation();
        return "Hello from " + clientComponent;
    }

}
