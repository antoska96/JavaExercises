public class TrianglePrinting {
    public static void main(String[] args) {

        for ( int row = 5; row >= 1; row-- ) {

            for (int space = 1; space < row; space++ )
                System.out.print( " " );

            for (int column = 5; column >= row; column-- )
                System.out.print( "*" );

            System.out.println();
        } // end for loop
    } // end method drawTriangles
} // end class Triangles



