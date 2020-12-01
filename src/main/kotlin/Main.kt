fun myFunction(){
    println()
    println("It's my!!!")
    val mc = MyClass()
    mc.myFunction()
}

fun main(){
    foo()
    print("Start")
    foo()
    myFunction()
    bye()
}

fun bye() {
    println("Пока-пока!")
}

fun foo(){
    print("Foo")
}