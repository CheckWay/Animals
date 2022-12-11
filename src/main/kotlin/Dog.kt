class Dog:Animal()
{
 override  val name="Собака"
 override val food="Мясо"
 override val location="Двор"
 override fun makeNoise(){println("Лает")}
 override fun eat(){println("Собака ест $food")}
 override fun sleep() {println("Собака спит в будке")}
 val devotion=listOf("Сильная","Слабая", "Обычная")
}