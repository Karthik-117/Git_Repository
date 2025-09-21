package Api_Service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class Apiservice {

	@Bean
	public RestTemplate rtService() {
		return new RestTemplate();
	}

}
