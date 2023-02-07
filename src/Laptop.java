public class Laptop {
    private int display;
    private String brand;
    private  String color;
    private  int memory;
    private String hardSSD;
    private int ram;
    private String videoCard;
    private int usbPort;
    private  String keyBoard;

    public int getDisplay() {
        return display;
    }

    public void setDisplay(int display) {
        this.display = display;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public String getHardSSD() {
        return hardSSD;
    }

    public void setHardSSD(String hardSSD) {
        this.hardSSD = hardSSD;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getVideoCard() {
        return videoCard;
    }

    public void setVideoCard(String videoCard) {
        this.videoCard = videoCard;
    }

    public int getUsbPort() {
        return usbPort;
    }

    public void setUsbPort(int usbPort) {
        this.usbPort = usbPort;
    }

    public String getKeyBoard() {
        return keyBoard;
    }

    public void setKeyBoard(String keyBoard) {
        this.keyBoard = keyBoard;
    }
public Laptop(){

}
    public Laptop(int display, String brand, String color, int memory, String hardSSD,
                  int ram, String videoCard, int usbPort, String keyBoard) {
        this.display = display;
        this.brand = brand;
        this.color = color;
        this.memory = memory;
        this.hardSSD = hardSSD;
        this.ram = ram;
        this.videoCard = videoCard;
        this.usbPort = usbPort;
        this.keyBoard = keyBoard;
    }

    @Override
    public String toString() {
        return "Laptop----" +
                "" +
                " display='" + display + '\n' +
                " brand='" + brand + '\n' +
                " color='" + color + '\n' +
                " memory=" + memory +
                " hardSSD='" + hardSSD + '\n' +
                " ram='" + ram + '\n' +
                " videoCard='" + videoCard + '\n' +
                " usbPort=" + usbPort +'\n'+
                " keyBoard='"
                + keyBoard + '\n' + '}';
    }
}
