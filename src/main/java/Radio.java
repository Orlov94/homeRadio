public class Radio {


    private int currentStation;

    private int countStation = 10;
    private int currentValue;
    private int maxValue = 100;

    public Radio(int countStation) {
        this.countStation = countStation;
    }

    public Radio() {

    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > (countStation - 1)) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int getCountStation() {
        return countStation;
    }

    public void setCountStation(int countStation) {
        this.countStation = countStation;
    }

    public int getCurrentValue() {
        return currentValue;
    }

    public void setCurrentValue(int currentValue) {
        if (currentValue > maxValue) {
            return;
        }
        if (currentValue < 0) {
            return;

        }
        this.currentValue = currentValue;
    }

    public void nextStation() {
        if (currentStation == (countStation - 1)) {
            setCurrentStation(0);
            return;
        }
        setCurrentStation(currentStation + 1);
    }

    public void prevStation() {
        if (currentStation == 0) {
            setCurrentStation(countStation - 1);
            return;
        }
        setCurrentStation(currentStation - 1);
    }

    public void increaseValue() {
        if (currentValue < maxValue) {
            currentValue = currentValue + 1;
        }
    }

    public void decreaseValue() {
        if (currentValue > 0) {
            currentValue = currentValue - 1;
        }
    }


}

