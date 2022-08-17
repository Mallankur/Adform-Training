object Problem_02 extends App {
  import java.time.LocalDate
  import java.util.jar.Attributes.Name

  object sum extends App {
    var wordCount = 0
    val source1 = scala.io.Source.fromFile(this.getClass.getResource("new 4.txt").toURI)
    val csvData1 = source1.getLines()

    csvData1.foreach(line => {
      val temp = line.trim.split("\\s+")
      wordCount += temp.length
      //    println(temp.toList)
    })

    println("wordCount: " + wordCount)
  }



}
