public class Exceptions {


    public static class InvalidPriceException extends Exception {

        public InvalidPriceException(String message) {
            super(message);
        }
    }


    public static class EmptyStringException extends Exception {

        public EmptyStringException(String message) {
            super(message);
        }
    }

    public static class Item {
        Integer price;
        String field2;

        public Item(Integer price, String field2) throws InvalidPriceException, EmptyStringException {
            if (price < 0) {
                throw new InvalidPriceException("Цена не может быть отрицательной, переданная цена" + price);
            }
            this.price = price;

            if (field2 == null) {
                throw new EmptyStringException("Строка н еможет быть пустой");
            }
            this.field2 = field2;
        }

    }

    public static void main(String[] args) {
        String price = "42";

        try {

            Item s = new Item(Integer.parseInt(price), "");
            System.out.println("Цена товра:" + s.price);
        } catch (InvalidPriceException | RuntimeException | EmptyStringException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Это выполняется всегда ");
        }
        System.out.println("Конец программы");
    }
}
