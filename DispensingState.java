public class DispensingState implements VendingMachineState {
    @Override
    public void selectItem(VendingMachine machine) {
        System.out.println("Please wait, dispensing item.");
    }

    @Override
    public void insertCoin(VendingMachine machine, int amount) {
        System.out.println("Please wait, dispensing item.");
    }

    @Override
    public void dispenseItem(VendingMachine machine) {
        System.out.println("Item dispensed.");
        machine.decreaseInventory();
        machine.setBalance(0);
        machine.setState(new IdleState());
    }

    @Override
    public void setOutOfOrder(VendingMachine machine) {
        System.out.println("Vending machine is now out of order.");
        machine.setState(new OutOfOrderState());
    }
}
