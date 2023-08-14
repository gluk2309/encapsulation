package ru.netology.Radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    Radio radio = new Radio();

    @Test
    public void testingNewFunctionalityRadioStation() {
        Radio radio = new Radio(5);

        Assertions.assertEquals(5, radio.getCurrentRadioStationNumber());
        Assertions.assertEquals(0, radio.getMinRadioStation());
        Assertions.assertEquals(9, radio.getMaxRadioStation());
        Assertions.assertEquals(10, radio.getMaximumNumberOfRadioStations());
    }


    @Test
    public void nextRadioStationFromZero() {

        radio.setCurrentRadioStationNumber(0);

        radio.radioStationNext();

        int expected = 1;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextRadioStationNegativeValue() {

        radio.setCurrentRadioStationNumber(-1);

        radio.radioStationNext();
        int expected = 1;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextRadioStationIncreasedValue() {

        radio.setCurrentRadioStationNumber(10);

        radio.radioStationNext();
        int expected = 1;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextRadioStationUpperBound() {

        radio.setCurrentRadioStationNumber(9);

        radio.radioStationNext();
        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextRadioStationEquivalent() {

        radio.setCurrentRadioStationNumber(5);

        radio.radioStationNext();
        int expected = 6;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void prevRadioStationFromZero() {

        radio.setCurrentRadioStationNumber(0);

        radio.radioStationPrev();
        int expected = 9;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevRadioStationNegativeValue() {

        radio.setCurrentRadioStationNumber(-1);

        radio.radioStationPrev();
        int expected = 9;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevRadioStationIncreasedValue() {

        radio.setCurrentRadioStationNumber(10);

        radio.radioStationPrev();
        int expected = 9;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevRadioStationDecreaseFromMax() {

        radio.setCurrentRadioStationNumber(9);

        radio.radioStationPrev();
        int expected = 8;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevRadioStationEquivalent() {

        radio.setCurrentRadioStationNumber(5);

        radio.radioStationPrev();
        int expected = 4;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void nextVolumeUp() {

        radio.setCurrentVolume(0);

        radio.increaseVolume();

        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextVolumeEquivalent() {

        radio.setCurrentVolume(1);

        radio.increaseVolume();

        int expected = 2;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextVolumeNegative() {

        radio.setCurrentVolume(-1);

        radio.increaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextVolumeIncreasedValue() {

        radio.setCurrentVolume(101);

        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextVolumeUpperBound() {

        radio.setCurrentVolume(100);

        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void prevVolumeUp() {

        radio.setCurrentVolume(0);

        radio.reduceVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevVolumeEquivalent() {

        radio.setCurrentVolume(3);

        radio.reduceVolume();

        int expected = 2;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevVolumeNegative() {

        radio.setCurrentVolume(-1);

        radio.reduceVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevVolumeIncreasedValue() {

        radio.setCurrentVolume(101);

        radio.reduceVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevVolumeUpperBound() {

        radio.setCurrentVolume(100);

        radio.reduceVolume();

        int expected = 99;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}
