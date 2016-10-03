package it.cristiano.folding

/**
  * Created by cristiano on 9/9/16.
  */
object FoldLeft02 {

  def main(args: Array[String]): Unit = {

    val list = List(1,2,3,4)
    val res1 = list.foldLeft(10)(_ + _)
    println(s"res1 $res1")

    println("--------------------")

    val resLeft = (list foldLeft 10) {
      case (x,y) => println(x + " " + y); x+y
      case _     => -1
    }
    println(s"resLeft $resLeft")

    println("--------------------")

    val resRight = (list foldRight  10) {
      case (x,y) => println(x + " " + y); x
      case _     => -1
    }
    println(s"resRight $resRight")

    println("--------------------")

    val resFold = (list fold  10) {
      case (x,y) => println(x + " " + y); x+y
      case _     => -1
    }

    println(s"resFold $resFold")

  }

}
