public class ItemSelectedState implements VendingMachineState {
    @Override
    public void selectItem(VendingMachine machine) {
        System.out.println("Item already selected.");
    }

    @Override
    public void insertCoin(VendingMachine machine, int amount) {
        machine.setBalance(machine.getBalance() + amount);
        System.out.println("Inserted coin: " + amount);

        if (machine.getBalance() >= machine.getItemPrice()) {
            System.out.println("Sufficient balance. Dispensing Item...");
            machine.setState(new DispensingState());
        }
    }

    @Override
    public void dispenseItem(VendingMachine machine) {
        System.out.println("Insert coins first.");
    }

    @Override
    public void setOutOfOrder(VendingMachine machine) {
        System.out.println("Vending machine is now out of order.");
        machine.setState(new OutOfOrderState());
    }
}
