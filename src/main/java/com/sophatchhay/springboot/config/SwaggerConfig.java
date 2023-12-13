package com.sophatchhay.springboot.config;

import io.swagger.v3.oas.annotations.enums.SecuritySchemeIn;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@SecurityScheme(name = "bearerAuth", scheme = "bearer", type = SecuritySchemeType.HTTP, in = SecuritySchemeIn.HEADER)
public class SwaggerConfig {
    @Bean

    public OpenAPI openAPI() {
        String swaggerDesc = "## API Document Overview \n";
        swaggerDesc += "___ \n";
        swaggerDesc += "### Authorization \n";
        swaggerDesc += "The API uses the standard HTTP `Authorization` header to pass authentication information.\n";
        swaggerDesc += "### Response Format \n";
        swaggerDesc += "There are two types of @response: \n\n";
        swaggerDesc += "__Success__: \n\n";
        swaggerDesc += "__Error__: \n\n";

        return new OpenAPI()
            .info(
                new Info()
                    .title("API Document Integration")
                    .description(String.format(swaggerDesc))
                    .version("0.0.1")
            );
    }
}
