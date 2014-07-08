My proposition for the FooBarQix kata, cf : http://www.code-story.net/2011/11/16/foobarqix.html

So far, I did three implementations one in Scala (tested with Scala 2.9), one in Jython (tested with Jython 2.5) and one with Rhino (tested with JDK 1.6.26)

How to run them ?
=================
	$ jython fooBarQix.py
	$ scala fooBarQix.scala
	$ javac FooBarQix.java && java FooBarQix
	
	
How to run the tests ?
======================
	$ jython fooBarQix.py | jython testFooBarQix.py
	$ scala fooBarQix.scala | jython testFooBarQix.py
	$ javac FooBarQix.java && java FooBarQix | jython testFooBarQix.py

	
Motivations
===========
Enough of Java at work, I wanted to play around with different languages and as the problem was simple, I wanted to do it as simple as possible and didn't want to use any frameworks. 