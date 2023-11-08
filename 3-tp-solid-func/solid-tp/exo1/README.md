Le principe LSP n'est pas respecté : un contractuel n'est pas un employé, donc `EmployeContractuel`
héritant de `Employe` est une mauvaise implémentation.

On peut corriger cela en créant une classe `Personnel` de laquelle heritent les classes `Employe` 
et `Contractuel`. On corrige également la méthode `moyenneJoursCongesRestantsParEmploye` de 
`CalculMoyenneConges` : on accepte les objets `Personnel` mais on filtre pour effectuer le 
calcul des congés uniquement sur les ``Employes``.