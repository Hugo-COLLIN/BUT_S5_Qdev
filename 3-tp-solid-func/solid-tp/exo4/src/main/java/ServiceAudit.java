public interface ServiceAudit {
    void logTransfert(CompteBancaire source, CompteBancaire cible, double montant);
    void logSoldeInsuffisant(CompteBancaire source);
}