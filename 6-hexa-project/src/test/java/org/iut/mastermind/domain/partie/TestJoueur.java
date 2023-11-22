package org.iut.mastermind.domain.partie;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class TestJoueur {

    @Test
    void joueursNomsIdentiques() {
        Joueur a = new Joueur("meme nom");
        Joueur b = new Joueur("meme nom");
        assertThat(a).isEqualTo(b);
    }

    @Test
    void joueursNomsDifferents() {
        Joueur a = new Joueur("meme nom");
        Joueur b = new Joueur("nom different");
        assertThat(a).isNotEqualTo(b);
    }

    @Test
    void joueursHashcodeEgal() {
        Joueur a = new Joueur("meme nom");
        Joueur b = new Joueur("meme nom");
        assertThat(a.hashCode()).isEqualTo(b.hashCode());
    }
}