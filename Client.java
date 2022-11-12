public class Client extends People{

    private String[] processBook;

    public String[] getProcessBook() {
        return processBook;
    }

    public void setProcessBook(String[] processBook) {
        this.processBook = processBook;
    }

    public String takeBook(String book) {
        int l = processBook.length;
        String[] processBook1 = new String[l + 1];
        int i = 0;
        for (String a : processBook) {
            processBook1[i] = a;
            i++;
        }
        processBook1[l + 1] = book;
        processBook = processBook1;
        return "Your book, please!>>";
    };

    public String giveBook(String book) {
        int l = processBook.length;
        String[] processBook1 = new String[l - 1];
        int i = 0;
        for (String a : processBook) {
            if (a != book) {
                processBook1[i] = a;
                i++;
            }
        }
        processBook = processBook1;
        return "You book is given>>>";
    };

    @Override
    public String talk() {
        return "Hello! Can I have a book?>>";
    }
}
