package inheritance2;

public class CustomerManager {

    public void add(Logger logger) {
        //müşteri ekleme kodları
        System.out.println("Müşteri eklendi");
        //DatabaseLogger logger=new DatabaseLogger(); //BİR İŞ YAPAN SINIF BAŞKA BİR İŞ YAPAN SINIFI KULLANACAKSA ASLA
        //VE ASLA SOMUT SINIFTAN GİDİLMEZ(SOMUT SINIF=İŞ YAPAN SINIF)
        //SÜRDÜRÜLEBİLİR DEĞİL
        logger.log();
    }
}
