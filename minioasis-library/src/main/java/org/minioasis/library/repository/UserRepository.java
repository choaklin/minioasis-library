package org.minioasis.library.repository;

import org.minioasis.library.domain.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByUsername(String username);
	
	Page<User> findByUsernameContaining(String username , Pageable pageable);
	
}
