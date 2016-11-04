static void onePlayerGame()
    {
        System.out.println();

        char ttt[][]=new char[3][3];
        char row='A';
        int column=1;
        System.out.print(" ");
        for(int i=column;i<=3;i++)
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

        for(int run=0;run<5;run++)
        {
            System.out.println("Your move enter row, then column on next line");
            char x=in.next().charAt(0);
            int y=in.nextInt();
            ttt[((int)x-65)][y-1]='X';
            
            row='A';

            System.out.print(" ");
            for(int i=column;i<=3;i++)
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
            
            
            if(x=='A' && y==1)
            {
              int a = 1 + (int)(Math.random() * ((2 - 1) + 1));
              int b = 65 + (int)(Math.random() * ((66 - 65) + 1));
              
              ttt[(b-65)][a]='O';
              
              row='A';
              
              
              
              
              
              (ttt[0][0]!=ttt[0][1] && ttt[0][1]!=ttt[0][2] && ttt[0][0]!=ttt[0][2])  || (ttt[1][0]!=ttt[1][1] && ttt[1][1]!=ttt[1][2] && ttt[1][0]!=ttt[1][2]) || (ttt[2][0]!=ttt[2][1] && ttt[2][1]!=ttt[2][2] && ttt[2][0]!=ttt[2][2]) || (ttt[0][0]!=ttt[1][0] && ttt[1][0]!=ttt[2][0] && ttt[0][0]!=ttt[2][0]) || (ttt[0][1]!=ttt[1][1] && ttt[1][1]!=ttt[2][1] && ttt[0][1]!=ttt[2][1]) ||  (ttt[0][2]!=ttt[1][2] && ttt[1][2]!=ttt[2][2] && ttt[0][2]!=ttt[2][2]) || (ttt[0][0]!=ttt[1][1] && ttt[1][1]!=ttt[2][2] && ttt[0][0]!=ttt[2][2]) || (ttt[0][2]!=ttt[1][1] && ttt[1][1]!=ttt[2][0] && ttt[0][2]!=ttt[2][0]) )

            System.out.print(" ");
            for(int i=column;i<=3;i++)
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