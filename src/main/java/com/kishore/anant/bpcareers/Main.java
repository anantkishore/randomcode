package com.kishore.anant.bpcareers;
import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;
import jdk.nashorn.internal.runtime.regexp.JoniRegExp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.*;

/**
 * The Main class implements an application that reads lines from the standard input
 * and prints them to the standard output.
 */
public class Main {
    /**
     * Iterate through each line of input.
     */
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);

        HashMap<String, SinglyLinkedList> stringNodeMap = new HashMap<>();
        List<Boolean> results = new ArrayList<>();
        List<String> inputLines = new ArrayList<>();
        inputLines.add("a->b");
        inputLines.add("r->s");
        inputLines.add("b->c");
        inputLines.add("x->c");
        inputLines.add("q->r");
        inputLines.add("y->x");
        inputLines.add("w->z");
        inputLines.add("a,q,w");
        inputLines.add("a,c,r");
        inputLines.add("y,z,a,r");
        inputLines.add("a,w");
        for (String line: inputLines) {
            //System.out.println(line);
            if(line.contains("->")){
                String[] edge = line.split("->");
                String src = edge[0];
                String dest = edge[1];
                SinglyLinkedList srcNode = stringNodeMap.getOrDefault(src, null);
                SinglyLinkedList destNode = stringNodeMap.getOrDefault(dest, null);
                if(srcNode != null && destNode == null){
                    srcNode.next = new SinglyLinkedList(dest);
                }else {
                    srcNode = new SinglyLinkedList(src, dest, destNode);
                }
                stringNodeMap.put(src, srcNode);
                stringNodeMap.put(dest, srcNode.next);
            } else if (line.contains(",")) {
                String[] nodes = line.split(",");
                ArrayList<SinglyLinkedList> singleLinkedLists = new ArrayList<>();
                for (String start: nodes){
                    singleLinkedLists.add(stringNodeMap.get(start));
                }
                results.add(DoLinkedListsIntersect(singleLinkedLists));
            }
        }
        for (boolean result: results){
            System.out.println(result);
        }


    }

    public static boolean DoLinkedListsIntersect(Collection<SinglyLinkedList> lists){

        HashSet<String> nodes = new HashSet<>();
        boolean result = false;
        for (SinglyLinkedList list: lists){
            SinglyLinkedList currentNode = list;
            while (currentNode != null){
                if(!nodes.add(currentNode.getValue())){
                    result = true;
                    break;
                }
                currentNode = currentNode.next;
            }
        }
        return result;

     /* a->b

      b->c
      x->c
      y->x

      r->s
      q->r

      w->z

a,q,w
a,c,r
y,z,a,r
a,w */

    }
}

class SinglyLinkedList {
    private String value;
    SinglyLinkedList next;

    public SinglyLinkedList(String value){
        this.value = value;
    }

    public SinglyLinkedList(String source, String destination, SinglyLinkedList destNode){
        this.value = source;

        if(destNode != null) {
            this.next = destNode;
        }
        else {
            this.next = new SinglyLinkedList(destination);
        }

    }

    public String getValue(){
        return this.value;
    }

}

