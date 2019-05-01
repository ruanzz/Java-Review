package com.ruanzz.spring.annotaion.profile;

import com.ruanzz.spring.bean.Yellow;
import javax.sql.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @author ZhenZhuo.Ruan
 */
@Configuration
public class DataSourceConfig {

  @Bean
  @Profile("dev")
  public DataSource dataSource() {
    return null;
  }

  @Profile("test")
  @Bean("testDataSource")
  public DataSource testDataSource() {
    return null;
  }

  @Profile("prod")
  @Bean
  public DataSource prodDataSource() {
    return null;
  }

  @Bean
  public Yellow yellow() {
    return new Yellow();
  }
}
