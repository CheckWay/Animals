fun main()
{
    val animals=Animal()
    val veterinarian=Veterinarian()
    val AnimalArr=arrayOf(Cat(),Dog(),Horse())
    for (animals in AnimalArr) veterinarian.treatAnimal(animals)

    val cat=Cat()
    val dog=Dog()
    val horse=Horse()
    print("Кот:"+cat.cute[1]
            +"\nСобака:"+dog.devotion[1]
            +"\nЛошадь имеет форму копыта:"+ horse.formOfHoof[0])
}