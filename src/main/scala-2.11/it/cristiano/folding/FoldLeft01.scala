package it.cristiano.folding

/**
  * Created by cristiano on 9/7/16.
  */
object FoldLeft01 {

  def main(args: Array[String]): Unit = {

    var deductions: Vector[Deduction] = Vector.empty
    val deduction01 = Deduction("one",1)
    val deduction02 = Deduction("two",2)

    deductions = deductions :+ deduction01 :+ deduction02

    println("deductions " + deductions)

    println("result " + valueFromFoldLeft())

    def valueFromFoldLeft(): Double = {
      (deductions foldLeft 10) {
        case (total, Deduction(deduction, amount)) => println( "deduction " + deduction +  " total " + total) ; 100
      }
    }

  }

  case class Deduction(name: String, amount: Double) {
    override def toString = s"$name: $amount"
  }

}
