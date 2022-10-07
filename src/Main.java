public class Main {
    public static void main(String[] args) {
        Server server = new Server("swordArtonline");
        TypesOfHeroes typesOfHeroes = new TypesOfHeroes("Кирито", 18, HeroClass.Sword, server);
        System.out.println(typesOfHeroes.getInfo());
        typesOfHeroes.dangerous("удар мечо света");
        typesOfHeroes.makeHit();

        System.out.println("______");

        Server server1 = new Server("wrbd");
        Heroes heroes2 = new Heroes("Асуна", 17,HeroClass.Sword, server);
        Heroes heroes3 = new Heroes("Юки", 15,HeroClass.Healer, server);
        System.out.println(heroes2.getInfo()); typesOfHeroes.dangerous("Юки хиляет Асуну");
        typesOfHeroes.makeHit();

        System.out.println("________");

        System.out.println(heroes3.getInfo());
        heroes3.dangerous("удар магги");
        heroes3.makeHit(); }
}