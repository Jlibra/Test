package com.starter.mystarter.conf;

//import com.starter.mystarter.controller.StartController;
import com.starter.mystarter.service.MD5Service;
import com.starter.mystarter.utils.MD5Util;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * <p>
 * MD5AutoConfiguration:
 * </p>
 *
 * @author jiangxf
 * @version 2.8.0
 * @since 2019-10-28
 */
@Configuration
@EnableConfigurationProperties({MD5Util.class})
public class MD5AutoConfiguration {

/*    @Bean
    StartController startController(){
        return new StartController();
    }*/

    @Bean
    MD5Service md5Service() {
        return new MD5Service();
    }

    @Bean
    MD5Util md5Util(){
        return new MD5Util();
    }
}
