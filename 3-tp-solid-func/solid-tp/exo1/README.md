Le principe LSP n'est pas respecté : un contractuel n'est pas un employé, donc `EmployeContractuel`
héritant de `Employe` est une mauvaise implémentation.

On peut corriger cela en créant une classe `Personnel` de laquelle heritent les classes `Employe` 
et `Contractuel`.