import sys



def assert_fbq(i, expected_fbq):
	global n_errors, fbqs
	fbq = fbqs[i-1]
	if fbq != expected_fbq:
		n_errors += 1
		print "%d supposed to return '%s' but got '%s'" % (i, expected_fbq, fbq)

def main():
	global n_errors, fbqs
	
	data = sys.stdin.readlines()
	fbqs = dict([(i,fbq.strip()) for (i,fbq) in enumerate(data)])
	n_errors = 0
	
	if len(fbqs) != 100:
		n_errors += 1
		print "Should have precisely 100 results but got %d" % len(fbqs)
	else :
		assert_fbq(1,"1")
		assert_fbq(2,"2")
		assert_fbq(3,"FooFoo")
		assert_fbq(4,"4")
		assert_fbq(5,"BarBar")
		assert_fbq(6,"Foo")
		assert_fbq(7,"QixQix")
		assert_fbq(8,"8")
		assert_fbq(9,"Foo")
		assert_fbq(13,"Foo")
		assert_fbq(15,"FooBarBar")
		assert_fbq(21,"FooQix")
		assert_fbq(33,"FooFooFoo")
		assert_fbq(51,"FooBar")
		assert_fbq(53,"BarFoo")

	if n_errors == 0:
		print "OK : Everything looks fine"
	else :
		print "FAIL : %d error(s) to fix" % (n_errors)


if __name__ == '__main__':
	main()
