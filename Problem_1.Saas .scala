import scala.io.StdIn.{readInt, readLine}

object Problem_1 extends App {
  val t = readInt()
  Range(0,t).foreach { _ =>
    val y = readLine().split(" ").map(_.toInt)


    val res3 = new invalid(y(0), y(1), y(2))
    val res0 = new rightangletriangle(y(0), y(1), y(2))
    val res1 = new isoscelstriangle(y(0), y(1), y(2))
    val res2 = new equilateral(y(0), y(1), y(2))
    val res4 = new notspecial(y(0), y(1), y(2))

  }


  trait Triangle{
    val right:Boolean
    val valid: Boolean
  }

  class equilateral(val a: Int, var b: Int, var c: Int) extends Triangle {
    val valid=a + b > c && b+c >a && a+c > b
    if (a == b && b == c && valid) println(" equilteral")
    val right= tolerance(a,b,c)
  }

  class invalid(val a: Int, val b: Int, val c: Int) extends Triangle {
    val valid=a + b > c && b+c >a && a+c > b
    if (!valid){
      println("invalid ")
    }
    val right= tolerance(a,b,c)
  }

  class isoscelstriangle(val a: Int, val b: Int, val c: Int) extends Triangle {
    val valid=a + b > c && b+c >a && a+c > b
    if (((a == b && b != c) || (b == c && c != a)) && !right && valid) println(" isosceles ")
    val right= tolerance(a,b,c)
  }
  class rightangletriangle(val a: Int, val b: Int, val c: Int) extends Triangle {
    val valid=a + b > c && b+c >a && a+c > b
    if (((a * a + b * b) == c * c || b*b + c*c == a*a  || a*a + c*c == b*b ) && valid) println(" right-angled ")
    val right= tolerance(a,b,c)
  }
  class notspecial( val a : Int , val b : Int , val c : Int ) extends  Triangle {
    val valid = a + b > c && b + c > a && a + c > b
    val right = tolerance(a,b,c)
    if ((a != b && b != c) && valid && !right) println(" notspecial")
  }

  def tolerance(a: Int, b: Int, c: Int): Boolean =
    (a * a + b * b - c * c).abs < 0.00001 || (b * b + c * c - a * a).abs < 0.000001 || (a * a + c * c - b * b).abs < 0.00001
}



