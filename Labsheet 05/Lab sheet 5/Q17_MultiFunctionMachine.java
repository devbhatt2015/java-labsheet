interface Printer {
    void print();
}

interface Scanner {
    void scan();
}

class MultiFunctionMachine implements Printer, Scanner {
    private String machineName;
    private int machineId;

    public void setMachineName(String machineName) {
        this.machineName = machineName;
    }

    public void setMachineId(int machineId) {
        this.machineId = machineId;
    }

    public String getMachineName() {
        return machineName;
    }

    public int getMachineId() {
        return machineId;
    }

    public void print() {
        System.out.println("Printing document");
    }

    public void scan() {
        System.out.println("Scanning document");
    }
}

public class Q17_MultiFunctionMachine {
    public static void main(String[] args) {
        MultiFunctionMachine m = new MultiFunctionMachine();

        m.setMachineName("HP Printer");
        m.setMachineId(101);

        System.out.println("Machine Name: " + m.getMachineName());
        System.out.println("Machine ID: " + m.getMachineId());

        m.print();
        m.scan();
    }
}