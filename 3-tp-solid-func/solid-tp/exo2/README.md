Le principe ISP n'est pas respecté : on a une seule interface ``ServiceNotification`` et les classes 
qui implémentent cette interface n'utilisent pas toutes les méthodes de cette interface.

Il faut donc diviser les méthodes de ``ServiceNotification`` dans plusieurs interfaces.