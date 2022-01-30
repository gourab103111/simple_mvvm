package com.example.pratise


class MyClass {

}


fun mainGreet(name : String) = "Welcome $name"
fun noreturnFun():Unit{

    var userName= "Gourab Singha"
    print(" ${mainGreet(userName)}")
    runBlocking{

    }

}