package com.silen.seckill.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.Parameter;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.List;


@EnableSwagger2
@Configuration
public class RestApiConfig {

    @Bean
    public Docket buildDocket(){
        ParameterBuilder tokenParameter = new ParameterBuilder();
        List<Parameter> parameterList = new ArrayList<>();
        tokenParameter.name("token").description("令牌").modelRef(new ModelRef("string"))
                .parameterType("header").required(true).build();
//        ParameterBuilder countryParameter = new ParameterBuilder();
//        countryParameter.name("language").description("系统语言(cn:中文;en:英文)").modelRef(new ModelRef("string"))
//                .parameterType("header").required(false).build();

        parameterList.add(tokenParameter.build());
//        parameterList.add(countryParameter.build());
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(buildApiInf())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.silen.seckill.controller"))
                .paths(PathSelectors.any())
                .build().globalOperationParameters(parameterList);
    }

    private ApiInfo buildApiInf(){
        return new ApiInfoBuilder().title("人力窝——silen")
                .description("项目API文档，接口的contextPath:/seckill")
                .termsOfServiceUrl("http://localhost:8101/seckill/")
                .contact(new Contact("silenZheng","",""))
                .build();
    }


}
