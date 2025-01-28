public class Radio {

    private int currentStation;
    private int currentValue;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > 9) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void nextStation() {
        if (currentStation == 9) {
            currentStation = 0;
        } else {
            currentStation = currentStation + 1;
        }
    }

    public void prevStation() {
        if (currentStation == 0) {
            currentStation = 9;
        } else {
            currentStation = currentStation - 1;
        }
    }

    public int getCurrentValue() {
        return currentValue;
    }

    public void setCurrentValue(int currentValue) {
        if (currentValue > 10) {
            return;
        }
        if (currentValue < 0) {
            return;

        }
        this.currentValue = currentValue;
    }

    public void increaseValue() {
        if (currentValue >= 10) {
            currentValue = 10;
        } else {
            currentValue = currentValue + 1;
        }
    }

    public void decreaseValue() {
        if (currentValue <= 0) {
            currentValue = 0;
        } else {
            currentValue = currentValue - 1;
        }
    }


}

