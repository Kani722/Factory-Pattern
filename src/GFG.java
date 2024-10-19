public class GFG {
    public static void main(String[] args) {
        Client pClient = new Client(3);
        Vehicle pVehicle = pClient.getVehicle();
        if (pVehicle != null) {
            pVehicle.printVehicle();
        }
        pClient.cleanup();
    }
}
