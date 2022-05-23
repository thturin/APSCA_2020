import java.util.ArrayList;

public class ReviewAnalysis {
    private Review[] allReviews;

    public ReviewAnalysis(){

    }

    public double getAverageRating(){
        double sum=0;
        double mean=0;
        if(allReviews.length==0){
            return mean;
        }

        for(int i=0;i<allReviews.length;i++){
            sum+=allReviews[i].getRating();
        }
        mean=sum/allReviews.length;
        return mean;
    }

    public ArrayList<String> collectComments(){
        ArrayList<String> list = new ArrayList<String>();
        for(int i=0;i<allReviews.length;i++){
            if(allReviews[i].getComment().contains("!")){
                list.add(i+"-"+allReviews[i].getComment());
            }
        }
        return list;
    }

    public static void main(String[] args) {
        ReviewAnalysis ra = new ReviewAnalysis();
        Review[] list = new Review[5];
        ra.allReviews=list;
        Review r1 = new Review(4,"Good! Thx");
        Review r2 = new Review(3,"OK site");
        Review r3 = new Review(5,"Great!");
        Review r4 = new Review(2,"Poor! Bad.");
        Review r5 = new Review(3,"");
        list[0]=r1;list[1]=r2;list[2]=r3;list[3]=r4;list[4]=r5;

        System.out.println(ra.getAverageRating());

        ArrayList<String> list2 = ra.collectComments();

        for(int i=0;i<list2.size();i++){
            System.out.println(list2.get(i));
        }

    }
}
