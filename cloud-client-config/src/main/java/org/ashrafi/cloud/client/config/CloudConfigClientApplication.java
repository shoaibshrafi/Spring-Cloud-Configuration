package org.ashrafi.cloud.client.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class CloudConfigClientApplication 
{
    public static void main( String[] args )
    {
        SpringApplication.run(CloudConfigClientApplication.class, args);
    }
}

@RefreshScope
@RestController
class RefreshController {

	@Value("${message:Hello}")
	private String message;
	
	
	@GetMapping("/message")
	public String message(){
		return this.message == null ? "N/A" : this.message;
	}
		
}
