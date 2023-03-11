public class ServiceStation{

    public static void check(Transport transports) {
        System.out.println("Обслуживаем " + transports.getModelName());
        for (int i = 0; i < transports.getWheelsCount(); i++) {
            transports.updateTyre();
        }
        transports.checkEngine();
        transports.checkTrailer();


        /*if (car != null) {
            System.out.println("Обслуживаем " + car.getModelName());
            for (int i = 0; i < car.getWheelsCount(); i++) {
                car.updateTyre();
            }
            car.checkEngine();
        } else if (truck != null) {
            System.out.println("Обслуживаем " + truck.getModelName());
            for (int i = 0; i < truck.getWheelsCount(); i++) {
                truck.updateTyre();
            }
            truck.checkEngine();
            truck.checkTrailer();
        } else if (bicycle != null) {
            System.out.println("Обслуживаем " + bicycle.getModelName());
            for (int i = 0; i < bicycle.getWheelsCount(); i++) {
                bicycle.updateTyre();
            }
        }*/
    }

    /*public void updateTyre() {

    }

    public void checkEngine() {

    }

    public void checkTrailer() {

    }*/
}
