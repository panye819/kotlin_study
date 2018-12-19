package day03

/**
 *  foreach (action:(T) -> Unit)
 *  参数是一个函数，返回值是Unit
 *
 */
val print = fun (name:String):Unit{
    println(name)
}
fun main(args: Array<String>) {
    val names = listOf<String>("Tom","Jerry","SpiderMan","IronMan")
    names.forEach(print)
    print("1-----------------------------------")
    names.forEach{
        a -> print(a)
    }
    print("2-----------------------------------")
    names.forEach{
        print(it)
    }

}