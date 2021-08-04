package Day42;

public interface FirstInterFace {
    //you can t create object, u cant create constructor in interfaces

    //public void method();     // normalde public gri renkte. bu da kullanmamiz gerekmedigi icin.unnecessary
                                // cunku interface lerde tum methodlar defaoult  olarak public ayarlanmistir.
                                // interface leri private class yapamayiz.ayni sekilde abstract classlarda private degil

    abstract void method2();    // ayni sekilde abstract da gerekmiyor. cunku tum metotlar default public


    void method();

    // variables in interface are public , static and final
    public int variable1 = 10;
    static double variable2 = 10;
    final boolean variable3 = true;

    //

}
