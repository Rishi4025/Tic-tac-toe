
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
