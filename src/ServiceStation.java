public class ServiceStation{

    public static void check(Transport transports) {
        System.out.println("Обслуживаем " + transports.getModelName());
        for (int i = 0; i < transports.getWheelsCount(); i++) {
            transports.updateTyre();
        }
        transports.checkEngine();
        transports.checkTrailer();
        System.out.println();


    }


}
