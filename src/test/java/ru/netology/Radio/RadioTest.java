package ru.netology.Radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void nextRadioStationFromZero() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(0);

        radio.radioStationNext();

        int expected = 1;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextRadioStationNegativeValue() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(-1);

        radio.radioStationNext();
        int expected = 1;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextRadioStationIncreasedValue() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(10);

        radio.radioStationNext();
        int expected = 1;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextRadioStationUpperBound() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(9);

        radio.radioStationNext();
        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextRadioStationEquivalent() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(5);

        radio.radioStationNext();
        int expected = 6;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void prevRadioStationFromZero() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(0);

        radio.radioStationPrev();
        int expected = 9;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevRadioStationNegativeValue() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(-1);

        radio.radioStationPrev();
        int expected = 9;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevRadioStationIncreasedValue() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(10);

        radio.radioStationPrev();
        int expected = 9;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevRadioStationDecreaseFromMax() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(9);

        radio.radioStationPrev();
        int expected = 8;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevRadioStationEquivalent() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(5);

        radio.radioStationPrev();
        int expected = 4;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void nextVolumeUp() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.increaseVolume();

        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextVolumeEquivalent() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);

        radio.increaseVolume();

        int expected = 2;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextVolumeNegative() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);

        radio.increaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextVolumeIncreasedValue() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);

        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextVolumeUpperBound() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }




    @Test
    public void prevVolumeUp() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.reduceVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevVolumeEquivalent() {
        Radio radio = new Radio();
        radio.setCurrentVolume(3);

        radio.reduceVolume();

        int expected = 2;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevVolumeNegative() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);

        radio.reduceVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevVolumeIncreasedValue() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);

        radio.reduceVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevVolumeUpperBound() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        radio.reduceVolume();

        int expected = 99;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}
