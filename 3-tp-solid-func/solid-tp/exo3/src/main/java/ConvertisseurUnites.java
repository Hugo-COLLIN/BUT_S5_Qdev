public class ConvertisseurUnites {
    public int conversionMetresToMileNautique(int valeur){
        return valeur * ConstantesConvertisseur.MILENAUTIQUE_EN_METRE;
    }

    public double conversionGallonsToLitres(int valeur){
        return valeur * ConstantesConvertisseur.GALLON_EN_LITRE;
    }
}
