
public class Dog extends AbstractAnimal implements Animal
{

	@Override
	public void speak()
	{
		System.out.println("Woof!");
	}
	@Override
	public void eat()
	{
		System.out.println("Dog is eating");
		System.out.println("om om om om ....");
	}
}
