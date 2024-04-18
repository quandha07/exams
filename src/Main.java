public class Main {
    public static void main(String[] args) {
        Rover roverMoon = new Rover(1, 2, "N");
        roverMoon.processInstruction("LMLMLMLMM");
        System.out.println("Location: 12N Movement: LMLMLMLMM Output: ");
        roverMoon.getInstruction();

        Rover roverMoon2 = new Rover(3, 3, "E");
        roverMoon2.processInstruction("MMRMMRMRRM");
        System.out.println("Location: 33E Movement: MMRMMRMRRM Output: ");
        roverMoon2.getInstruction();

        Rover roverMoon3 = new Rover(5, 5, "N");
        roverMoon3.processInstruction("MMRMMLLMRMLLM");
        System.out.println("Location: 55N Movement: MMRMMLLMRMLLM  Output: ");
        roverMoon3.getInstruction();
    }
}