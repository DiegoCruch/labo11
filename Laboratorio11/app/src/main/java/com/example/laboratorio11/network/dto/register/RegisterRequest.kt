package com.example.laboratorio11.network.dto.register

import android.provider.ContactsContract.CommonDataKinds.Email

// TODO: Create RegisterRequest data class
data class RegisterRequest (
    // TODO Add name, email and password fields
    val name : String,
    val email: String,
    val password: String
)