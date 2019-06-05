package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

/* Used by Spring MVC to handle web requests */
/* @RestController combines @Controller and @ResponseBody, two annotations that results in web requests returning data rather than a view. */
@RestController
public class HelloController {

    /* maps "/" to the index() method, returning pure text from browser or curl command */
    /* Tried curl localhost:8777 */
    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot on AWS with ssh tunnelling; mapping port 8080 to 8777!";
    }

}
