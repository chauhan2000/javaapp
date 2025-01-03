package com.example.javawebdemo.Respositories;

import com.example.javawebdemo.Models.Users;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CrudRepository contain(save, delete, findAll, findById, count, existsById)
// This is the interface that will be used to access the database
public interface UserRepository extends CrudRepository<Users, Long> {
    // Add more functions to query/(else) the database which not included in the CrudRepository

    // This is a custom query that will be used to find a user by its name
    @Query("SELECT u FROM Users u WHERE u.username = ?1")
    Users findByName(String name);
}
