package com.licuadri.dio.std_week.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.licuadri.dio.std_week.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
