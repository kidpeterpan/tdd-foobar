public class FooBar {
    private int input;

    public FooBar(int input) {
        this.input = input;
    }

    public String getResult() {
        if (this.input % 15 == 0)
            return "FooBar";
        else if (this.input % 5 == 0)
            return "Bar";
        else if (this.input % 3 == 0)
            return "Foo";
        return String.valueOf(input);

    }
}
