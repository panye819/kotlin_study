package day02
/**
* 印章类，是子类类型有限的类
* 印章类更在意类型
* 枚举更在意数据
* */
sealed class Son {

    fun sayHello(word:String){
        println("大家好， $word")
    }
    class SmallDunkey():Son()
    class SmallMonkey():Son()
    class SmallCat():Son()
}

fun main(args: Array<String>) {
    val s1:Son = Son.SmallDunkey()
    val s2:Son = Son.SmallCat()
    val s3:Son = Son.SmallMonkey()
    val list = listOf<Son>(s1,s2,s3)
    for (v in list){
        if (v is Son.SmallMonkey){
        v.sayHello("我是小猴子")
    }else{
            v.sayHello("我不是小猴子。。。")
        }

    }

}