import java.lang.*;
import java.io.*;

public class AnimationHM{
    public static void main(String[]args) throws IOException, InterruptedException
    {
        //create sprites as string arrays.
        String[] spriteHM1 = {
            "                                                            ",
            "                                                            ",
            "                                                            ",
            "                                                            ",
            "                                                            ",
            "                                                            ",
            "                     ||                                     ",
            "                     ||                                     ",
            "                     ||                                     ",
            "                     ||                                     ",
            "                     ||                                     ",
            "                     ||                                     ",
            "                     ||                                     ",
            "                     ||                                     ",
            "                     ||                                     ",
            "              ||=============||                             ",
            "              ||=============||                             ",
            "              ||=============||                             ",
            "--------------||=============||-----------------------------" };
        String[] spriteHM2 = {
            "                                                            ",
            "                                                            ",
            "                                                            ",
            "                                                            ",
            "                                                            ",
            "                      ___________________                   ",
            "                     ||                                     ",
            "                     ||                                     ",
            "                     ||                                     ",
            "                     ||                                     ",
            "                     ||                                     ",
            "                     ||                                     ",
            "                     ||                                     ",
            "                     ||                                     ",
            "                     ||                                     ",
            "              ||=============||                             ",
            "              ||=============||                             ",
            "              ||=============||                             ",
            "--------------||=============||-----------------------------" };
        String[] spriteHM3 = {
            "                                                            ",
            "                                                            ",
            "                                                            ",
            "                                                            ",
            "                                                            ",
            "                      ___________________                   ",
            "                     ||                 ||                  ",
            "                     ||                 ||                  ",
            "                     ||                 ||                  ",
            "                     ||                 ||                  ",
            "                     ||                 ||                  ",
            "                     ||                                     ",
            "                     ||                                     ",
            "                     ||                                     ",
            "                     ||                                     ",
            "              ||=============||                             ",
            "              ||=============||                             ",
            "              ||=============||                             ",
            "--------------||=============||-----------------------------" };
        String[] spriteHM4 = {
            "                                                            ",
            "                                                            ",
            "                                                            ",
            "                                                            ",
            "                                                            ",
            "                                                            ",
            "                                                            ",
            "                                           { ^ ^ }          ",
            "                                             ***            ",
            "                                              |             ",
            "                                      []======|======[]     ",
            "                                              |             ",
            "                                              |             ",
            "                                              |             ",
            "                                           =======          ",
            "                                          ||     ||         ",
            "                                          ||     ||         ",
            "                                          ||     ||         ",
            "                                       ---------------      ", };
        String[] spriteHM5 = {
            "                      ________________________              ",
            "                      ||                     ||             ",
            "                      ||                     ||             ",
            "                      ||                     ||             ",
            "                      ||                     ||             ",
            "                      ||                     ||             ",
            "                      ||                     ||             ",
            "                      ||                   { ^ ^ }          ",
            "                      ||                     ***            ",
            "                      ||                      |             ",
            "                      ||                ======|======       ",
            "                      ||                      |             ",
            "                      ||                      |             ",
            "                      ||                      |             ",
            "                      ||                   =======          ",
            "                ||=============||         ||     ||         ",
            "                ||=============||         ||     ||         ",
            "                ||=============||                           ",
            "----------------||=============||---------------------------" };

        String[] spriteHM6 = {
            "What do you think is happend after the winter has been hannged ?"
        };

        String[] spriteHM7 = {
            "Let's find out! ?"
        };

        print(spriteHM1);
        Thread.sleep(1500);
        print(spriteHM2);
        Thread.sleep(1500);
        print(spriteHM3);
        Thread.sleep(1500);
        animate(spriteHM4);
        Thread.sleep(1500);
        print(spriteHM5);
        Thread.sleep(1500);
        print(spriteHM6);
        Thread.sleep(5500);
        print(spriteHM7);
        Thread.sleep(5500);
    }  // end main

    /*
    The method print is used to print one element of a string array per line.
    It can be used for text or ascii art.
    @param String[] printable
    */
    public static void print(String[] printable) throws IOException,
           InterruptedException
    {
        clear();
        //System.out.println(ANSI_CLEAR_SCREEN + ANSI_RED + ANSI_BOLD);
        for(int k = 0; k < printable.length; k++) {
            System.out.println(printable[k]);
        }
        //System.out.println(ANSI_RESET);
   }
    /*
    The method Animate is used to print one element of a string array per line.
    with the addition of space before printing the array. The space is reduced
    by one each time and then printing continues.
    It can be used for text or ascii art.
    @param String[] printable
    */
   public static void animate(String[] printable) throws IOException,
          InterruptedException
   {
        clear();
        //System.out.println(ANSI_CLEAR_SCREEN + ANSI_GREEN + ANSI_BOLD);
        for(int path = 0; path < printable.length; path++) {
            Thread.sleep(500);
            clear();
            //System.out.println(ANSI_CLEAR_SCREEN + ANSI_GREEN + ANSI_BOLD);
            for(int k = 0; k < printable.length; k++) {
                for(int space = printable.length; space > path; space--) {
                    System.out.print(" ");
                }
                System.out.println(printable[k]);
            }
        }
    //System.out.println(ANSI_RESET);
   }// end animate

    /*
    * a quick process that clears the screen  Currently only for windows users.
    */
    public static void clear() throws IOException, InterruptedException {
        //new ProcessBuilder("cmd", "/c", "clear").inheritIO().start().waitFor();
        new ProcessBuilder("clear").inheritIO().start().waitFor();
    }  //end clear
}  //end class

