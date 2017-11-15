public class Collections {

    public static class OurList<PARAMETER> {
        private PARAMETER[] items = (PARAMETER[]) new Object[2];
        int length = 0;

        public void add(PARAMETER item) {
            if (length == items.length - 1) {
                Object[] old = items;
                items = (PARAMETER[]) new Object[old.length * 2];
                for (int i = 0; i < old.length; i++) {
                    PARAMETER o = (PARAMETER) old[i];
                    items[i] = o;
                }
            }
            items[length++] = item;
        }

        public int getLength() {
            return length;
        }

        public PARAMETER get(int i) {
            if (i >= length) {
                throw new ArrayIndexOutOfBoundsException("Слишком много индексов");
            }
            return items[i];
        }
    }

    public static void main(String[] args) {
        OurList<String> stringList = new OurList<>();
        stringList.add("1ss");
        stringList.add("2dd");
        stringList.add("3ff");
        OurList<Integer> intList = new OurList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);

        for (int i = 0; i < stringList.getLength(); i++) {
            String  x = stringList.get(i);
            System.out.println(x.toUpperCase());
        }


        for (int i = 0; i < intList.getLength(); i++) {
            Integer x = intList.get(i);
            System.out.println(x);
        }

    }
}
