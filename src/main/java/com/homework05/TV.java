package com.homework05;


public class TV {
    //1. В класс Телевизор добавить поля (если не были добавлены ранее):
    // 1) Номер включенного канала — integer;
    // 2) Громкость звука — integer (от 0 до 100);
    // 3) Признак включенного телевизора — boolean.
    private String TVCompany;
    private int chanelNumber;
    private int soundLevel;
    private boolean isTvOn;
    private int maxVolume;

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public int getChanelNumber() {
        return chanelNumber;
    }

    public void setChanelNumber(int chanelNumber) {
        this.chanelNumber = chanelNumber;
    }

    public int getSoundLevel() {

        return soundLevel;
    }

    public void setSoundLevel(int soundLevel) {
        if (soundLevel >= 0 && soundLevel <= 100) {
            this.soundLevel = soundLevel;
        }
    }

    public boolean getIsTvOn() {
        return isTvOn;
    }

    public void setIsTvOn(boolean tvOn) {
        isTvOn = tvOn;
    }

    public String getTVCompany() {
        return TVCompany;
    }

    public void setTVCompany(String TVCompany) {
        this.TVCompany = TVCompany;
    }

    TV(String TVCompany, boolean isTvOn, int chanelNumber, int soundLevel) {
        this.TVCompany = TVCompany;
        this.isTvOn = isTvOn;
        this.chanelNumber = chanelNumber;
        this.soundLevel = soundLevel;

    }
    ;
    TV() {
    }

    //2. Переопределить метод toString класса Телевизор таким образом, чтобы распечатывались:
    // название класса, все поля класса и их значения.
    public String toString() {
        return "TV: \n" +
                "TVCompany - " + TVCompany + ";" + '\n' +
                "chanelNumber - " + chanelNumber + ";" + '\n' +
                "soundLevel - " + soundLevel + ";" + '\n' +
                "isTvOn " + isTvOn + ";" +
                " " + '\n';
    }

}
