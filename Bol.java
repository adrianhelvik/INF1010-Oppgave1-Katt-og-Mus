class Bol<T> {
    private T beboer;

    // Getters
    public T beboer() { return beboer; }

    // Misc. methods
    void settInn(T beboer) {
        this.beboer = beboer;
    }

    T taUt() {
        T tmp = beboer;
        beboer = null;
        return tmp;
    }

    boolean tomt() {
        return beboer == null;
    }
}
