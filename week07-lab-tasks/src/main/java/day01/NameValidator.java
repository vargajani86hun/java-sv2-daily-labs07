package day01;

public class NameValidator {
    public boolean isNameValid(String name) {
        if (name == null) {
            throw new IllegalArgumentException("Name should not be null");
        }
        else if (!name.trim().contains(" ")) {
            throw new IllegalArgumentException("Name should be two words at least " + name);
        }
        return true;
    }
}
