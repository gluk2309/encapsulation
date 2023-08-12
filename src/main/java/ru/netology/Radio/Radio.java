package ru.netology.Radio;

public class Radio {
    private int currentRadioStationNumber;
    private int maxRadioStation = 9;
    private int minRadioStation = 0;


    public int getCurrentRadioStationNumber() {
        return currentRadioStationNumber;
    }

    public void setCurrentRadioStationNumber(int newCurrentRadioStationNumber) {
        if (newCurrentRadioStationNumber > maxRadioStation) {
            return;
        }
        if (newCurrentRadioStationNumber < minRadioStation) {
            return;
        }
        currentRadioStationNumber = newCurrentRadioStationNumber;
    }

    public int radioStationNext() {
        if (currentRadioStationNumber < maxRadioStation) {
            currentRadioStationNumber++;
        } else {
            currentRadioStationNumber = minRadioStation;
        }
        return currentRadioStationNumber;
    }

    public int radioStationPrev() {
        if (currentRadioStationNumber > minRadioStation) {
            currentRadioStationNumber--;
        } else {
            currentRadioStationNumber = maxRadioStation;
        }
        return currentRadioStationNumber;
    }

    private int currentVolume;
    private int maxVolume = 100;
    private int minVolume = 0;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        currentVolume = newCurrentVolume;
    }

    public int increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume++;
        } else {
            currentVolume = maxVolume;
        }
        return currentVolume;
    }


    public int reduceVolume() {
        if (currentVolume > minVolume) {
            currentVolume--;
        } else {
            currentVolume = minVolume;
        }
        return currentVolume;
    }
}