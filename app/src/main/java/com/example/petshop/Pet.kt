package com.example.petshop

abstract class Pet (val name: String, var age: Int) { //abstract lets you use inheritance but cant create objects of this class
    abstract fun speak(): String
}