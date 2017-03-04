
public class Cat extends AbstractAnimal implements Animal
{

	@Override
	public void speak()
	{
		System.out.println("Miau!");
	}
	@Override
	public void eat()
	{
		System.out.println("Cat is eating");
		System.out.println("om om om om ....");
	}
}
