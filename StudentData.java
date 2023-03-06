public class StudentData {
    String id;
    float studScore;
    String studName;
    String className;

    float[] scoreArr = new float[10];

    int index = 0;

    public void setStudName(String name){
        this.studName = name;
    }

    public void setId(String id){
        this.id = id;
    }

    public void setClassName(String cName){
        this.className = cName;
    }

    public void setStudScore(float score) {

        this.studScore = score;
        scoreArr[index] = score;

    }

    public float calcAvg(){
        float avg = 0;
        for(int i=0; i<scoreArr.length; i++){
            float total = 0;
            float val = scoreArr[i];
            total += val;
            avg = total / scoreArr.length;
        }

        return avg;
    }

    public double calcSD()
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
        StudentData data1 = new StudentData();



        System.out.println("Average: " + data1.calcAvg());
        System.out.println("Standard Deviation: " + data1.calcSD());
    }


}
