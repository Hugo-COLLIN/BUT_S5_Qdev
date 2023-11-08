public class ServiceTransfertCompte {
    public void transfert(CompteBancaire source, CompteBancaire cible, double montant) {
        if (source == null || cible == null) {
            throw new IllegalArgumentException("Un compte ne peut pas être nul");
        }
        if (montant <= 0) {
            throw new IllegalArgumentException("Le montant doit être positif");
        }

        ServiceMonitoringAudit sma = new ServiceMonitoringAudit();
		
        if (source.getSolde() < montant) {
            sma.logSoldeInsuffisant(source);
            return;
        }

        source.retrait(montant);
        cible.depot(montant);
        sma.logTransfert(source, cible, montant);
    }
}
