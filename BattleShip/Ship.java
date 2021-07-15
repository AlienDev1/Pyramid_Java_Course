

abstract class Ship {

    private int shipSize;
    private char shipType;

    //Getter and Setter
    protected void setShipSize(int shipSize){
        this.shipSize = shipSize;
    }
    protected int getShipSize(){
        return shipSize;
    }
    protected char getShipType() {
        return shipType;
    }
    protected void setShipType(char shipType) {
        this.shipType = shipType;
    }
}

