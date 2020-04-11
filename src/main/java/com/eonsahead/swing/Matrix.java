package com.eonsahead.swing;

/**
 * Model a matrix.
 *
 * @author Kaelin Miller
 * @version 8 April 2020
 */
public class Matrix {

    private final double[][] elements;
    
    /**
     * Construct an identity matrix.
     */
    public Matrix() {
        this.elements = new double[4][4];
        this.identity();
    } // Matrix()

    /**
     * Retrieve a value from the given coordinates in the matrix.
     * 
     * @param row: the row of the desired value
     * @param column: the column of the desired value
     * @return: the value at the given row and column
     */
    public double get(int row, int column) {
        return this.elements[row][column];
    } // get( int, int )

    /**
     * Set the value stored at a given set of coordinates
     * 
     * @param row: the row of the value to be changed
     * @param column: the column of the value to be changed
     * @param value: the value to be stored
     */
    public void set(int row, int column, double value) {
        this.elements[row][column] = value;
    } // set( int, int, double )

    /**
     * Set any matrix to an identity matrix.
     */
    public final void identity() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == j) {
                    this.set(i, j, 1.0);
                } // if
                else {
                    this.set(i, j, 0.0);
                } // else
            } // for
        } // for
    } // identity()
    
    /**
     * Model rotation around the x axis
     * 
     * @param angle: the angle of rotation 
     */
    public void rotationX(double angle) {
        this.identity();
        this.set(1, 1, Math.cos(angle));
        this.set(1, 2, -Math.sin(angle));
        this.set(2, 1, Math.sin(angle));
        this.set(2, 2, Math.cos(angle));
    } // rotationX( double )
    
    /**
     * Model rotation around the y axis.
     * 
     * @param angle the angle of rotation
     */
    public void rotationY(double angle) {
        this.identity();
        this.set(0, 0, Math.cos(angle));
        this.set(0, 2, -Math.sin(angle));
        this.set(2, 0, Math.sin(angle));
        this.set(2, 2, Math.cos(angle));
    } // rotationY( double )

    /**
     * Model rotation around the z axis.
     * 
     * @param angle: the angle of rotation
     */
    public void rotationZ(double angle) {
        this.identity();
        this.set(0, 0, Math.cos(angle));
        this.set(0, 1, -Math.sin(angle));
        this.set(1, 0, Math.sin(angle));
        this.set(1, 1, Math.cos(angle));
    } // rotationZ( double )
    
    /**
     * Model scaling in a 3 dimensional space.
     * 
     * @param x: amount to be scaled on the x axis
     * @param y: amount to be scaled on the y axis
     * @param z: amount to be scaled on the z axis
     */
    public void scale(double x, double y, double z){
        this.identity();
        this.set(0, 0, x);
        this.set(1, 1, y);
        this.set(2, 2, z);
    }
    
    /**
     * Model translation in a 3 dimensional space.
     * 
     * @param x: distance translated along the x axis
     * @param y: distance translated along the y axis
     * @param z: distance translated along the z axis
     */
    public void translate(double x, double y, double z){
        this.identity();
        this.set(0, 3, x);
        this.set(1, 3, y);
        this.set(2, 3, z);
    }

    /**
     * Multiply two matrices together.
     * 
     * @param otherMatrix: the matrix to be multiplied
     * @return the product of the two matrices
     */
    public Matrix multiply(Matrix otherMatrix) {
        Matrix product = new Matrix();
        for (int row = 0; row < 4; row++) {
            for (int column = 0; column < 4; column++) {
                double sum = 0.0;
                for (int k = 0; k < 4; k++) {
                    sum += this.elements[row][k]
                            * otherMatrix.elements[k][column];
                } // for
                product.set(row, column, sum);
            } // for
        } // for
        return product;
    } // multiply( Matrix )
    
    /**
     * Multiply a matrix by a vector.
     * 
     * @param factor the vector to be multiplied
     * @return the resulting vector
     */
    public Vector multiply(Vector factor) {
        Vector product = new Vector();
        for (int row = 0; row < 4; row++) {
            double sum = 0;
            for (int column = 0; column < 4; column++) {
                sum += this.get(row, column) * factor.get(column);
            } // for
            product.set(row, sum);
        } // for
        return product;
    }

    /**
     * Convert a row of a matrix into a legible string.
     * 
     * @param row: the row of the matrix to be converted
     * @return: the row in string form
     */
    private String rowToString(int row) {
        StringBuilder result = new StringBuilder();
        result.append("( ");
        for (int i = 0; i < 3; i++) {
            result.append(this.get( row, i));
            result.append(",");
        } // for
        result.append(this.get( row, 3 ));
        result.append(" )");
        return result.toString();
    } // rowToString( int )

    /**
     * Convert a matrix into a legible string.
     * 
     * @return the matrix in string form.
     */
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("[ ");
        for (int i = 0; i < 4; i++) {
            result.append(rowToString(i));
        } //
        result.append(" ]");
        return result.toString();
    } // toString()

    public static void main(String[] args) {
    } // main( String [] )

} // Matrix
