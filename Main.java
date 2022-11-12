public class Main {
    public static void main(String[] args) {
        Library lib = new Library();
        System.out.println(lib.place());

        Book a = new FantasticBook();
        a.setTitle("Poly elf");
        a.setAvtor("R. Toplet");
        System.out.println(a.toString());

        Book b = new FantasyBook();
        a.setTitle("Earth");
        a.setAvtor("A. Erno");
        System.out.println(a.toString());

        Book c = new RomanticBook();
        a.setTitle("Roza");
        a.setAvtor("U. Riom");
        System.out.println(a.toString());

        Client Tom = new Client();
        Tom.setName("Tom");
        System.out.println(Tom.talk());

        Worker Ann = new Worker();
        Ann.setProfession("Biblio");
        Ann.setName("Ann");
        Ann.setAge(28);
        System.out.println(Ann.talk());
        System.out.println(Ann.serveClient());

        HeadWorker director = new HeadWorker();
        director.setName("Jenis");
        director.setSurname("Jobrins");
        System.out.println(director.talk());
    }
}
