package task1;

public class MainAdapterTask {
    public static void main(String[] args) {
        LegacyOrderProcessor legacyProcessor = new LegacyOrderProcessor();
        NewOrderProcessor adapter = new OrderAdapter(legacyProcessor);
        adapter.processNewOrder(); // Working with the new interface while using old code
    }
}
