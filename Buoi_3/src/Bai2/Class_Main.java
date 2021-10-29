package Bai2;

public class Class_Main {
    public static void main(String[] args) {
        Class_Array arr1 = new Class_Array();
        Class_Array arr2 = new Class_Array();
        System.out.println("Input Array1: ");
        arr1.InputData();
        System.out.println("Input Array2: ");
        arr2.InputData();

        float avg1;
        if(arr1.getN()==0){
            avg1=0;
        }
        else{
            avg1=(float)arr1.Sum()/arr1.getN();
        }
        float avg2;
        if(arr2.getN()==0){
            avg2=0;
        }
        else{
            avg2=(float)arr2.Sum()/arr2.getN();
        }
        arr1.Show();
        if(avg1>avg2){
            System.out.println("Array 1");
        }else if(avg1<avg2){
            System.out.println("Array 2");
        }else{
            System.out.println("Bye!");
        }


    }
}
