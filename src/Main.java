import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int agents = Integer.valueOf(scanner.nextLine());
        String strPeople = scanner.nextLine() + " "+name;
        String[] clients = strPeople.split(" ");
        Arrays.sort(clients);
       int i=0;
        for (String s : clients){
            if (s.equals(name)) break;
            i++;
        }
        int time = (i/agents+1)*20;
        System.out.println(time);
    }
}