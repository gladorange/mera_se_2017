import javafx.beans.property.SimpleObjectProperty;

public class HW2_3
{
    public static void main(String args[])
    {
        int array[]={14,6,7,30,55,190,230,2,666,43};

        int max = 0;
        int index = 0;

        for (int i=0; i<10; i++) {
            
            if(array[i]>100)
                break;

            if (array[i] > max) {
                max = array[i];
                index =i;

            }


        }
        System.out.print("The max value is "+ max + ", index =" + index);

    }



    }

