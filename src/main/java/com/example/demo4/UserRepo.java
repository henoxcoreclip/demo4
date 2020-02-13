package com.example.demo4;

import org.springframework.data.repository.CrudRepository;

import com.example.demo4.Player;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface UserRepo extends CrudRepository<Player, Integer> {

}