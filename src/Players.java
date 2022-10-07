public class Players {
    private String name;
    private int age;
    private HeroClass heroClass;
    private Server server;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public HeroClass getHeroClass() {
        return heroClass;
    }

    public Server getServer() {
        return server;
    }

    public Players(String name, int age, HeroClass heroClass, Server server) {
        this.name = name;
        this.age = age;
        this.heroClass = heroClass;
        this.server = server;
    }
}