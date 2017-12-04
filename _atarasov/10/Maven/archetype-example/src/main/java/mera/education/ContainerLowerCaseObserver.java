package mera.education;

public class ContainerLowerCaseObserver implements StringObserver {
    @Override
    public void notifyStringAdded(String newString) {
        System.out.println(newString.toLowerCase());
    }
}
