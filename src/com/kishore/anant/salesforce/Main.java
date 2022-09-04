package com.kishore.anant.salesforce;


/*enum Choice {
    PWD(0),
    LS(1),
    MKDIR(2),
    CD(3),
    TOUCH(4),
    QUIT(5);

    public final int label;

    private Choice(int label) {
        this.label = label;
    }
}

public class Main {

    static {


        HashMap<String, Integer> choiceMap = new HashMap<>();
        choiceMap.put("pwd", 0);
        choiceMap.put("ls", 1);
        choiceMap.put("mkdir", 2);
        choiceMap.put("cd", 3);
        choiceMap.put("touch", 4);
        choiceMap.put("quit", 5);

    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT

        while (cmd != 5) {
            File dir = null;
            switch (cmd) {

                case 0:

                    break;
                case 1:

                case 2:
                    System.out.println("mkdir");
                    break;
                case 3:

                    break;
                case 4:
                    System.out.println("touch");
                    break;
                default:
                    break;
            }
            choiceString = scanner.next();
            if (choiceMap.containsKey(choiceString.toLowerCase())) {
                choice = choiceMap.get(choiceString.toLowerCase());
            }

        }
        System.out.println("Quitting Application");
    }


    private static void parseInput() {
        System.out.print(": ");
        Scanner scanner = new Scanner(System.in);
        String inputStr = scanner.nextLine();

        if (!inputStr.equals("quit")) {
            parseCommand(inputStr);
            parseInput();
        }
    }

    private static void parseCommand(String cmdStr) {
        String cmdParts[] = cmdStr.split(" ");
        String mainCmd = cmdParts[0].strip().toLowerCase();

        if (choiceMap.containsKey(mainCmd)) {
            cmd = choiceMap.get(mainCmd);
        }
        switch (cmdParts[0]) {
            case 0:
                lsCommandAction(cmdParts);
                break;

            case 1:
                pwdCommandAction();
                break;

            case 2:
                cdCommandAction(cmdParts);
                break;

            case 3:
                mkdirCommandAction(cmdParts);
                break;

            case 4:
                viCommandAction(cmdParts);
                break;

            case 5:
                viCommandAction(cmdParts);
                break;

            default:
                System.out.println("Invalid command " + cmd);
        }
    }

    private static void viCommandAction(String[] cmdParts) {
    }

    private static void mkdirCommandAction(String[] cmdParts) {

    }

    private static void cdCommandAction(String[] cmdParts) {
        System.out.println(System.getProperty("user.dir"));
        File dir = new File(cmdParts[1]);
        if(dir.isDirectory()==true) {
            System.setProperty("user.dir", dir.getAbsolutePath());
        } else {
            System.out.println(cmdParts[1] + "is not a directory.");
        }
        System.out.println(System.getProperty("user.dir"));
    }

    private static void pwdCommandAction() {
        String userDirectory = System.getProperty("user.dir");
        System.out.println(userDirectory);
    }

    private static void lsCommandAction(String[] cmdParts) {
        File dir = new File(System.getProperty("user.dir"));
        String childs[] = dir.list();
        for(String child: childs){
            System.out.println(child);
        }


    }
}
        */