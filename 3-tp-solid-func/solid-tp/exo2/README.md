Le principe ISP n'est pas respecté : on a une seule interface ``ServiceNotification`` et les classes 
qui implémentent cette interface n'utilisent pas toutes les méthodes de cette interface.

Il faut donc répartir les méthodes de ``ServiceNotification`` dans plusieurs interfaces : l'une sera utilisée 
par `ServiceNotificationCreche`, l'autre par `ServiceNotificationEntreprise`.