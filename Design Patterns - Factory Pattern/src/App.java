
public class App
{

	public static void main(String[] args)
	{
		Animal animalDog = AnimalFactory.createAnimal(AnimalFactory.DOG);
		Animal animalCat = AnimalFactory.createAnimal(AnimalFactory.CAT);
/*		Dog dog = new Dog();
		Cat cat = new Cat();

		cat.speak();
		dog.speak();*/
		animalDog.speak();
		animalCat.speak();
		animalCat.eat();
		animalDog.eat();
	}
}
