package net.antoinecomte.jugcontest

object FooBarQix {
  def main(args: Array[String]) {
    (1 to 100).map(compute _) foreach (println _)
  }

  def compute(i: Int) = {
    val s = applyModuloRule(i) + applySubstitutionRule(i)
    if (s.isEmpty) i.toString else s
  }

  def applyModuloRule(i: Int) = List(3 -> "Foo", 5 -> "Bar", 7 -> "Qix").map(v => if (i % v._1 == 0) v._2 else "").reduceLeft(_ + _)

  def applySubstitutionRule(i: Int) = i.toString.map(_ match {
    case '3' => "Foo"
    case '5' => "Bar"
    case '7' => "Qix"
    case _ => ""
  }).reduceLeft(_ + _)

}