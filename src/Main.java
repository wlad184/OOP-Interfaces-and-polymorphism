public class Main {
    public static void main(String[] args) {
        Transport[] transports  = new Transport[]{
                new Car("car1", 4),
                new Car("car2", 4),
                new Truck("truck1", 6),
                new Truck("truck2", 8),
                new Bicycle("bicycle1", 2),
                new Bicycle("bicycle2", 2),
        };


        /*ServiceStation car = new Car("car1", 4);
        ServiceStation car2 = new Car("car2", 4);

        ServiceStation truck = new Truck("truck1", 6);
        ServiceStation truck2 = new Truck("truck2", 8);


        ServiceStation bicycle = new Bicycle("bicycle1", 2);
        ServiceStation bicycle2 = new Bicycle("bicycle2", 2);*/

        ServiceStation station = new ServiceStation();
        for (int i = 0; i < transports.length; i++) {
            station.check(transports[i]);
        }

        /*station.check(car, null, null);
        station.check(car2, null, null);
        station.check(null, bicycle, null);
        station.check(null, bicycle2, null);
        station.check(null, null, truck);
        station.check(null, null, truck2);*/
    }

}