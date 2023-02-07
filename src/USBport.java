public class USBport {
    private float typePort;
    private String idPort;

    public float getTypePort() {
        return typePort;
    }

    public void setTypePort(float typePort) {
        this.typePort = typePort;
    }

    public String getIdPort() {
        return idPort;
    }

    public void setIdPort(String idPort) {
        this.idPort = idPort;
    }

    public USBport(){

    }
    public USBport(float typePort, String idPort) {
        this.typePort = typePort;
        this.idPort = idPort;
    }

    @Override
    public String toString() {
        return "USBport_-_-_-_-;)" + '\n'+
                " typePort=" + typePort +'\n'+
                " idPort=" + idPort +
                '}';
    }
}
