import Models.Inventory;


import java.util.Scanner;

public class App {



    /*
     * Command variables
     */
    private static final String createCmd = "create";
    private static final String deleteCmd = "delete";
    private static final String updateCPCmd = "updateBuy";
    private static final String updateSPCmd = "updateSell";
    private static final String reportCmd = "report";


    public static void main(String[] args) {

        try{

            Scanner in = new Scanner(System.in);

            String cmd = null;

            while (true){

                System.out.print("Enter 1 to quit");

                //read input from user
                cmd = in.nextLine();

                if("1".equalsIgnoreCase(cmd)){
                    System.out.println("EXITED -------------- ");
                    break;
                }

                String[] cmds = cmd.split(" ");
                String tester = cmds[0];
                if(createCmd.equalsIgnoreCase(tester)){
                    Inventory.Create(cmds[1], Double.valueOf(cmds[2]), Double.valueOf(cmds[3]), Integer.valueOf(cmds[4]));
                }else if(deleteCmd.equalsIgnoreCase(tester)){
                    Inventory.delete(cmds[1]);
                }else if(updateCPCmd.equalsIgnoreCase(tester)){
                    Inventory.updateBuy(cmds[1], Integer.valueOf(cmds[2]));
                }else if(updateSPCmd.equalsIgnoreCase(tester)){
                    Inventory.updateSell(cmds[1], Integer.valueOf(cmds[2]));
                } else if (reportCmd.equalsIgnoreCase(tester)) {
                    Inventory.report();
                }
            }

        }catch (Exception e){
            e.printStackTrace();
        }



    }
}
