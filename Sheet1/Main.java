import javax.swing.JOptionPane;


public class Main{


    public static void main(String[] args){
      
        int continueProgram;
        do{
            programExecute();
            continueProgram = JOptionPane.showConfirmDialog(null, "Do you want to continue?","Message", JOptionPane.YES_NO_OPTION );
        }while(continueProgram == JOptionPane.YES_OPTION);

    }
    public static void programExecute(){
        String questionNumberDialog = JOptionPane.showInputDialog("Enter question number(1, 2, 3)");
        int questionNumber = Integer.parseInt(questionNumberDialog);

        //Question number 1: the user enter triangle height and symbol to be used in triangle
        if(questionNumber == 1) {
            String triangleHeight = JOptionPane.showInputDialog("Enter triangle height");
            int height = Integer.parseInt(triangleHeight);
            if (height > 0) {
                String symbol = JOptionPane.showInputDialog("Enter symbol");
                for (int i = 1; i <= height; i++) {
                    for (int j = 1; j <= height; j++) {
                        if (i >= j) {
                            System.out.print(symbol.charAt(0) + " ");
                        }
                    }
                    System.out.print("\n");
                }
            } else
                JOptionPane.showMessageDialog(null, "Invalid User Entry", "Error", JOptionPane.ERROR_MESSAGE);
        }
        //Question number 2: the user enter triangle height and symbols one for the odd rows and the other for the even rows
        else if (questionNumber == 2) {
            String triangleHeight = JOptionPane.showInputDialog("Enter triangle height");
            int height = Integer.parseInt(triangleHeight);
            if (height > 0) {
                String oddRowsSymbol = JOptionPane.showInputDialog("Enter odd rows symbol");
                String evenRowsSymbol = JOptionPane.showInputDialog("Enter even rows symbol");
                for (int i = 1; i <= height; i++) {
                    for (int j = 1; j <= height; j++) {
                        if (i >= j) {
                            if (i % 2 == 1)
                                System.out.print(oddRowsSymbol.charAt(0) + " ");
                            else
                                System.out.print(evenRowsSymbol.charAt(0) + " ");
                        }
                    }
                    System.out.print("\n");
                }
            } else
                JOptionPane.showMessageDialog(null, "Invalid User Entry", "Error", JOptionPane.ERROR_MESSAGE);
            //Question number 3: the user enter rectangle height and symbols one for the lower triangle and the other for the upper triangle
        } else if (questionNumber == 3) {
            String rectangleHeight = JOptionPane.showInputDialog("Enter rectangle height");
            int height = Integer.parseInt(rectangleHeight);
            if (height > 0) {
                String upperTriangleSymbol = JOptionPane.showInputDialog("Enter upper triangle symbol");
                String lowerTriangleSymbol = JOptionPane.showInputDialog("Enter lower triangle symbol");
                for (int i = 1; i <= height; i++) {
                    for (int j = 1; j <= height; j++) {
                        if (i >= j)
                            System.out.print(lowerTriangleSymbol.charAt(0) + " ");
                        else
                            System.out.print(upperTriangleSymbol.charAt(0) + " ");

                    }
                    System.out.print(upperTriangleSymbol.charAt(0)+ "\n");
                }
            } else
                JOptionPane.showMessageDialog(null, "Invalid User Entry", "Error", JOptionPane.ERROR_MESSAGE);
        } else
            JOptionPane.showMessageDialog(null, "Invalid User Entry", "Error", JOptionPane.ERROR_MESSAGE);
    }
}
