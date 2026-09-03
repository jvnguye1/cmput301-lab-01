package com.example.petshop

class Sad(mood:String):Mood(mood) {
    override fun getMood(): String {
        return "This object is $mood"
    }
}