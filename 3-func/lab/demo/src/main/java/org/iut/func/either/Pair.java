package org.iut.func.either;

public class Pair<F, S> {
    public final F fst;
    public final S snd;

	public Pair(F fst, S snd) {
		this.fst = fst;
		this.snd = snd;
	}
	
    public static <F, S> Pair<F, S> create(F fst, S snd) {
        return new Pair<>(fst, snd);
    }

}