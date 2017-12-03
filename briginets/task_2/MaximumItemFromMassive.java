import java.util.Arrays;

public class MaximumItemFromMassive {
    public static void main(String[] args) {

        int[] myMassive = {50, 99, 75, 120, 20, 25, 0, 10, 70, 55};
        int valueOfZeroElement = myMassive[0];
        int MAX_VALUE_OF_ELEMENT = 100;
        int maxIndex = 0;

        Arrays.sort(myMassive);

        System.out.print("Все элементы массива myMassive: ");
        for (int i = 0; i < myMassive.length; i++) {
            System.out.print(myMassive[i] + " ");

            if (myMassive[i] > MAX_VALUE_OF_ELEMENT){
                System.out.print("\n" + "Warning: " + "В массиве myMassive имеется(имеются) элемент(-ты) больше 100. " +
                        "Числа больше 100 не рассматриваются");
                break;
            }

            if (myMassive[i] > valueOfZeroElement){
            valueOfZeroElement = myMassive[i];
                maxIndex=i;
            }
        }
        System.out.println("\n" + "Максимальное значение в массиве myMassive: " + valueOfZeroElement);
    }

}