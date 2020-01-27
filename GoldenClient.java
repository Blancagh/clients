public class GoldenClient extends Client {

    private char goldenLevel;

    public GoldenClient(int id, String firstName, String lastName, double amount) {
        super(id, firstName, lastName, amount);
        setGoldenLevel();
    }

    // Think about the convenience of making private this accessor method
    public void setGoldenLevel() {
        if (getAmount() > 10000)
            goldenLevel = 'H';
        else if (getAmount() > 5000)
            goldenLevel = 'M';
        else
            goldenLevel = 'L';
    }

    public char getGoldenLevel() {
        return goldenLevel;
    }

    public String toString() {
        return super.toString() + "Golden Level: " + goldenLevel + "\n";
    }
}