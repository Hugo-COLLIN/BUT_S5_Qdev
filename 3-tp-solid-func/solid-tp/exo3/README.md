# Exercice 3
Dans le code initial, le principe SRP n'est pas respecté : la classe `ConstantesPassword` contient des valeurs utilisées à
la fois dans `ConvertisseurUnites` et `VerificationPassword` qui n'ont rien à voir entre elles.

Pour corriger le problème, on répartit les constantes dans 2 classes `ConstantesConvertisseur` et
`ConstantesPassword`.