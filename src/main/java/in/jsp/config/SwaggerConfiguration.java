package in.jsp.config;

import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Configuration;
//import springfox.documentation.builders.PathSelectors;
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;

import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(info = @Info(
		title = "irctc-app",
		description = "operation",
		summary =   "testing purpose",
		termsOfService = "T&C",
		contact = @Contact(name="sudam",email = "@gmail.com"),
		license = @License(name = "4erfguy"),
		version = "v1"
		
		),
servers = @Server(description =  "dev",
                  url = "localhost://8080"
            )
)

//@Configuration
//@EnableSwagger2
public class SwaggerConfiguration {

//	@Bean
//	public Docket api() {
//        return new Docket(DocumentationType.SWAGGER_2)
//                .select()
//                .apis(RequestHandlerSelectors.basePackage("in.jsp.rest"))
//                .paths(PathSelectors.any())
//                .build();
//    }
}