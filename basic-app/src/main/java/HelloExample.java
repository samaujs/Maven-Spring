import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

/* Handling incoming web requests, this annotation tells Spring to render the resulting string directly back to the caller */
@RestController

/*
  This class-level annotation tells Spring Boot to “guess” how you want to configure Spring, based on the jar dependencies that you have added.
  Since spring-boot-starter-web added Tomcat and Spring MVC, the auto-configuration assumes that you are developing a web application and 
  sets up Spring accordingly.
*/
@EnableAutoConfiguration
public class HelloExample {

	/* It provides “routing” information. It tells Spring that any HTTP request with the "/" path should be mapped to the home method. */
	/* The @RestController and @RequestMapping annotations are Spring MVC annotations. */
	@RequestMapping("/")
	String home() {
		return "Hello World from first RestController App!";
	}

	public static void main(String[] args) {
		/* Delegates to Spring Boot’s SpringApplication class */
		/* run.SpringApplication bootstraps our application, starting Spring, which, in turn, starts the auto-configured Tomcat web server. */
		/* pass Example.class as an argument to the run method to tell SpringApplication which is the primary Spring component. */
		/* The args array is also passed through to expose any command-line arguments.*/
		SpringApplication.run(HelloExample.class, args);
	}

}
