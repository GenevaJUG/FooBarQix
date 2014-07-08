#!/bin/sh
exec scala "$0" "$@" 
!#

object FooBarQix {
	
	val FBQs = scala.collection.immutable.SortedMap( 3->"Foo", 5->"Bar", 7->"Qix")
	
	def multiple(i:Int) = 
		FBQs.map(t => if(i%t._1==0) t._2 else "").reduceLeft(_+_)

	def occurence(i:Int) = 
		List(i/10, i%10).map( x => if(FBQs.contains(x)) FBQs(x) else "").reduceLeft(_+_)


	def foobarquix(i:Int) =
		 multiple(i) + occurence(i) match {
			case "" => i.toString
			case sm => sm
		}
	
	def main(args: Array[String]) {
		((1 to 100) map foobarquix) map println
	}	
}
FooBarQix.main(args)




