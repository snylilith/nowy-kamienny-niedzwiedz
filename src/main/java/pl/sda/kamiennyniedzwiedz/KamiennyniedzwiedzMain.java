package pl.sda.kamiennyniedzwiedz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class KamiennyniedzwiedzMain {

	public static void main(String[] args) {
		SpringApplication.run(KamiennyniedzwiedzMain.class, args);
	}

}
