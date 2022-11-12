public final class HeadWorker extends People{
    private String surname;

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String talk() {
        return "I " + getName() + " " + getSurname() + ". Any complaints?";
    }
}
