public class FantasyBook extends Book implements BookPlace{

    private String genre;

    {
        genre = "Fantasy";
    }

    @Override
    public String getGenre() {
        return genre;
    }

    @Override
    public String section() {
        return "4 section";
    }

    @Override
    public String place() {
        return "middle";
    }

    @Override
    public String toString() {
        return "title: " + getTitle() +
                " , section: " + section() +
                " , place: " + place() +
                ", avtor: " + getAvtor() +
                ", genre: " + getGenre() +
                " , have now? " + ((isState()) ? "да" : "нет") +
                " , books: " + count;
    }
}
