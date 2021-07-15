

abstract class Controller extends Ship{

    protected void carrier(){
        setShipType('C');
        setShipSize(5);
    }
    protected void battleship(){
        setShipType('B');
        setShipSize(4);
    }
    protected void submarine(){
        setShipType('S');
        setShipSize(3);
    }
    protected void destroyer(){
        setShipType('D');
        setShipSize(3);
    }
    protected void patrol_boat(){
        setShipType('P');
        setShipSize(2);
    }
}
