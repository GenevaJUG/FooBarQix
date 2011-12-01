fbq = ((3,"Foo"), (5,"Bar"), (7,"Qix"))
fbqd = dict(fbq) # sadly, jython is so outdated and I can't use the ordereddict

for i in xrange(1,100):
	print "".join([s for n,s in fbq if i%n==0]) \
		+ "".join(map(lambda x : x in fbqd and fbqd[x] or "", [i/10, i%10])) \
		or i

