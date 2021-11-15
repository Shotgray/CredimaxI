package pe.edu.uandina.demoSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.uandina.demoSpring.modelo.Usuario;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication (exclude = {DataSourceAutoConfiguration.class})
@RestController
public class DemoSpringApplication{

	public static void main(String[] args) {




		SpringApplication.run(DemoSpringApplication.class, args);

	}
}
