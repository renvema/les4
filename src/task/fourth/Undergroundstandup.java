package task.fourth;

public class Undergroundstandup {
    private String nameHost;
    private String nameComic;
    private String locationEvent;
    private String dateEvent;
    private int priceTicket;
    private String namePhotographer;
    private String nameSoundEngineer;

    public String getNameHost() {
        return nameHost;
    }

    public String getNameComic() {
        return nameComic;
    }

    public String getLocationEvent() {
        return locationEvent;
    }

    public String getDateEvent() {
        return dateEvent;
    }

    public int getPriceTicket() {
        return priceTicket;
    }

    public String getNamePhotographer() {
        return namePhotographer;
    }

    public String getNameSoundEngineer() {
        return nameSoundEngineer;
    }

    public static class Builder {
        private Undergroundstandup newUndergroundstandup;

        public Builder() {
            newUndergroundstandup = new Undergroundstandup();
        }

        public Builder WithNameHost(String nameHost) {
            newUndergroundstandup.nameHost = nameHost;
            return this;
        }

        public Builder WithNameComic(String nameComic) {
            newUndergroundstandup.nameComic = nameComic;
            return this;
        }

        public Builder WithLocationEvent(String locationEvent) {
            newUndergroundstandup.locationEvent = locationEvent;
            return this;
        }

        public Builder WithDateEvent(String dateEvent) {
            newUndergroundstandup.dateEvent = dateEvent;
            return this;
        }

        public Builder WithPriceTicket(int priceTicket) {
            newUndergroundstandup.priceTicket = priceTicket;
            return this;
        }

        public Builder WithNamePhotographer(String namePhotographer) {
            newUndergroundstandup.namePhotographer = namePhotographer;
            return this;
        }

        public Builder WithNameSoundEngineer(String nameSoundEngineer) {
            newUndergroundstandup.nameSoundEngineer = nameSoundEngineer;
            return this;
        }

        public Undergroundstandup build() {
            return newUndergroundstandup;
        }
    }
}
