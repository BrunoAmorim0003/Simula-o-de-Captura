public class LamportClock {
    private int clock;

    public LamportClock() {
        this.clock = 0;
    }

    public void incremento() {
        this.clock++;
    }

    public int enviarEvento() {
        this.incremento();
        return clock;
    }

    public  void receberEvento(int clockRecebido) {
        this.clock = Math.max(clock, clockRecebido) + 1;
    }

    public int getTempo() {
        return this.clock;
    }
}
