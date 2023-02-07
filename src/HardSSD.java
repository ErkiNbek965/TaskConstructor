public class HardSSD {
    private int volumeMemory;
    private int howManyDiscs;

   public int getVolumeMemory(){
       return volumeMemory;
   }
   public void setVolumeMemory(int volumeMemory){
       this.volumeMemory = volumeMemory;
   }
   public int getHowManyDiscs(){
       return howManyDiscs;
   }

    public void setHowManyDiscs(int howManyDiscs) {
        this.howManyDiscs = howManyDiscs;
    }
    public HardSSD(){

    }

    public HardSSD(int volumeMemory, int howManyDiscs) {
        this.volumeMemory = volumeMemory;
        this.howManyDiscs = howManyDiscs;
    }

    @Override
    public String toString() {
        return "HardSSD````````" +'\n' +
                " volumeMemory=" + volumeMemory +'\n'+
                ", howManyDiscs=" + howManyDiscs +
                '}';
    }
}
