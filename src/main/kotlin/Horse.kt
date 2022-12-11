class Horse:Animal()
{
    override  val name="Лошадь"
    override val food="Овес"
    override val location="Ферма"
    override fun makeNoise(){println("Ржет")}
    override fun eat(){println("Лошадь ест $food")}
    override fun sleep() {println("Лошадь спит в загоне")}
    val formOfHoof=listOf("Широкое", "Узкое","Ассиметричное")
}