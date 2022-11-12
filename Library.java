public class Library {
    private String[] listBooks;
    private String[] listClients;
    private String[] listWorkers;

    public String[] getListBooks() {
        return listBooks;
    }

    public void setListBooks(String[] listBooks) {
        this.listBooks = listBooks;
    }

    public String[] getListClients() {
        return listClients;
    }

    public void setListClients(String[] listClients) {
        this.listClients = listClients;
    }

    public String[] getListWorkers() {
        return listWorkers;
    }

    public void setListWorkers(String[] listWorkers) {
        this.listWorkers = listWorkers;
    }

    public String place() {
        return "Address library: on city center.";
    }
}
