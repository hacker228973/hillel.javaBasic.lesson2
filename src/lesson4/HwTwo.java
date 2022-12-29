package lesson4;

public class HwTwo {
    public static void main(String[] args) {
        int dogs = 24;
        int cats = 8;
        int pricePerServing = 2;
        int portionsPerDay = 3;
        System.out.println(printPortionsPerDayForCats(cats, pricePerServing, portionsPerDay) + " Порцій потрібно для котів щомісяця");
        System.out.println(printPortionsPerDayForDogs(dogs, pricePerServing, portionsPerDay) + " Порцій потрібно для собак щомісяця");
        System.out.println(printBeesForTheUpkeepShelter(dogs, cats, pricePerServing, portionsPerDay) + "Коштує утримання притулку на місяць");
    }

    public static int printPortionsPerDayForCats(int cats, int pricePerServing, int portionsPerDay) {
        return cats * pricePerServing * portionsPerDay;
    }

    public static int printPortionsPerDayForDogs(int dogs, int pricePerServing, int portionsPerDay) {
        return dogs * pricePerServing * portionsPerDay;
    }

    public static int printBeesForTheUpkeepShelter(int dogs, int cats, int pricePerServing, int portionsPerDay) {

        return ((printPortionsPerDayForCats(cats, pricePerServing, portionsPerDay) + printPortionsPerDayForDogs(dogs, pricePerServing, portionsPerDay)) * pricePerServing);
    }
}
