import java.util.Scanner
fun main(args: Array<String>) {
    val read = Scanner(System.`in`)
    var num1 = read.nextDouble()

    println("A=%.4f".format(num1 * num1 * 3.14159))
}
