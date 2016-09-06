package it.cristiano.function.higher_order_function

/**
  * Created by cristiano on 9/6/16.
  *
  * When a function accepts other functions as arguments
  * or returns functions as values is called HIGHER ORDER FUNCTION (HOF)
  */
object Demo {

  def main(args: Array[String]) {
    println( apply( layout, 10) )
  }

  /**
    *
    * @param f : function as parameter
    * @param v : common Int parameter
    * @return
    */
  def apply(f: Int => String, v: Int) = f(v)

  def layout[A](x: A) = "[" + x.toString() + "]"

}
