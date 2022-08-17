import scala.io.StdIn._
object Problem_03_Saas extends App {
  val t = readInt()
  Range(0,t).foreach { _ =>
    val y = readLine()
    println( y.replace('6'  , '#').reverse)

  }
//def convert( a: Int ) = {
//  val b = a.##
//}
//
}
