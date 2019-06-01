//my pattern Builder

package task.fourth;

public class Undergroundstandup {
    private String nameHost;
    private String nameComic;
    private String locationEvent;
    private String dateEvent;
    private int priceTicket;
    private String namePhotographer;
    private String nameSoundEngineer;

    public static void main(String[] args) {
        Undergroundstandup event = Undergroundstandup.newBuilder()
                .setNameHost("Svyat Zagaykevich")
                .setNameComic("Andrey Shchegel")
                .setLocationEvent("Bel'etage")
                .setDateEvent("22.09.2019")
                .setPriceTicket(450)
                .setNamePhotographer("Mariana Shama")
                .setNameSoundEngineer("Ilya Kravtsov")
                .build();
    }

    private Undergroundstandup() {
    }

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

    public static Builder newBuilder() {
        return new Undergroundstandup().new Builder();
    }

    public class Builder {
        private Builder() {
        }

        public Builder setNameHost(String nameHost) {
            Undergroundstandup.this.nameHost = nameHost;
            return this;
        }

        public Builder setNameComic(String nameComic) {
            Undergroundstandup.this.nameComic = nameComic;
            return this;
        }

        public Builder setLocationEvent(String locationEvent) {
            Undergroundstandup.this.locationEvent = locationEvent;
            return this;
        }

        public Builder setDateEvent(String dateEvent) {
            Undergroundstandup.this.dateEvent = dateEvent;
            return this;
        }

        public Builder setPriceTicket(int priceTicket) {
            Undergroundstandup.this.priceTicket = priceTicket;
            return this;
        }

        public Builder setNamePhotographer(String namePhotographer) {
            Undergroundstandup.this.namePhotographer = namePhotographer;
            return this;
        }

        public Builder setNameSoundEngineer(String nameSoundEngineer) {
            Undergroundstandup.this.nameSoundEngineer = nameSoundEngineer;
            return this;
        }

        public Undergroundstandup build() {
            return Undergroundstandup.this;
        }
    }
}

