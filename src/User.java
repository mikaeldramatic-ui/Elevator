public class User {

    private String user;
    private int currentFloor;

    public User(String user, int currentFloor) {
        this.user = user;
        this.currentFloor = currentFloor;
    }

    public User(String user) {
        this.user = user;
        this.currentFloor = 0;
    }
    public int getCurrentFloor() {
        return currentFloor;
    }
    public void setCurrentFloor(int floor) {
        this.currentFloor = floor;
    }
    public void respondToWoman(int choice) {
        if (choice ==1) {
            System.out.println("Ja, det stämmer");
        } else if (choice == 2){
            System.out.println("*Endast nickar*");
        }
    }
    public String getUser() {
        return user;
    }
}
