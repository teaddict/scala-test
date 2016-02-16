class Personel(name:String,age:Int,department:String){
    def print(){
        println(this.name + " " + this.age)
    }
}
class Developer(name:String,age:Int,language:String) extends Personel(name,age,"Developer") with Language {
    this.programmingLanguage = language
    override def print(){
        println(this.name + "\n" + this.age + "\n" + this.programmingLanguage)
        this.speak()
    }
}
trait Language {
    var programmingLanguage:String = ""
    def speak(){
        println("Speak Lisp: let let* ")
        println("flet labels defun defmethod defvar defparameter defsetf ..	")
    }
}

object Main extends App {
	// your dish goes here
	val developer = new Developer("Bruce Lee",30,"Lisp");
	developer.print()	
}
