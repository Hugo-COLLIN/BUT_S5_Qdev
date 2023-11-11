package org.iut.func;

record Triplet(int a, int b, int c) {
    public static Triplet triplet(int a, int b, int c) {
        return new Triplet(a, b, c);
    }

    public String toString() {
        return String.format("%d %d %d", a, b, c);
    }
}
