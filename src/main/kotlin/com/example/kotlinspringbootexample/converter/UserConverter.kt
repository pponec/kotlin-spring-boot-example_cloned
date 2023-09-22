package com.example.kotlinspringbootexample.converter

import com.example.kotlinspringbootexample.dto.UserDto
import com.example.kotlinspringbootexample.entity.User
import com.example.kotlinspringbootexample.request.CreateUserRequest

fun User.toDto(): UserDto {
    return UserDto(
        id = this.id,
        username = this.username,
        email = this.email,
        name = this.name,
        surname = this.surname,
    )
}

fun CreateUserRequest.toUser(): User {
    return User(
        username = this.username,
        email = this.email,
        name = this.name,
        surname = this.surname
    )
}
