package com.example.petshop

class Happy(mood: String):Mood(mood){
    override fun getMood() : String{
        return "This object is $mood"
    }
}