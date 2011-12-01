#!/bin/sh
exec scala "$0" "$@" 
!#

object HelloWorld {

	val FBQ = List((3,"Foo"), (5,"Bar"), (7,"Qix"))
	
	def multiple(i:Int) = 
		FBQ.map(t => if(i%t._1==0) t._2 else "").reduceLeft(_+_)
	
	def occurence(i:Int) = List(i/10, i%10).map( x => x match {
			case 3 => "Foo"
			case 5 => "Bar"
			case 7 => "Qix"
			case _ => ""
		}).reduceLeft(_+_)
	
	def foobarquix(i:Int) =
		 multiple(i) + occurence(i) match {
			case "" => i.toString
			case sm => sm
		}
	
	def main(args: Array[String]) {
		args match {
			case Array("-test",_) => testIt()
			case Array(_) => ((1 to 100) map foobarquix) map println
			case _ => println ("./fooBarQuixInYourFace.scala [-test]")
		}
	}

	//////////// Testing part /////////////////
	
	def testIt() {	
		val EXPECTED_RESULTS = List(
			(1,"1"),
			(2,"2"),
			(3,"FooFoo"),
			(4,"4"),
			(5,"BarBar"),
			(6,"Foo"),
			(7,"QixQix"),
			(8,"8"),
			(9,"Foo"),
			(13,"Foo"),
			(15,"FooBarBar"),
			(21,"FooQix"),
			(33,"FooFooFoo"),
			(51,"FooBar"),
			(53,"BarFoo")
		)
		
		val ok = (EXPECTED_RESULTS map (assertFbq _).tupled).reduceLeft(_&&_)
		if(ok)
			println("Everything is ok")
	}
	
	def assertFbq(i:Int, s:java.lang.String):Boolean = { 
		val fbq = foobarquix(i)
		val ok = fbq == s
		if(!ok) 
			println ("%d supposed to return '%s' but got '%s'" format (i, s, fbq))
		ok
	}
	
	
}
HelloWorld.main(args)




