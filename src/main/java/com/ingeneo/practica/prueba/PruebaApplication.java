package com.ingeneo.practica.prueba;

import com.ingeneo.practica.prueba.component.ComponentDependency;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PruebaApplication  implements CommandLineRunner {

	private ComponentDependency componentDependency;

	public PruebaApplication (ComponentDependency componentDependency) {
		this.componentDependency= componentDependency;
	}

	public static void main(String[] args) {
		SpringApplication.run(PruebaApplication.class, args);
	}

	@Override
	public void run(String... args)  {
		componentDependency.saludar();
	}
}
