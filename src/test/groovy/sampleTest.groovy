class sampleTest extends GroovyTestCase{
	void testVariableValue(){
		def x = 1;
		println "Check if $x == 1";
		assert x == 1;
	}

	void testArraySize(){
		def x = [1,2,3];
		println "Check array $x size == 3";
		assert x.size() == 3;
	}

	void testPersonClass(){
		def person = new Person(name:"David OBrien");
		assert person.name == "David OBrien";
		println "The persons name is $person.name.";
	}
}

class Person{
	def name;
}