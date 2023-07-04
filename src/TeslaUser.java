public class TeslaUser {
    private String email;
    private boolean payement;
    private int scoreConduite;
    private boolean enregisterUS;

    public TeslaUser(String email, boolean payement, int scoreConduite, boolean enregisterUS) {
        this.email = email;
        this.payement = payement;
        this.scoreConduite = scoreConduite;
        this.enregisterUS = enregisterUS;
    }

    public String getEmail() {
        return email;
    }

    public boolean isPayement() {
        return payement;
    }

    public int getScoreConduite() {
        return scoreConduite;
    }

    public boolean isEnregisterUS() {
        return enregisterUS;
    }
}
