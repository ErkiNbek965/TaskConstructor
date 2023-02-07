public class KeyBoard {
    private String keyboardBacklight;
    private String dopNumOnRight;

    public String getKeyboardBacklight() {
        return keyboardBacklight;
    }

    public void setKeyboardBacklight(String keyboardBacklight) {
        this.keyboardBacklight = keyboardBacklight;
    }

    public String getDopNumOnRight() {
        return dopNumOnRight;
    }

    public void setDopNumOnRight(String dopNumOnRight) {
        this.dopNumOnRight = dopNumOnRight;
    }

    public KeyBoard(String keyboardBacklight, String dopNumOnRight) {
        this.keyboardBacklight = keyboardBacklight;
        this.dopNumOnRight = dopNumOnRight;
    }

    public KeyBoard() {
    }

    @Override
    public String toString() {
        return "KeyBoard~~~~~~" +'\n'+
                " keyboardBacklight = '"
                + keyboardBacklight + '\n' +
                " dopNumOnRight = '" + dopNumOnRight + '\n' +
                '}';
    }
}

