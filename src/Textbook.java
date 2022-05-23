public class Textbook extends Book {
    private int edition_number;

    public Textbook(String bookTitle, double bookPrice,int en) {
        super(bookTitle, bookPrice);
        edition_number=en;
    }

    @Override
    public String getBookInfo() {
        return super.getBookInfo() + "-" + edition_number;
    }

    public boolean canSubstituteFor(Textbook other_textbook) {
        //if two textbook objects have the same title and if the edition of the current textbook is great
        if(other_textbook.getTitle()==getTitle() && getEdition()> other_textbook.edition_number){
            return true;
        }
        return false;
    }

    public int getEdition(){
        return edition_number;
    }

    public static void main(String[] args) {
        Textbook bio2015 = new Textbook("Biology",49.75,2);
        System.out.println(bio2015.getBookInfo());

        Textbook bio2019 = new Textbook("Biology", 39.75,3);
        System.out.println(bio2019.getEdition());
        System.out.println(bio2015.canSubstituteFor(bio2019));

        Textbook math = new Textbook("Calculus", 45.25,1);
        System.out.println(bio2015.canSubstituteFor(math));
    }
}