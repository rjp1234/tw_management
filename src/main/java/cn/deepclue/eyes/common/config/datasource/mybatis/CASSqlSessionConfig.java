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
@MapperScan(basePackages = {"cn.deepclue.eyes.mapper.cas"},
            sqlSessionFactoryRef = "casSqlSessionFactory",
            sqlSessionTemplateRef = "casSqlSessionTemplate")
public class CASSqlSessionConfig extends SqlSessionConfig {

    @Bean
    public SqlSessionFactory casSqlSessionFactory(@Qualifier("cas") DataSource dataSource) throws Exception {
        return sqlSessionFactory(dataSource);
    }

    @Bean
    public SqlSessionTemplate casSqlSessionTemplate(@Qualifier("casSqlSessionFactory") SqlSessionFactory casSqlSessionFactory) {
        return sqlSessionTemplate(casSqlSessionFactory);
    }
}
