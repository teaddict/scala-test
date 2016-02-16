class Calculation{
    
    def multiplier1(x:Int,y:Int):Int ={
        return x * y
    }
    
    def multiplier2(x:Int,y:Int)= { x * y }
    
    def multiplier3(x:Int)(y:Int) : Int = x * y
    
    val multiplier4 = (x:Int,y:Int) => x * y
}
object Main extends App {
	// your dish goes here
	val calculate = new Calculation();
	println(calculate.multiplier1(3,5))
	println(calculate.multiplier2(3,5))
	println(calculate.multiplier3(3)(5))
	println(calculate.multiplier4(3,5))
	
}
