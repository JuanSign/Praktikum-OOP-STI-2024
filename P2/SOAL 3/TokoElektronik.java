import java.util.Scanner;

public class TokoElektronik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int totalPrice = 0;
        for(int i = 0; i < n; i++)
        {
            int jenis = Integer.parseInt(scanner.nextLine());
            if(jenis == 1)
            {
                String brand = scanner.nextLine();
                String model = scanner.nextLine();
                int storageCapacity = Integer.parseInt(scanner.nextLine());
                int batteryLife = Integer.parseInt(scanner.nextLine());
                Smartphone x = new Smartphone(brand, model, storageCapacity, batteryLife);
                x.displayDetails();
                int price = x.calculatePrice();
                System.out.printf("Price: %d\n", price);
                totalPrice += price;
            }
            else if(jenis == 2)
            {
                String brand = scanner.nextLine();
                String model = scanner.nextLine();
                String processorType = scanner.nextLine();
                int ram = Integer.parseInt(scanner.nextLine());
                int isTouchScreen = Integer.parseInt(scanner.nextLine());
                Laptop x;
                if(isTouchScreen == 1)
                {
                    x = new Laptop(brand, model, processorType, ram, true);
                }
                else
                {
                    x = new Laptop(brand, model, processorType, ram, false);
                }
                x.displayDetails();
                int price = x.calculatePrice();
                System.out.printf("Price: %d\n", price);
                totalPrice += price;
            }
            else if(jenis == 3)
            {
                String brand = scanner.nextLine();
                String model = scanner.nextLine();
                int screenSize = Integer.parseInt(scanner.nextLine());
                int hasCellular = Integer.parseInt(scanner.nextLine());
                Tablet x;
                if(hasCellular == 1)
                {
                    x = new Tablet(brand, model, screenSize, true);
                }
                else
                {
                    x = new Tablet(brand, model, screenSize, false);
                }
                x.displayDetails();
                int price = x.calculatePrice();
                System.out.printf("Price: %d\n", price);
                totalPrice += price;
            }
        }
        System.out.printf("Total price: %d\n", totalPrice);
    }
}

