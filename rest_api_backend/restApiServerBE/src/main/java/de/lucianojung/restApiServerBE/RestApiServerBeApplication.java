package de.lucianojung.restApiServerBE;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.server.ConfigurableWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collections;

@SpringBootApplication
public class RestApiServerBeApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(RestApiServerBeApplication.class);
		app.setDefaultProperties(Collections
				.singletonMap("server.port", "8083"));
		app.run(args);
	}

	@Component
	public class ServerPortCustomizer
			implements WebServerFactoryCustomizer<ConfigurableWebServerFactory> {

		@Override
		public void customize(ConfigurableWebServerFactory factory) {
			factory.setPort(8083);
		}
	}

}
