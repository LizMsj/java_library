public class RomanticBook extends Book implements BookPlace{

    private String genre;

    {
        genre = "Romantic";
    }

    @Override
    public String getGenre() {
        return genre;
    }

    @Override
    public String section() {
        return "5 section";
    }

    @Override
    public String place() {
        return "bottom";
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
