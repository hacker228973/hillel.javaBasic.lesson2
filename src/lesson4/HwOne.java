package lesson4;

public class HwOne {
    public static void main(String[] args) {
        System.out.println(printAirplaneInfo("Airliner2"));
    }

    static public String printAirplaneInfo(String type) {
        return switch (type){
            case ("Jet") -> "Тип самолета: Jet, модель: F-22 Raptor";
            case ("Airliner1") -> "Тип самолета: Airliner, модель: Aerobus 737, кол. пасажиров эконом класса: 120";
            case ("Airliner2") -> "Тип самолета: Airliner, модель: Boeing 777, кол. пасажиров эконом класса: 180, пассажиров бизне скласса: 28";
            default ->  type.toString();
        };
    }
}
