package Day6;

class Apartment1 {
    int rooms;
    int kitchen;
    int publicToilet;
    int livingRoom;
    int commonPG;

    // Parameterized
    Apartment1(int rooms, int kitchen, int publicToilet, int livingRoom, int commonPG) {
        this.rooms = rooms;
        this.kitchen = kitchen;
        this.publicToilet = publicToilet;
        this.livingRoom = livingRoom;
        this.commonPG = commonPG;
    }

    void display() {
        System.out.println("Apartment 1 has" + " " + rooms + " " + "rooms with" + " " + kitchen + " " + "kitchen" + " " + livingRoom + " " + "living room" + " " + publicToilet + " " + "public toilet and" + " " + commonPG + " " + "common playground");
        System.out.println();
    }
}

class Apartment2 {
    int kitchen;
    int roomsAttachedBR;
    int livingRoom;
    int diningRoom;
    int commonPG;

    Apartment2(int kitchen, int roomsAttachedBR, int livingRoom, int diningRoom, int commonPG) {
        this.kitchen = kitchen;
        this.roomsAttachedBR = roomsAttachedBR;
        this.livingRoom = livingRoom;
        this.diningRoom = diningRoom;
        this.commonPG = commonPG;
    }

    void display() {
        System.out.println("Apartment 2 has" + " " + roomsAttachedBR + " " + "rooms with attached bathrooms" + " " + livingRoom + " " + "living room and" + " "+  kitchen + " " + "kitchen" + " " + diningRoom + " " + "dining room" + " " + commonPG + " " + "common playground");
        System.out.println();
    }
}

class Apartment3 {
    int kitchen;
    int roomsAttachedBR;
    int livingRoom;
    int diningRoom;
    int commonPG;

    Apartment3(int kitchen, int roomsAttachedBR, int livingRoom, int diningRoom, int commonPG) {
        this.kitchen = kitchen;
        this.roomsAttachedBR = roomsAttachedBR;
        this.livingRoom = livingRoom;
        this.diningRoom = diningRoom;
        this.commonPG = commonPG;
    }

    void display() {
        System.out.println("Apartment 2 has" + " " + roomsAttachedBR + " " + "rooms with attached bathrooms" + " " + livingRoom + " " + "living room and" + " "+  kitchen + " " + "kitchen" + " " + diningRoom + " " + "dining room" + " " + commonPG + " " + "common playground");
        System.out.println();
    }
}

public class ApartmentsTask {
    public static void main(String[] args) {

        Apartment1 a1 = new Apartment1(1, 1, 1, 1, 1);
        Apartment2 a2 = new Apartment2(1, 2, 1, 1, 1);
        Apartment3 a3 = new Apartment3(1, 4, 1, 1, 1);

        a1.display();
        a2.display();
        a3.display();
    }
}