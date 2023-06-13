package ru.gb.hw4;

public class Main {
    public static void main(String[] args) {
        String[][] arr = {{"1", "ASD", "1", "1"}, {"2", "2", "2", "2"}, {"3", "3", "3", "3"}, {"4", "4", "4", "4"}};
        printArray(arr);
        System.out.println();
        try {
            System.out.printf("Sum = %s", sumAll(arr));
        } catch (MyArraySizeException e) {
            System.out.println(e.getMessage());
        } catch (MyArrayDataException e) {
            System.out.printf("%s, incorrect data in cell: [%s] [%s]", e.getMessage(), e.getI(), e.getJ());
        }


    }

    /**
     * @param inputArray array to convert and sum values
     * @return sum of array values
     * @throws MyArrayDataException exception array data
     * @throws MyArraySizeException exception array size
     */
    public static int sumAll(String[][] inputArray) throws MyArrayDataException, MyArraySizeException {
        int sum = 0;
        if (inputArray.length != 4) {
            throw new MyArraySizeException("Incorrect size of array");
        }
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i].length != 4) {
                throw new MyArraySizeException("Incorrect size of array");
            }
            for (int j = 0; j < inputArray[i].length; j++) {
                try {
                    sum += Integer.parseInt(inputArray[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j, e.getMessage());
                }
            }
        }
        return sum;
    }

    public static void printArray(String[][] array) {
        for (String[] s : array) {
            for (String str : s) {
                System.out.printf(str + " ");
            }
            System.out.print(" ");
        }
    }
}