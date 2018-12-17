fun sum(a:Int,b:Int): Int {
	return a+b
}

fun main(args:Array<String>){
	val result:Int = sum(10,20)
	println(result)
	
	val x: Int= 100	//立即赋值
	val y = 200		//自动推断出`int`类型
	val z: Int		//如果没有初始值，类型不能省略
	z = 300			//明确赋值
	val result2 = sum(x,y)
	println(result2)
	val result3 = sum(x,z)
	println(result3)
}