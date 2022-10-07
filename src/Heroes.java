public final class Heroes extends TypesOfHeroes{

    public Heroes(String name, int age, HeroClass heroClass, Server server) {
        super(name, age, heroClass, server);
    }

    @Override
    public void makeHit() {
        System.out.println("ууудаар мечом");
    }
}



