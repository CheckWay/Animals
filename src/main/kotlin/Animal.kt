open class Animal
{
    open val name=""
    open val food="Еда"
    open  val location:String="Местоположение"
    open fun makeNoise() { println("Животное издает характерный звук") }
    open fun eat(){println("Животное ест") }
    open fun sleep(){println("Животное спит")}
}
