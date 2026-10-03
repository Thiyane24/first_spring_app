package controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.HelloWorldService;
import user.User;


@RestController
@RequestMapping("/hello-world")
public class helloworld {
    @Autowired
    private HelloWorldService  helloWorldService;

    @GetMapping
    public String helloWorld(){
        return helloWorldService.helloWorld("Thiyane");
    }

    @PostMapping("/{id}")
    public String helloWorldPost(@PathVariable("id") String id, @RequestBody User body){
        return "Hello World " + body.getName()+" " + id;
    }
}
