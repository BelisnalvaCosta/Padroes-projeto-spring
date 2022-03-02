package dio.me.PersonLocator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class PersonLocatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(PersonLocatorApplication.class, args);
	}

}
