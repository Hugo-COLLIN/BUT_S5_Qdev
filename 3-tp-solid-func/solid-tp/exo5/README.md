Dans le code initial, le principe OCP n'est pas respecté : chaque fois qu'on ajoute une nouvelle forme génométrique,
il est nécessaire de modifier la méthode `isPointDansFormes` de `CalculPointDansFormes`.

Pour résoudre ce problème, on définit la méthode abstraite `isPointDansForme` dans `FormeGeometrique` et on 
l'implémente dans chaque classe qui étend de `FormeGeometrique` (en reprenant la partie du code correspondant 
dans `isPointDansFormes`). Dans `isPointDansFormes`, on appelle `isPointDansForme` pour chaque objet
`FormeGeometrique`.