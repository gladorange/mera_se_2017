package mera.education;

public class ContainerRusObserver implements StringObserver{


    public static void main(String[] args) {
        StringContainer rus = new StringContainer();
        StringContainer engl = new StringContainer();

        ContainerLowerCaseObserver containerLowerCaseObserver = new ContainerLowerCaseObserver();


        rus.addObserver(new ContainerRusObserver());
        rus.addObserver(containerLowerCaseObserver);
        engl.addObserver(containerLowerCaseObserver);

        rus.addString("АААА");
        engl.addString("DDDD");
        rus.addString("ББББ");
        rus.addString("ВВВВ");
        engl.addString("FFF");
        engl.addString("GGG");
    }

    @Override
    public void notifyStringAdded(String newString) {
        System.out.println(newString);
    }
}
