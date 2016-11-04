import java.util.*;
public class tictactoe
{         static Scanner in=new Scanner(System.in);
    public static void main()
    {

        System.out.println("Welcome to Tic Tac Toe");

        twoPlayerGame();
    }

    static void twoPlayerGame()
    { System.out.println();

        char ttt[][]=new char[3][3];
        char row='A';
        int column=0;
        System.out.print(" ");
        for(int i=column;i<=2;i++)
        {
            System.out.print("  "+i);
        }
        System.out.println();

        for(int i = 0; i<3; i++)
        {
            System.out.print(row);

            for(int j = 0; j<3; j++)

            {
                System.out.print("  " + ttt[i][j]);

            }

            System.out.println();
            row++;

        }

        while( ( (int)ttt[0][0]+(int)ttt[0][1]+(int)ttt[0][2]!=3*(int)'X')  && ( (int)ttt[1][0]+(int)ttt[1][1]+(int)ttt[1][2]!=3*(int)'X') && ((int)ttt[2][0]+(int)ttt[2][1]+(int)ttt[2][2]!=3*(int)'X') && ((int)ttt[0][0]+(int)ttt[1][0]+(int)ttt[2][0]!=3*(int)'X') && ((int)ttt[0][1]+(int)ttt[1][1]+(int)ttt[1][2]!=3*(int)'X') &&  ((int)ttt[0][2]+(int)ttt[1][2]+(int)ttt[2][2]!=3*(int)'X') && ((int)ttt[0][0]+(int)ttt[1][1]+(int)ttt[2][2]!=3*(int)'X') && ((int)ttt[0][2]+(int)ttt[1][1]+(int)ttt[2][0]!=3*(int)'X' ) && ( (int)ttt[0][0]+(int)ttt[0][1]+(int)ttt[0][2]!=3*(int)'O')  && ( (int)ttt[1][0]+(int)ttt[1][1]+(int)ttt[1][2]!=3*(int)'O') && ((int)ttt[2][0]+(int)ttt[2][1]+(int)ttt[2][2]!=3*(int)'O') && ((int)ttt[0][0]+(int)ttt[1][0]+(int)ttt[2][0]!=3*(int)'O') && ((int)ttt[0][1]+(int)ttt[1][1]+(int)ttt[2][1]!=3*(int)'O') &&  ((int)ttt[0][2]+(int)ttt[1][2]+(int)ttt[2][2]!=3*(int)'O') && ((int)ttt[0][0]+(int)ttt[1][1]+(int)ttt[2][2]!=3*(int)'O') && ((int)ttt[0][2]+(int)ttt[1][1]+(int)ttt[2][0]!=3*(int)'O' )   )
        {System.out.println();
            System.out.println("Player 1's move (enter row, then column on next line)"); 
            char x=in.next().charAt(0);
            int y=in.nextInt();
            ttt[((int)x-65)][y]='X';

            row='A';
            System.out.print(" ");
            for(int i=column;i<=2;i++)
            {
                System.out.print("  "+i);
            }
            System.out.println();

            for(int i = 0; i<3; i++)
            {
                System.out.print(row);

                for(int j = 0; j<3; j++)

                {
                    System.out.print("  " + ttt[i][j]);

                }

                System.out.println();
                row++;

            }

            { if(( (int)ttt[0][0]+(int)ttt[0][1]+(int)ttt[0][2]!=3*(int)'X')  && ( (int)ttt[1][0]+(int)ttt[1][1]+(int)ttt[1][2]!=3*(int)'X') && ((int)ttt[2][0]+(int)ttt[2][1]+(int)ttt[2][2]!=3*(int)'X') && ((int)ttt[0][0]+(int)ttt[1][0]+(int)ttt[2][0]!=3*(int)'X') && ((int)ttt[0][1]+(int)ttt[1][1]+(int)ttt[1][2]!=3*(int)'X') &&  ((int)ttt[0][2]+(int)ttt[1][2]+(int)ttt[2][2]!=3*(int)'X') && ((int)ttt[0][0]+(int)ttt[1][1]+(int)ttt[2][2]!=3*(int)'X') && ((int)ttt[0][2]+(int)ttt[1][1]+(int)ttt[2][0]!=3*(int)'X' ) && ( (int)ttt[0][0]+(int)ttt[0][1]+(int)ttt[0][2]!=3*(int)'O')  && ( (int)ttt[1][0]+(int)ttt[1][1]+(int)ttt[1][2]!=3*(int)'O') && ((int)ttt[2][0]+(int)ttt[2][1]+(int)ttt[2][2]!=3*(int)'O') && ((int)ttt[0][0]+(int)ttt[1][0]+(int)ttt[2][0]!=3*(int)'O') && ((int)ttt[0][1]+(int)ttt[1][1]+(int)ttt[2][1]!=3*(int)'O') &&  ((int)ttt[0][2]+(int)ttt[1][2]+(int)ttt[2][2]!=3*(int)'O') && ((int)ttt[0][0]+(int)ttt[1][1]+(int)ttt[2][2]!=3*(int)'O') && ((int)ttt[0][2]+(int)ttt[1][1]+(int)ttt[2][0]!=3*(int)'O' )   )
                {   System.out.println();
                    System.out.println("Player 2's move (enter row, then column on next line)"); 
                    x=in.next().charAt(0);
                    y=in.nextInt();
                    { if(ttt[((int)x-65)][y]=='X' || ttt[((int)x-65)][y]=='O' )
                        {
                            System.out.println("This space is already occupied, re-enter unoccupied column and row to continue");
                            x=in.next().charAt(0);
                            y=in.nextInt();

                            ttt[((int)x-65)][y]='O';
                            System.out.println();

                            row='A';
                            System.out.print(" ");
                            for(int i=column;i<=2;i++)
                            {
                                System.out.print("  "+i);
                            }
                            System.out.println();

                            for(int i = 0; i<3; i++)
                            {
                                System.out.print(row);

                                for(int j = 0; j<3; j++)

                                {
                                    System.out.print("  " + ttt[i][j]);

                                }

                                System.out.println();
                                row++;

                            }

                        }

                        else
                        {
                            ttt[((int)x-65)][y]='O';

                            row='A';
                            System.out.print(" ");
                            for(int i=column;i<=2;i++)
                            {
                                System.out.print("  "+i);
                            }
                            System.out.println();

                            for(int i = 0; i<3; i++)
                            {
                                System.out.print(row);

                                for(int j = 0; j<3; j++)

                                {
                                    System.out.print("  " + ttt[i][j]);

                                }

                                System.out.println();
                                row++;

                            }

                        }
                    }
                }
                else
                {
                    break;
                }
            }
        }
        
        System.out.println();
        System.out.println("Game over");
        System.out.println();
        

        if ( (ttt[0][0]=='X' && ttt[0][1]=='X' && ttt[0][2]=='X')  || (ttt[1][0]=='X'&& ttt[1][1]=='X'&& ttt[1][2]=='X') || (ttt[2][0]=='X' && ttt[2][1]=='X'&& ttt[2][2]=='X') || (ttt[0][0]=='X' && ttt[1][0]=='X' && ttt[2][0]=='X') || (ttt[0][1]=='X' && ttt[1][1]=='X' && ttt[2][1]=='X') ||  (ttt[0][2]=='X' && ttt[1][2]=='X' && ttt[2][2]=='X') || (ttt[0][0]=='X' && ttt[1][1]=='X' && ttt[2][2]=='X') || (ttt[0][2]=='X'&& ttt[1][1]=='X' && ttt[2][0]=='X') ) 
        {
            System.out.println("Player1 WINS!");

        }
        else if( (ttt[0][0]=='O' && ttt[0][1]=='O' && ttt[0][2]=='O')  || (ttt[1][0]=='O'&& ttt[1][1]=='O'&& ttt[1][2]=='O') || (ttt[2][0]=='O' && ttt[2][1]=='O'&& ttt[2][2]=='O') || (ttt[0][0]=='O' && ttt[1][0]=='O' && ttt[2][0]=='O') || (ttt[0][1]=='O' && ttt[1][1]=='O' && ttt[2][1]=='O') ||  (ttt[0][2]=='O' && ttt[1][2]=='O' && ttt[2][2]=='O') || (ttt[0][0]=='O' && ttt[1][1]=='O' && ttt[2][2]=='O') || (ttt[0][2]=='O'&& ttt[1][1]=='O' && ttt[2][0]=='O')  )
        {

            System.out.println("Player2 WINS!");
        }

    }
}

