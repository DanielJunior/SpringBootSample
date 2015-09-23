/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.danieljunior.springbootsample.repositories;

import br.com.danieljunior.springbootsample.domain.Product;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author danieljr
 */
public interface ProductRepository extends CrudRepository<Product, Integer> {
}
