public class TypesOfHeroes extends Players {
    public TypesOfHeroes(String name, int age, HeroClass heroClass, Server server) {
        super(name, age, heroClass, server);
        this.server = server;
    }

    private Server server;


    public Server getServer() {
        return server;
    }

    public void makeHit() {
        System.out.println("удар мечом");
    }

    public void dangerous(String answer) {
        System.out.println(answer);
    }

    public final String getInfo() {
        return "Name: " + getName() +
                "\nAge: " + getAge() +
                "\nHero Class " + getHeroClass() +
                "\nServer: " + getServer();
    }

}
