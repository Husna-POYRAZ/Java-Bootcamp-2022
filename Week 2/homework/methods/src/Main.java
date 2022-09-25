public class Main {
    public static void main(String[] args) {
        findNumber();
    }

    public static void findNumber() {
        int[] numbers = new int[]{1,2,3,4,5,6,7,8,9,0};
        int searchNumber = 7;
        boolean isThere = false;

        for (int number : numbers) {
            if (number == searchNumber)
                isThere = true;
        }

        if (isThere) {
            sendMessage(searchNumber + " dizide bulunmaktadır.");
        } else {
            sendMessage(searchNumber + " dizide bulunmamaktadır.");
        }
    }

    public static void sendMessage(String message) {
        System.out.println(message);
    }
}