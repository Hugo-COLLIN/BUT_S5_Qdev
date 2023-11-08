import java.text.MessageFormat;

public class ServiceMonitoringAudit {
    public void logTransfert(CompteBancaire source, CompteBancaire cible, double montant) {
        System.out.println(MessageFormat.format(
                "Transfert du compte ${0} vers le compte {1} de {2} euros",
                source.getId(), cible.getId(), montant));
    }

    public void logSoldeInsuffisant(CompteBancaire source) {
        System.out.println(MessageFormat.format(
                "Solde insuffisant. Solde actuel: {2}", source.getSolde()));
    }
}
