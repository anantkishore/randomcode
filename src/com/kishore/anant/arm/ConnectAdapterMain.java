package com.kishore.anant.arm;

import java.util.Arrays;

public class ConnectAdapterMain {

    public static void main(String[] args) {

        String[] newCmd = new String[]{"bsub", "-Is", "-q", "normal", "-P", "PJ31000030",
                "-M", "100", "-W", "444", "-R", "\"select[linux && (rhe7) && (os64)]",
                "rusage[mem=1400,swp=1400]",
                "order[cpu]\"",
                "-o", "out.log",
                "/arm/tools/setup/bin/mrun",
                "+pipd/software/mercury/8.1.2",
                "mercury",
                "timesaver",
                "-P",
                "rel_path5.txt"};
        System.out.println(Arrays.toString(newCmd));
        System.out.print(newCmd.toString());
        StringBuilder sb = new StringBuilder();
        for (String s:newCmd
        ) {
            sb.append(s+" ");
        }
        System.out.print(sb.toString());

    }
}
