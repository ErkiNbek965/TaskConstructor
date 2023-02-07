public class Main {
    public static void main(String[] args) {

        Laptop laptop= new Laptop(15,"Lenovo","Grey",256,"SSDhard",8,
                "NVidia GTX80",2,"Yes");
        //System.out.println(laptop);


        KeyBoard keyBoard = new KeyBoard("available","available ");
       // System.out.println(keyBoard);


        HardSSD hardSSD = new HardSSD(473,1);
        //System.out.println(hardSSD);


        RAM ram = new RAM(8,1);
      //  System.out.println(ram);


        USBport usbport = new USBport(2.0f,"HT510152");
      // System.out.println(usbport);


        Display display = new Display(15,"Lenovo","intel iRISxe graphics");
        System.out.println(display);
    }
}