package swagger.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class SwaggerTestingApplication {
    public static void main(String[] args) {
        SpringApplication.run(SwaggerTestingApplication.class,args);
    }

    @Bean
    public Docket swaggerConfigurationObject(){
        return  new Docket(DocumentationType.SWAGGER_2).select().paths(PathSelectors.ant("/api/**"))
                .apis(RequestHandlerSelectors.basePackage("swagger.test")).build().apiInfo(getApiInfo());
    }
    private ApiInfo getApiInfo(){
        return new ApiInfo("Swagger Test Application","Here we impliments the awagger with spring boot"
                ,"1.0.0","XYZ","XYZ","XYZ","NA");
    }
}
