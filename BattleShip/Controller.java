
abstract class Controller extends Ship{

    protected String player1;
    protected String player2;

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

    protected void setPlayer1(String player1){
        this.player1 = player1;
    }
    protected String getPlayer1(){
        return player1;
    }

    protected void setPlayer2(String player2){
        this.player2 = player2;
    }
    protected String getPlayer2(){
        return player2;
    }
}
