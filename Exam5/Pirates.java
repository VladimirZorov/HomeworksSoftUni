package Zadachi.Exam4;

import java.util.List;
import java.util.*;

public class Pirates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<City> targetedCities = new ArrayList<>();

        String input = scanner.nextLine();
        while (!input.equals("Sail")) {
            String[] targetedCity = input.split("\\|\\|");

            String name = targetedCity[0];
            int population = Integer.parseInt(targetedCity[1]);
            int gold = Integer.parseInt(targetedCity[2]);

            City city = new City(name, population, gold);
            if (!targetedCities.contains(city)) {
                targetedCities.add(city);
            } else {
                city.setPopulation(city.getPopulation() + population);
                city.setGold(city.getGold() + gold);
            }
            input = scanner.nextLine();
        }

        input = scanner.nextLine();
        while (!input.equals("End")) {
            String[] events = input.split("=>");
            String town = events[1];

            switch (events[0]) {
                case "Plunder":
                    int people = Integer.parseInt(events[2]);
                    int gold = Integer.parseInt(events[3]);
                    for (City c : targetedCities) {
                        if (c.getName().equals(town)) {

                            int afterAttackPeople = c.getPopulation() - people;
                            int afterAttackGold = c.getGold() - gold;

                            if (afterAttackGold <= 0 || afterAttackPeople <= 0) {
                                System.out.printf("%s plundered! %d gold stolen, %d citizens killed.\n", town, gold, people);
                                System.out.printf("%s has been wiped off the map!\n", town);
                                targetedCities.remove(c);

                            } else {
                                c.setGold(afterAttackGold);
                                c.setPopulation(afterAttackPeople);
                                System.out.printf("%s plundered! %d gold stolen, %d citizens killed.\n", town, gold, people);
                            }
                        }
                        break;
                    }
                    break;
                case "Prosper":
                    gold = Integer.parseInt(events[2]);
                    if (gold > 0) {
                        for (City c : targetedCities) {
                            if (c.getName().equals(town)) {
                                c.setGold(c.getGold() + gold);
                                System.out.printf("%d gold added to the city treasury. %s now has %d gold.\n", gold, town, c.getGold());
                            }
                        }
                    } else {
                        System.out.println("Gold added cannot be a negative number!");

                    }
                    break;
            }
            input = scanner.nextLine();
        }
        if (targetedCities.size() > 0) {
            System.out.printf("Ahoy, Captain! There are %d wealthy settlements to go to:\n", targetedCities.size());
            targetedCities
                    .stream()
                    .sorted(Comparator.comparing(City::getGold)
                            .reversed()
                            .thenComparing(City::getName))
                    .forEach(city -> System.out.printf("%s -> Population: %d citizens, Gold: %d kg\n", city.getName(), city.getPopulation(), city.getGold()));
        } else {
            System.out.println("Ahoy, Captain! All targets have been plundered and destroyed!");
        }

    }

    static class City {
        String name;
        int population;
        int gold;

        public City(String name, int population, int gold) {
            this.name = name;
            this.population = population;
            this.gold = gold;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getPopulation() {
            return population;
        }

        public void setPopulation(int population) {
            this.population = population;
        }

        public int getGold() {
            return gold;
        }

        public void setGold(int gold) {
            this.gold = gold;
        }
    }
}
