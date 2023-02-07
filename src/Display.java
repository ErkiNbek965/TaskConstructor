public class Display {
    private  int diagonal;
    private String manufacturer;
    private String typeMatrix;

    public int getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(int diagonal) {
        this.diagonal = diagonal;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getTypeMatrix() {
        return typeMatrix;
    }

    public void setTypeMatrix(String typeMatrix) {
        this.typeMatrix = typeMatrix;
    }

    public Display(int diagonal, String manufacturer, String typeMatrix) {
        this.diagonal = diagonal;
        this.manufacturer = manufacturer;
        this.typeMatrix = typeMatrix;
    }

  public Display(){
    }

    @Override
    public String toString() {
        return "Display=-------=" + '\n'+
                " diagonal=" + diagonal +'\n'+
                " manufacturer='" + manufacturer + '\n' +
                " typeMatrix='" + typeMatrix + '\n' +
                '}';
    }
}
