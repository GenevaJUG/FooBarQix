package net.antoinecomte.jugcontest

object FooBarQix {
  def main(args: Array[String]): Unit = {
    compute(1 to 100) map println
  }

  def compute(numbers: Seq[Int]) = numbers.map(i => {
    val s = substitute(i, modulos(i)).foldLeft("")(_ + _)
    if (s.isEmpty) i.toString else s
  })

  def modulos(i: Int) = List(modulo3(i), modulo5(i), modulo7(i))

  def substitute(number: Int, modulos: Seq[String]) = modulos ++ number.toString.map(_ match {
    case '3' => "Foo"
    case '5' => "Bar"
    case '7' => "Qix"
    case _ => ""
  })

  def modulo(i: Int, n: Int, s: String) = if (i % n == 0) s else ""
  def modulo3(i: Int) = modulo(i, 3, "Foo")
  def modulo5(i: Int) = modulo(i, 5, "Bar")
  def modulo7(i: Int) = modulo(i, 7, "Qix")

}