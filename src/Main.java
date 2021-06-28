
public class Main {

    public static void main(String[] args) {
        String[][] letter = new String[9][6];

        for (int i = 0; i < letter.length;i++)
        {
            for (int j = 0; j <letter[i].length;j++)
            {
                if (i == 0 || j == 0 || j == letter[i].length - 1 || i == letter.length / 2 || i == letter.length - 1)
                {
                    letter[i][j] = " * ";
                }
                else
                {
                    letter[i][j] = "   ";
                }
            }
        }

        for (String[] row : letter)
        {
            for (String col : row)
            {
                 System.out.print(col);
            }
            System.out.println("");
        }
    }
}
