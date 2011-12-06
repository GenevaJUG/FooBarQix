import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class FooBarQix {
	public static void main(String[] args) {
		ScriptEngineManager mgr = new ScriptEngineManager();
		ScriptEngine engine = mgr.getEngineByName("JavaScript");

		try {
			
			engine.eval(
			  " var i, out, rule, fbq;                                                     " 
			+ "                                                                            "
			+ " var FBQs = [{n:3, r:'Foo'}, {n:5, r:'Bar'}, {n:7, r:'Qix'}];               "
			+ "                                                                            "
			+ " var rules = [                                                              "
			+ "    function(fbq, i){ return (i%fbq.n==0)? fbq.r : ''; },                   "
			+ "    function(fbq, i){ return (Math.floor(i/10)==fbq.n)? fbq.r : ''; },      "
			+ "    function(fbq, i){ return (i%10==fbq.n)? fbq.r : ''; }                   "
			+ " ];                                                                         "
			+ "                                                                            "
			+ " for(i=1; i<=100; ++i) {                                                    "
			+ "    var out = '';                                                           "
			+ "    for each (rule in rules) {                                              "
			+ "        for each (fbq in FBQs) {                                            "
			+ "            out += rule(fbq, i, out);                                       "
			+ "        }                                                                   "
			+ "    }                                                                       "                                
			+ "    println(out || i);                                                      "                             
			+ " }                                                                          ");
			
		} catch (ScriptException ex) {
			ex.printStackTrace();
		}
	}
}
