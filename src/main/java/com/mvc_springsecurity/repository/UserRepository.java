/**
 * 
 */
package com.mvc_springsecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mvc_springsecurity.model.User;

/**
 * @author user
 *
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	
	User findByEmail(String email);

}
