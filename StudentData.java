public class StudentData {
    String id;
    float studScore;
    String studName;
    String className;

    float[] scoreArr = new float[10];

    int index = 0;

    void initialStoreMark(String n, String i, String c, float sc){
        setStudName(n);
        setId(i);
        setClassName(c);
        setStudScore(sc);

    }

    void setStudName(String name){
        this.studName = name;
    }

    void setId(String id){
        this.id = id;
    }

    void setClassName(String cName){
        this.className = cName;
    }

    void setStudScore(float score) {

        this.studScore = score;
        scoreArr[index] = score;

    }

    float calcAvg(){
        float avg = 0;
        for(int i=0; i<scoreArr.length; i++){
            float total = 0;
            float val = scoreArr[i];
            total += val;
            avg = total / scoreArr.length;
        }

        return avg;
    }

    double calcSD()
    {
        double sum = 0.0, standardDeviation = 0.0;
        int length = scoreArr.length;

        for(double num : scoreArr) {
            sum += num;
        }

        double mean = sum/length;

        for(double num: scoreArr) {
            standardDeviation += Math.pow(num - mean, 2);
        }

        return Math.sqrt(standardDeviation/length);
    }

    public static void main(String[] args){
        StudentData stud = new StudentData();

        System.out.println("Average: " + stud.calcAvg());
        System.out.println("Standard Deviation: " + stud.calcSD());
    }
}
