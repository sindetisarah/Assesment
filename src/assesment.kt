import java.util.*

fun main(){
    introduction("sarah",19)
    checkAge(15)

    var human=Human("Sarah",23,34.0)
    human.speak("Hello")
    human.birthday()
    human.eat(20)

    multiply(2,3)
    divide(4,6)
    modulus(3,5)

    arrayNames(arrayOf("sarah","sindet","nashivai","wato","juliet"))
}
fun introduction(name:String,age:Int){
    println("My name is ${name} and i am  ${age} years old")
}
fun checkAge(age:Int){
    if(age<6){
        println("Serve glass of milk")
    }else if (age>6){
        println("Serve Fanta")
    }else if(age>6 && age>=15){
        println("Serve Cocacola")
    }
}
fun sortNames(names:Array<String>){
     for (name in names){
        if(name.length>4){
           println(name)
        }
    }
}
class Human(var name:String,var age:Int,var weight:Double){
    fun eat(foodWeight:Int){
        println("I am eating ${foodWeight}")
        weight=weight +foodWeight

    }
    fun speak(speech:String){
        println(speech)
    }
    fun birthday(){
        age++
    }

}
fun comparison(num1:Int,num2:Int):Boolean {

    if (num1 < num2) {
        println(true)
    } else {
        return false

    }
    return true
}
fun multiply(num1:Int,num2:Int){
    println(num1*num2)

}
fun divide(num1:Int,num2:Int){
    println(num1/num2)

}
fun modulus(num1:Int,num2:Int){
    println(num1%num2)

}
fun game (player1:String,player2:String){
      var rock="rock"
    var scissor="scissor"
    var paper="paper"
    if(player1=="rock"&& player1==rock){

    }

}




fun arrayNames(names:Array<String>):Array<String>{
    return names

}
