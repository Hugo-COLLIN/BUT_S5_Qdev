Dans le code initial, le principe DIP n'est pas respecté : ``ServiceTransfertCompte`` est un 
module de haut niveau qui dépend de `ServiceMonitoringAudit`, un module de bas niveau.

Pour corriger ce problème, on introduit une abstraction : l'interface `ServiceAudit`, que 
`ServiceMonitoringAudit` implémente. Dans `ServiceTransfertCompte`, on utilise maintenant
``serviceAudit`` au lieu de ``ServiceMonitoringAudit`` directement.

Il est ainsi possible de changer l'implémentation de ``ServiceAudit`` sans avoir à modifier 
``ServiceTransfertCompte``. Cela rend le code plus flexible et plus facile à maintenir.