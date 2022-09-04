package com.kishore.anant.microsoft;

import java.util.HashSet;
import java.util.Set;

public class RolePlayingVideoSolution {

    public static void main(String[] args) {
        int totalSkill = solution(new int[]{0, 0, 1, 1}, new int[]{2});
        System.out.println(totalSkill);
    }

    public static int solution(int[] T, int[] A) {
        // write your code in Java SE 8
        Set<Integer> skillSet = new HashSet<Integer>();
        skillSet.add(0);
        for (int primarySkill : A) {
            while (skillSet.add(primarySkill) && T[primarySkill] != 0) {
                primarySkill = T[primarySkill];
            }
        }
        return skillSet.size();
    }
}
