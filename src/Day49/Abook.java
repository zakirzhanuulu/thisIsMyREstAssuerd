package Day49;

public class Abook extends Book{

    private double size;
    private int pages;



    public void readABook(int pageNum){

        System.out.println("Reading " + getTitle() + " by " + getAuthor() + " at page " + pageNum);

    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}
