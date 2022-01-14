package creational.factorymethod;

class FactoryMethodDemo {
    public static void main(String[] args) {
        PetFactory petFactory = PetFactory.getInstance();
        petFactory.create("Cat").sound();
        petFactory.create("Dog").sound();
    }
}
