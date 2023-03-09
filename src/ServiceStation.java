public class ServiceStation {
    private String modelName;
    private int wheelsCount;

    public ServiceStation(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public ServiceStation() {
    }

    public static void check(ServiceStation mashin) {
        System.out.println("Обслуживаем " + mashin.modelName);
        for (int i = 0; i < mashin.wheelsCount; i++) {
            mashin.updateTyre();
        }
        mashin.checkEngine();
        mashin.checkTrailer();


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

    public void updateTyre() {
        /*System.out.println("Меняем покрышку");*/
    }

    public void checkEngine() {
        /*System.out.println("Проверяем двигатель");*/
    }

    public void checkTrailer() {
        /*System.out.println("Проверяем прицеп");*/
    }
}
