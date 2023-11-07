package org.iut.func;

import java.util.List;

public class D2 {
    private static final List<Album> ALBUMS = List.of(
            new Album("Test", 1973),
            new Album("Test2", 1965)
    );

    public static Album oldest(List<Album> albums) {
        return albums.stream()
//                .reduce(new Album("", 32000), (l,x) -> (l.year() < x.year() ? l : x));
                .reduce(albums.getFirst(), (l,x) -> (l.year() < x.year() ? l : x));
    }

    public static void main(String[] args) {
        System.out.println(oldest(ALBUMS));
    }

    record Album(String name, Integer year) {}
}

