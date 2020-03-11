package hoon.byeun;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.hateoas.*;

@RestController
public class SampleController {

    @GetMapping("/hello")
    public Resource<Hello> hello() {
        Hello hello = new Hello();
        hello.setPrefix("Hey,");
        hello.setName("saelobi");

        Resource<Hello> helloResource = new Resource<>(hello);
        helloResource.add(linkTo(methodOn(SampleController.class).hello()).withSelfRel());

        return helloResource;
    }

}
