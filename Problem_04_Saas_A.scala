import scala.io.StdIn._

object Problem_04_Saas_A extends App {
  val t = readInt()


  Range(0, t).foreach { _ =>
    val y = readLine().trim.split(" ").map(_.toInt)
    val acker = new ackermanfunction
    println( acker.fun(y(0),y(1)))


  }
  class ackermanfunction {
    def fun( x:Int , y:Int ):Int  =
      if ( x==0 ) y+1
      else if ( y ==0 ) fun ( x-1, 1 )
    else fun(x-1 , fun(x,y-1))
  }
}
  //class








