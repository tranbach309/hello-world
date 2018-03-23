package fsoft.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fsoft.model.User;

@Repository("userRepository")
public interface UserRepository extends JpaRepository<User, Integer>{
	User findByEmail(String email);
}
