public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[]{1,2,3,4,5,6,7,8,9,0};
        int searchNumber = 5;
        boolean isThere = false;

        for (int number : numbers) {
            if (number == searchNumber)
                isThere = true;
        }

        if (isThere) {
            System.out.println(searchNumber + " dizide bulunmaktadır.");
        } else {
            System.out.println(searchNumber + " dizide bulunmamaktadır.");
        }
    }
}