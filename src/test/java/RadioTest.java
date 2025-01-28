import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {


    Radio radio = new Radio();

    @Test
    void getStationMinus() {
        radio.setCurrentStation(-1);

        int actual = radio.getCurrentStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void getStationZero() {
        radio.setCurrentStation(0);

        int actual = radio.getCurrentStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void getStationMedium() {
        radio.setCurrentStation(5);

        int actual = radio.getCurrentStation();
        int expected = 5;

        assertEquals(expected, actual);
    }

    @Test
    void getStationBeforMax() {
        radio.setCurrentStation(8);

        int actual = radio.getCurrentStation();
        int expected = 8;

        assertEquals(expected, actual);
    }

    @Test
    void getStationMax() {
        radio.setCurrentStation(9);

        int actual = radio.getCurrentStation();
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    void getStationAfterMax() {
        radio.setCurrentStation(10);

        int actual = radio.getCurrentStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void getStationMoreLimit() {
        radio.setCurrentStation(9);

        int actual = radio.getCurrentStation();
        int expected = 9;

        assertEquals(expected, actual);
    }


    @Test
    void nextStation() {
        radio.setCurrentStation(2);
        radio.nextStation();

        int actual = radio.getCurrentStation();
        int expected = 3;

        assertEquals(expected, actual);

    }

    @Test
    void nextStationMinusMin() {
        radio.setCurrentStation(-1);
        radio.nextStation();

        int actual = radio.getCurrentStation();
        int expected = 1;

        assertEquals(expected, actual);

    }
    @Test
    void nextCurrentStationZero() {
        radio.setCurrentStation(0);
        radio.nextStation();

        int actual = radio.getCurrentStation();
        int expected = 1;

        assertEquals(expected, actual);

    }
    @Test
    void nextCurrentStationMin() {
        radio.setCurrentStation(1);
        radio.nextStation();

        int actual = radio.getCurrentStation();
        int expected = 2;

        assertEquals(expected, actual);

    }

    @Test
    void nextCurrentBeforeMax() {
        radio.setCurrentStation(8);
        radio.nextStation();

        int actual = radio.getCurrentStation();
        int expected = 9;

        assertEquals(expected, actual);

    }
    @Test
    void nextCurrentMax() {
        radio.setCurrentStation(9);
        radio.nextStation();

        int actual = radio.getCurrentStation();
        int expected = 0;

        assertEquals(expected, actual);

    }
    @Test
    void nextCurrentAfterMax() {
        radio.setCurrentStation(10);
        radio.nextStation();

        int actual = radio.getCurrentStation();
        int expected = 1;

        assertEquals(expected, actual);

    }

    @Test
    void prevStation() {
        radio.setCurrentStation(5);
        radio.prevStation();

        int actual = radio.getCurrentStation();
        int expected = 4;

        assertEquals(expected, actual);

    }

    @Test
    void prevStationZero() {
        radio.setCurrentStation(0);
        radio.prevStation();

        int actual = radio.getCurrentStation();
        int expected = 9;

        assertEquals(expected, actual);

    }
    @Test
    void prevStationMinLimit() {
        radio.setCurrentStation(1);
        radio.prevStation();

        int actual = radio.getCurrentStation();
        int expected = 0;

        assertEquals(expected, actual);

    }

    @Test
    void prevStationAfterMinLimit() {
        radio.setCurrentStation(2);
        radio.prevStation();

        int actual = radio.getCurrentStation();
        int expected = 1;

        assertEquals(expected, actual);

    }

    @Test
    void prevStationMax() {
        radio.setCurrentStation(9);
        radio.prevStation();

        int actual = radio.getCurrentStation();
        int expected = 8;

        assertEquals(expected, actual);

    }
    @Test
    void prevStationBeforeMax() {
        radio.setCurrentStation(8);
        radio.prevStation();

        int actual = radio.getCurrentStation();
        int expected = 7;

        assertEquals(expected, actual);

    }
    @Test
    void prevStationAfterMax() {
        radio.setCurrentStation(10);
        radio.prevStation();

        int actual = radio.getCurrentStation();
        int expected = 9;

        assertEquals(expected, actual);

    }
    @Test
    void doubleNextAndOnePrev() {
        radio.setCurrentStation(5);
        radio.nextStation();
        radio.nextStation();
        radio.prevStation();

        int actual = radio.getCurrentStation();
        int expected = 6;

        assertEquals(expected, actual);

    }

    @Test
    void doublePrevAndOneNext() {
        radio.setCurrentStation(8);
        radio.prevStation();
        radio.prevStation();
        radio.nextStation();


        int actual = radio.getCurrentStation();
        int expected = 7;

        assertEquals(expected, actual);

    }

    @Test
    void setCurrentValue() {
        radio.setCurrentValue(5);


        int actual = radio.getCurrentValue();
        int expected = 5;

        assertEquals(expected, actual);

    }

    @Test
    void increaseValue() {
        radio.setCurrentValue(5);
        radio.increaseValue();

        int actual = radio.getCurrentValue();
        int expected = 6;

        assertEquals(expected, actual);

    }
    @Test
    void beforeMinLimit() {
        radio.setCurrentValue(-1);
        radio.increaseValue();

        int actual = radio.getCurrentValue();
        int expected = 1;

        assertEquals(expected, actual);

    }
    @Test
    void minLimit() {
        radio.setCurrentValue(0);
        radio.increaseValue();

        int actual = radio.getCurrentValue();
        int expected = 1;

        assertEquals(expected, actual);

    }

    @Test
    void afterMinLimit() {
        radio.setCurrentValue(1);
        radio.increaseValue();

        int actual = radio.getCurrentValue();
        int expected = 2;

        assertEquals(expected, actual);

    }
    @Test
    void beforeMaxLimit() {
        radio.setCurrentValue(9);
        radio.increaseValue();

        int actual = radio.getCurrentValue();
        int expected = 10;

        assertEquals(expected, actual);

    }

    @Test
    void maxLimit() {
        radio.setCurrentValue(10);
        radio.increaseValue();

        int actual = radio.getCurrentValue();
        int expected = 10;

        assertEquals(expected, actual);

    }
    @Test
    void afterMaxLimit() {
        radio.setCurrentValue(11);
        radio.increaseValue();

        int actual = radio.getCurrentValue();
        int expected = 1;

        assertEquals(expected, actual);

    }


    @Test
    void decreaseValue() {
        radio.setCurrentValue(7);
        radio.decreaseValue();

        int actual = radio.getCurrentValue();
        int expected = 6;

        assertEquals(expected, actual);

    }


    @Test
    void beforeMaxValue() {
        radio.setCurrentValue(9);
        radio.decreaseValue();

        int actual = radio.getCurrentValue();
        int expected = 8;

        assertEquals(expected, actual);

    }

    @Test
    void maxValue() {
        radio.setCurrentValue(10);
        radio.decreaseValue();

        int actual = radio.getCurrentValue();
        int expected = 9;

        assertEquals(expected, actual);
    }
    @Test
    void afterMaxValue() {
        radio.setCurrentValue(11);
        radio.decreaseValue();

        int actual = radio.getCurrentValue();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void beforeMinValue() {
        radio.setCurrentValue(1);
        radio.decreaseValue();

        int actual = radio.getCurrentValue();
        int expected = 0;

        assertEquals(expected, actual);

    }

    @Test
    void minValue() {
        radio.setCurrentValue(0);
        radio.decreaseValue();

        int actual = radio.getCurrentValue();
        int expected = 0;

        assertEquals(expected, actual);

    }
    @Test
    void afterMinValue() {
        radio.setCurrentValue(-1);
        radio.decreaseValue();

        int actual = radio.getCurrentValue();
        int expected = 0;

        assertEquals(expected, actual);

    }
}