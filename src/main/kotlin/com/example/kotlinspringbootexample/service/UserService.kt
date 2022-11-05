package com.example.kotlinspringbootexample.service

import com.example.kotlinspringbootexample.model.User
import com.example.kotlinspringbootexample.repository.UserRepository
import com.example.kotlinspringbootexample.request.CreateUserRequest
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.lang.RuntimeException

@Service
class UserService(@Autowired private val userRepository: UserRepository) {

    fun getAllUsers(): List<User> = userRepository.findAll()

    fun getUserByID(id: Long): User = userRepository.findById(id)
        .orElseThrow { RuntimeException("user not found!") }

    fun createUser(createUserRequest: CreateUserRequest): User {
        return userRepository.save(CreateUserRequest.Mapper.toUser(createUserRequest))
    }

}