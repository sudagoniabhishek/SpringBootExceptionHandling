package com.italent.repo;


import org.springframework.data.jpa.repository.JpaRepository;

import com.italent.entity.User;

public interface UserRepository  extends JpaRepository<User,Integer> {
    User findByUserId(int id);
}