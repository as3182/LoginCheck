package Config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfiguration {
	
	
	
	    @Bean
	    public WebMvcConfigurer corsConfigurer() {
	        return new WebMvcConfigurer() {
	            @Override
	            public void addCorsMappings(CorsRegistry registry) {
	                registry.addMapping("/**")
	                        .allowedOrigins("*") // Change this to your specific domain or "*" for all origins
	                        .allowedMethods("GET", "POST", "PUT", "DELETE")
	                        .allowedHeaders("*") // Change this to your specific headers or "*" for all headers
	                        .allowCredentials(true); // Change this as needed
	            }
	        };
	    }
	}


