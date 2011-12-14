fbq = ((3,"Foo"), (5,"Bar"), (7,"Qix"))
fbqd = dict(fbq) # sadly, jython is so outdated and I can't use the ordereddict

for i in xrange(1, 101):
	# see if i is a multiple of 3,5,7, get the prefixes and concatenate them
	out = "".join([s for n,s in fbq if i%n==0]) 
	
	# For a number i in the interval I=[1:100], we construct a list representing the 
	# coefficient of it's polynom decomposition 8 = 0*10^1 + 8*10^0 -> [0,8] 
	# Given this list, we match it against the prefixes and concatenate them 
	out += "".join(map(lambda x : x in fbqd and fbqd[x] or "", [i/10, i%10])) 
	
	# If we haven't been able to use any of the prefixes, we display the original number
	print out or i

