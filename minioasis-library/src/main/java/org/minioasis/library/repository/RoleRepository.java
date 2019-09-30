package org.minioasis.library.repository;

import org.minioasis.library.domain.Role;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

	Page<Role> findByNameContainingIgnoreCase(String name , Pageable pageable);
	
	Role findByName(String name);
}
