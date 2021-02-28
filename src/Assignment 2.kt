fun main() {
    name()
    modulus()
    var add =addition(5,6,7,8)
    println(add)
    interestingFact()
}
fun name(){
    var name="hello Olga"
    println(name)
}
fun modulus(){
    var a=30
    var b=12
    var result=(a%b)
    println(result)
}
fun addition(num1:Int,num2:Int,num3:Int,num4:Int):Int{
    var add=num1+num2+num3+num4
    return add
}
fun interestingFact(){
    var interestingFact="my baby face"
    println(interestingFact)
}