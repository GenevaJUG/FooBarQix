package net.antoinecomte.jugcontest

import org.specs2._

class SpecFooBarQixTest extends SpecificationWithJUnit {
  def is = """ Ecrivez un programme qui affiche les nombres de 1 à 100. Un nombre par ligne. Respectez les règles suivantes :"  ^

 * Si le nombre est divisible par 3 ou contient 3, écrire "Foo" à la place de 3."
 * Si le nombre est divisible par 5 ou contient 5, écrire "Bar" à la place de 5.
 * Si le nombre est divisible par 7 ou contient 7, écrire "Qix" à la place de 7.

""" ^
    p ^
    """
Voici un exemple de rendu
=========================
    1
    2
    FooFoo
    4
    BarBar
    Foo
    QixQix
    8
    Foo
    Bar
    ...""" ! e1 ^
    p ^
    """
Mise à jour : clarifications sur les règles
===========================================

 * On regarde les diviseurs avant le contenu (ex: 51 -> FooBar)
 * On regarde le contenu dans l'ordre où il apparait (ex: 53 -> BarFoo)
 * On regarde les multiples dans l'ordre Foo, Bar puis Qix (ex: 21 -> FooQix)
 * 13 contient 3 donc s'écrit "Foo"
 * 15 est divisible par 3 et 5 et contient un 5 donc s'écrit "FooBarBar"
 * 33 contient deux fois 3  et est divisible par 3 donc s'écrit "FooFooFoo"
 """ ! e2 ^
    end

  import FooBarQix._

  def e1 = List("1", "2", "FooFoo", "4", "BarBar", "Foo", "QixQix", "8", "Foo", "Bar") must_== (1 to 10).map(compute _)

  def e2 = List("FooBar", "BarFoo", "FooQix", "Foo", "FooBarBar", "FooFooFoo") must_== List(51, 53, 21, 13, 15, 33).map(compute _)

  def ee = "1" must_== compute(1)

}
