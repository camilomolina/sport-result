package cl.bennu.user.ms;

import cl.bennu.common.security.jwt.JwtFilter;
import cl.bennu.common.security.jwt.JwtUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@EnableAutoConfiguration
@ComponentScan
@Configuration
@SpringBootApplication
public class UserMS {

    @Bean
    public FilterRegistrationBean config() {
        FilterRegistrationBean registrationBean = new FilterRegistrationBean(JwtUtil.getCorsFilter());
        registrationBean.setOrder(0);

        return registrationBean;
    }

    @Bean
    public FilterRegistrationBean jwtFilter() {
        final FilterRegistrationBean registrationBean = new FilterRegistrationBean();
        registrationBean.setFilter(new JwtFilter());
        registrationBean.addUrlPatterns("/api/*");
        registrationBean.setOrder(0);

        return registrationBean;
    }
    public static void main(String[] args) {
        SpringApplication.run(UserMS.class, args);
    }


}
