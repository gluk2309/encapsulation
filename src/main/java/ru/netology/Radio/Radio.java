package ru.netology.Radio;

public class Radio {

    private int maxRadioStation = 9;
    private int minRadioStation = 0;
    private int currentRadioStationNumber = minRadioStation;
    private int maximumNumberOfRadioStations = 10;

    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume;

    public Radio(int desiredNumberOfRadioStations) {
        this.currentRadioStationNumber = desiredNumberOfRadioStations;

    }

    public Radio() {

        this.maximumNumberOfRadioStations = getMaximumNumberOfRadioStations();
    }


    public int getCurrentRadioStationNumber() {

        return currentRadioStationNumber;
    }

    public int getMinRadioStation() {

        return minRadioStation;
    }

    public int getMaxRadioStation() {

        return maxRadioStation;
    }

    public int getMaximumNumberOfRadioStations() {

        return maximumNumberOfRadioStations;
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

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        currentVolume = newCurrentVolume;
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