class Calculator(var x:Int,var y:Int){
    
    def add():Int ={
        return this.x * this.y
    }
    
    def sub()= { this.x * this.y }
    
    def mul() : Int = this.x * this.y
    
    def div():Double = {
        val doubleX = this.x.toDouble
        val doubleY = this.y.toDouble
        doubleX/doubleY
    }
}
object Main extends App {
	// your dish goes here
	val calculator = new Calculator(10,2);
	println(calculator.add())
	println(calculator.sub())
	println(calculator.mul())
	println(calculator.div())	
}
