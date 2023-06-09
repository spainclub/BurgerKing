package com.example.burgerking.repository;


import com.example.burgerking.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmailId(String email);
    Optional<User> findByUserName(String userName);
    Optional<User> findByKakaoId(Long kakaoId);

}
