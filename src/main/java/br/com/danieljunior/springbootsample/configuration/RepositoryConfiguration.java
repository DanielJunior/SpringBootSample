/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.danieljunior.springbootsample.configuration;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 *
 * @author danieljr
 */
@Configuration
@EnableAutoConfiguration
@EntityScan(basePackages = {"br.com.danieljunior.springbootsample.domain"})
@EnableJpaRepositories(basePackages = {"br.com.danieljunior.springbootsample.repositories"})
@EnableTransactionManagement
public class RepositoryConfiguration {
}
