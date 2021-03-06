package it.cristiano.typesystem

/**
  * Created by cristiano on 9/6/16.
  */
object SelfTypeAnnotation {

  def main(args: Array[String]): Unit = {
    val c1 = new C1
    c1.talk("Hello")
    c1.c2.c3.talk("World")
  }

}

class C1 { self =>
  def talk(message: String) = println("C1.talk ** " + message)
  class C2 {
    class C3 {
      def talk(message: String) = self.talk("C3.talk -- " + message)
    }
    val c3 = new C3
  }
  val c2 = new C2
}
