class Cat:Animal()
{
    override  val name="Кот"
    override val food="Корм"
    override val location="Квартира"
    override fun makeNoise(){println("Мурлычит")}
    override fun eat(){println("Кот ест $food")}
    override fun sleep() {println("Кот спит на кровати")}
    val cute= listOf("Милый", "Не милый")
}