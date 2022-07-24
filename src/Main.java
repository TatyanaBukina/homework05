public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // Задание1,2

        int[] boxs = new int[3];
        boxs[0] = 1;
        boxs[1] = 2;
        boxs[2] = 3;
        for (int i = 0; i < boxs.length - 1; i++) {
            System.out.print(boxs[i] + ", ");
        }
        System.out.print(boxs[boxs.length - 1]);

        System.out.println();

        double[] secondArray = {1.57, 7.654, 9.986};
        for (int i = 0; i < secondArray.length - 1; i++) {
            System.out.print(secondArray[i] + ", ");
        }
        System.out.print( secondArray[secondArray.length - 1]);

        System.out.println();

        int weeks[] = {1, 2, 3, 4, 5, 6, 7};
        for (int i = 0; i < weeks.length - 1; i++) {
            System.out.print(weeks[i] + ", ");
        }
        System.out.print(weeks[weeks.length - 1]);

            System.out.println();


            // zadanie 3
       int counter = (boxs.length - 1);
       while (counter>0){
       System.out.print(boxs [counter]+ ", ");
       counter--;
}
        System.out.println(boxs[0]);

        System.out.println();

        int account = (secondArray.length - 1);
        while (account>0){
            System.out.print(secondArray[account]+ ", ");
            account--;
        }
        System.out.println(secondArray[0]);

        System.out.println();

        int back = (weeks.length - 1);
        while (back>0){
            System.out.print(weeks[back]+ ", ");
            back--;
        }
        System.out.println(weeks[0]);

        System.out.println();

        // zadanie 4
        for (int i = 0; i < boxs.length; i++) {
            if (boxs[i]%2!=0) boxs[i]++;
            System.out.print(boxs[1]+ "  ");
        }
        System.out.println();

        
        for (int i = 0; i < weeks.length; i++) {
            if (weeks[i]%2!=0) weeks[i]++;
            System.out.print(weeks[1]+ "  ");
        }
    }}

