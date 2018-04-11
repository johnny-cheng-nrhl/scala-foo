package example

import scala.io.Source

object CsvParser extends App {
  
  val bufferSource = Source.fromFile("/Users/johnny.cheng/Desktop/Book1.csv")

  for (line <- bufferSource.getLines.drop(1)) {
    val cols = line.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)").map(_.trim)
    // Do work
    println(s"${cols(0)}|${cols(1)}|${cols(2)}|${cols(3)}|${cols(4)}")
  }

  bufferSource.close
}
