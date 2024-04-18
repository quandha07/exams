public class Rover {
    private int x;
    private int y;
    private String heading;

    public Rover(int x, int y, String heading) {
        this.x = x;
        this.y = y;
        this.heading = heading;
    }

    public void moveR(char instruction) {
        switch(instruction){
            case 'L':
                turnLeft();
                break;
            case 'R':
                turnRight();
                break;
            case 'M':
                forWard();
                break;
        }
    }

    private void forWard() {
        switch(heading){
            case "N":
               if(y < 5) {
                   y++;
               }
                break;
            case "E":
                if(x < 5){
                   x++;
                }
                break;
            case "S":
                y--;
                break;
            case "W":
                x--;
                break;
        }
    }

    private void turnRight() {
        switch(heading){
            case "N":
                heading = "E";
                break;
            case "E":
                heading = "S";
                break;
            case "S":
                heading = "W";
                break;
            case "W":
                heading = "N";
                break;
        }
    }

    private void turnLeft() {
        switch(heading){
            case "N":
                heading = "W";
                break;
            case "W":
                heading = "S";
                break;
            case "S":
                heading = "E";
                break;
            case "E":
                heading = "N";
                break;
        }
    }

    public void processInstruction(String instructions){
        for(char instr : instructions.toCharArray()) {
            moveR(instr);
        }
    }

    public void getInstruction(){
        System.out.println(x + "" + y + heading);
    }
}
