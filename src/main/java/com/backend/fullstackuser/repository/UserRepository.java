package com.backend.fullstackuser.repository;

import com.backend.fullstackuser.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {



}
