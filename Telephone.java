abstract class telephone {

    abstract void sakti();
    public int ram;
 
    public telephone(int ram)
    {
        this.ram = ram
    }
    
    public String toString()
    {
        return ("Most phone has " + ram + "gb of ram");
    }
}

class telephoneiphone extends telephone {
  
    public int memory;
 
    public telephoneiphone(int ram, int memory1)
    {

        back(ram);
        memory = memory1;
    }
 
    @Override public String toString()
    {
        return (back.toString() +" and"
                + memory +"gb of memory");
    }
}

private class telephoneandroid extends telephone { //encapsulation - private
  
    public string OS;
 
    public telephoneandroid(int ram, int memory1,string OS1)
    {

        software(ram, memory);
        OS = OS1;
    }
 
 
    @Override public String toString()
    {
        return (software.toString() +" but android has "
                + memory +" as the OS");
    }
}

class nokia extends telephone { //polymorphism
	void say () {
		System.out.println("nokia paling kuat");
	}
  void sakti() {
		System.out.println("saya pernah tawuran pakai nokia");
	}
}

class Test{
    public static void main(String[] args){
    
    telephoneiphone iph = new telephoneiphone(4, 32);
    telephoneandroid and = new telephoneandroid(4, 32, android);
        System.out.println(iph.toString());
        System.out.println(and.toString()); //gk ke print karena private
    telephone fansnokia;
		fansnokia = new nokia();
		fansnokia.say();
    fansnokia.sakti();
    }
}