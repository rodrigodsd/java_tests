package factory;

interface ProductInterface {
    public void display();
}

// Concrete Products
class ConcreteProductC implements ProductInterface {
    @Override
    public void display() {
        System.out.println("This is Concrete Product C.");
    }
}

class ConcreteProductD implements ProductInterface {
    @Override
    public void display() {
        System.out.println("This is Concrete Product D.");
    }
}

// Creator Abstract Class
interface Factory {
    public Product factoryMethod();
}

// Concrete Creators
class ConcreteFactoryC implements Factory {
    @Override
    public Product factoryMethod() {
        return new ConcreteProductA();
    }
}

class ConcreteFactoryD implements Factory {
    @Override
    public Product factoryMethod() {
        return new ConcreteProductB();
    }
}
public class InterfaceExample {

    public static void main(String[] args) {
        Factory creatorC = new ConcreteFactoryC();
        Product productC = creatorC.factoryMethod();
        productC.display();

        Factory creatorD = new ConcreteFactoryD();
        Product productD = creatorD.factoryMethod();
        productD.display();
    }
}
