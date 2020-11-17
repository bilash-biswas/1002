object Main {
  def main(args:Array[String]){
    val n = 3.14159
    var a = scala.io.StdIn.readDouble()
    println("A=%.4f".format(n * a * a))
  }
}
