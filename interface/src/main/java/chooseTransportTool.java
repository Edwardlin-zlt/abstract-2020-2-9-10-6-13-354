import java.util.ArrayList;

public class chooseTransportTool {
    public static void main(String[] args) {

        Person xiaoMing = new Person("小明", 300);
        SelfDrive selfDrive = new SelfDrive();
        Bus bus = new Bus();
        Train train = new Train();
        Flight flight = new Flight();

        ArrayList<TransportTools> transportTools = new ArrayList<>();
        transportTools.add(selfDrive);
        transportTools.add(bus);
        transportTools.add(train);
        transportTools.add(flight);

        xiaoMing.getAffordableTransTool(transportTools);
    }
}
