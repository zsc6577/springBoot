package com.zsc.springBoot.frame.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	
	@Bean
	public Docket api() {
		
		return new Docket(DocumentationType.SWAGGER_2)
				.select()//返回一个ApiSelectBuidler实例
				.apis(RequestHandlerSelectors.basePackage("com.zsc.springBoot"))//包名
				.paths(PathSelectors.any()).build()//
				.apiInfo(apiInfo());//增加api的相关信息
	}
	
	//添加自定义的页面信息
	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("zscDemo").description(apiDesc()).build();
	}
	
	/**
	 * 
	 * @Title: apiDesc   
	 * @Description: 自定义swagger的页面信息
	 * @author: zhushuncheng 
	 * @param: @return      
	 * @return: String     
	 * @date:   2018年12月5日 下午3:08:28
	 */
	public String apiDesc() {
		String content = "这是一段描述信息";
		StringBuffer apiStr = new StringBuffer();
		
		apiStr.append(content);
		
		return apiStr.toString();
	}
}
