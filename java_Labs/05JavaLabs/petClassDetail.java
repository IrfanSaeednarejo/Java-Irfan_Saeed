

abstract class Animal
{
	protected int legs;
	protected Animal(int legs)
	{
		this.legs = legs;	
	}
	abstract void eat();
	void walk()
	{
		System.out.println("Animal walk");
	}

}
class spider extends Animal
{
//int leg = 8;
 	spider()
	{
	super(8);
	}
	
	void eat()
	{
		System.out.println("Spider is eating");
	}

}

interface pet
{
	
	public void setName(String name);
	
	public String getName();
	
	public void play();
	
}

class cat extends Animal implements pet
{
	String name;
	public cat(String name)
	{
		super(4);
		this.name = name;
	}
	public cat()
	{
		this("");
	}
	public void  setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
	public void play()
	{
		System.out.println("Cat plays and Enjoys");
	}
	public void eat()
	{
		System.out.println("cat eats and feeling Yumms");
	}
}

class fish extends Animal implements pet
{
	public void walk()
	{
		System.out.println("Fish can't walk");
	}
	fish()
	{
		super(0);
		
	}
	String name;
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
	public void play()
	{
		System.out.println("Fish is playing for Fun in the pool");
	}
	
}
	
public class TestAnimals {
    public static void main(String[] args) {
        Fish f = new Fish();
        Cat c = new Cat("Rachel");
        Animal a = new Fish();
        Animal e = new Cat ();

        //Demostrate different implementations of an interface
        f.play();
        c.play();

        //Demostrate virtual method invocation
        e.eat();
        e.walk();

        //Demostrate calling super methods
        a.walk();
    }
}
