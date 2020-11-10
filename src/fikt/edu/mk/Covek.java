package fikt.edu.mk;

    public class Covek {
        private String ime;
        private String prezime;
        private int godini;

        public String getIme() {
            return ime;
        }

        public void setIme(String ime) {
            this.ime = ime;
        }

        public String getPrezime() {
            return prezime;
        }

        public void setPrezime(String prezime) {
            this.prezime = prezime;
        }

        public int getGodini() {
            return godini;
        }

        public void setGodini(int godini) {
            this.godini = godini;
        }
        @Override
        public String toString() {
            return "Covek so vrednosti: {" +
                    "godini=" + godini +
                    ", ime='" + ime + '\'' +
                    ", prezime='" + prezime + '\'' +
                    '}';
        }
    }