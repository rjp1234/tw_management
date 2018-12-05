package cn.deepclue.eyes.common.config.datasource;

import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import javax.sql.DataSource;

/**
 * @author yanwei
 * @since 2018-12-05
 */

@Configuration
public class DataSourceConfig {

    @Primary
    @Bean(name = "management")
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource managementDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "cas")
    @ConfigurationProperties(prefix = "spring.datasource-cas")
    public DataSource casDataSource() {
        return DataSourceBuilder.create().build();
    }
}
