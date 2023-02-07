public class RAM {
    private int memory;
    private int manufacturer;

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(int manufacturer) {
        this.manufacturer = manufacturer;
    }

    public RAM(){

    }
    public RAM(int memory, int manufacturer) {
        this.memory = memory;
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "RAM-------" + '\n'+
                "memory=" + memory +'\n'+
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}