package it.cristiano.function

/**
  * Created by cristiano on 9/6/16.
  *
  * Typically, parameters to functions are by-value parameters; that is,
  * the value of the parameter is determined before it is passed to the function.
  *
  * CALL by NAME : When a function is evaluated when the called function is executed.
  *
  */
object CallByName {

  def main(args: Array[String]): Unit = {
    delayed(time());
    println("--------------------------")
    byValue(time())
  }

  def time() = {
    println("Getting time in nano seconds")
    System.nanoTime
  }

  // call by name
  def delayed( t: => Long ) = {
    println("In delayed method")
    println("Param: " + t)
  }

  // call by value
  def byValue (p: Long) = {
    println("In byValue method")
    println("Param: " + p)
  }

}
