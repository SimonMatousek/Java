public class Pirate {
    protected int toxic;
    private int drinks;
    protected boolean dead;
    public int drinkSomeRum() {
        this.drinks++;
        return this.toxic--;
    }
    public String howsItGoingMate() {
        return "How is going mate";
    }
    public String drinks() {
        if (this.drinks < 4){
            return "Pour me anudder";
        } else {
            this.toxic = 0;
            return "Arghh, I'ma Pirate. How d'ya d'ink its goin";
        }
    }
}
