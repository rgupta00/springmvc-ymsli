package com.bankapp.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan(basePackages = { "com.bankapp" })
@EnableAspectJAutoProxy
@EnableTransactionManagement
@PropertySource(value = { "classpath:db.properties" })
public class AppConfig2 {

	@Autowired
	private Environment env;

	@Autowired
	@Bean
	public DataSource getDataSource() {
		BasicDataSource ds = new BasicDataSource();
		ds.setUrl(env.getProperty("jdbc.url"));
		ds.setDriverClassName(env.getProperty("jdbc.driver"));
		ds.setUsername(env.getProperty("jdbc.username"));
		ds.setPassword(env.getProperty("jdbc.password"));
		ds.setInitialSize(Integer.parseInt(env.getProperty("jdbc.initpoolsize")));
		return ds;
	}
	
	@Autowired
	@Bean
	public LocalSessionFactoryBean getLocalSessionFactoryBean(DataSource dataSource) {
		LocalSessionFactoryBean lsfb=new LocalSessionFactoryBean();
		lsfb.setDataSource(dataSource);
		lsfb.setPackagesToScan(new String[] {"com.bankapp.dao"});
		lsfb.setHibernateProperties(getHibernateProp());
		return lsfb;
		
	}
	
	private Properties getHibernateProp() {
		Properties properties=new Properties();
		properties.setProperty("hibernate.hbm2ddl.auto", env.getProperty("hibernate.hbm2ddl.auto"));
		properties.setProperty("hibernate.show_sql", "true");
		properties.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL57Dialect");
		properties.setProperty("hibernate.format_sql", "true");
		return properties;
	}

	@Autowired
	@Bean
	public HibernateTransactionManager getHibernateTransactionManager(SessionFactory sessionFactory) {
		HibernateTransactionManager hibTxMgr=new HibernateTransactionManager();
		hibTxMgr.setSessionFactory(sessionFactory);
		return hibTxMgr;
	}

}




