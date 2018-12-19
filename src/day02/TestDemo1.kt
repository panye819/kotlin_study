package day02

fun main(args: Array<String>) {
    val person1 = WeiQunMother()
    val person2 = BigHeadSon()
    val person3 = SmallHeadFather()

    val personList = listOf<IWashBowl>(person1,person2,person3)
    for( i in personList){
        i.washing()
    }
}

