public class Student {
    public String name;
    public double mScore;
    public double fScore;

    public void showGrade() {
        double score = (mScore*0.4)+(fScore*0.4)+20;
        if (score >= 80 && score <= 100){
            name = "A";
        } else if(80 > score && score >= 70){
            name = "B";
        } else if(70 > score && score >= 60){
            name = "C";
        } else if(60 > score && score >= 50){
            name = "D";
        } else{
            name = "F";
        }
        System.out.println("Your grade is "+name);
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.mScore = 80;
        s.fScore = 80;
        s.showGrade();
    }
}
