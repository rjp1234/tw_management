package cn.deepclue.eyes.common.config.datasource.mybatis;

import cn.deepclue.eyes.common.config.datasource.SqlSessionConfig;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import javax.sql.DataSource;

/**
 * @author yanwei
 * @since 2018-12-05
 */

@Configuration
@MapperScan(basePackages = {"cn.deepclue.eyes.mapper.management"},
            sqlSessionFactoryRef = "managementSqlSessionFactory",
            sqlSessionTemplateRef = "managementSqlSessionTemplate")
public class ManagementSqlSessionConfig extends SqlSessionConfig {

    @Bean
    public SqlSessionFactory managementSqlSessionFactory(@Qualifier("management") DataSource dataSource) throws Exception {
        return sqlSessionFactory(dataSource);
    }

    @Bean
    public SqlSessionTemplate managementSqlSessionTemplate(@Qualifier("managementSqlSessionFactory") SqlSessionFactory managementSqlSessionFactory) {
        return sqlSessionTemplate(managementSqlSessionFactory);
    }
}

