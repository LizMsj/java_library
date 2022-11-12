public class FantasticBook extends Book implements BookPlace{

    private String genre;

    {
        genre = "Fantastic";
    }

    @Override
    public String getGenre() {
        return genre;
    }

    @Override
    public String section() {
        return "3 section";
    }

    @Override
    public String place() {
        return "top";
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
