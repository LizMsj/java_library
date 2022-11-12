public class Worker  extends People{
    private String profession;
    private int age;

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String serveClient(){
        return "Can I help you?";
    };

    @Override
    public String talk() {
        return "Welcome to city's library.";
    }
}
