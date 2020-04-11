package com.eonsahead.swing;

public class Vector {

    private double x;
    private double y;
    private double z;
    private double w;

    /**
     * Construct an empty vector with 0 in all coordinates
     */
    public Vector() {
        this.x = 0;
        this.y = 0;
        this.z = 0;
        this.w = 0;
    } //Vector()
    
    /**
     * Construct a vector with the given values.
     * 
     * @param x: the value in the x coordinate
     * @param y: the value in the y coordinate
     * @param z: the value in the z coordinate
     */
    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.w = 1;
    } //Vector( double, double)
    
    /**
     * Retrieve a value from a vector.
     * 
     * @param target: the location of of the desired value
     * @return the value at the specified location, 0 for x, 1 for y,
     * 2 for z, and 3 for the homogeneous coordinate. Returns 0 otherwise.
     */
    public double get(int target){
        switch (target) {
            case 0:
                return this.x;
            case 1:
                return this.y;
            case 2:
                return this.z;
            case 3:
                return this.w;
            default:
                return 0;
        } //switch(target)
    } //get(int)
    
    /**
     * Set a coordinate in a vector.
     * @param target: the intended coordinate
     * @param value: the new value
     */
    public void set(int target, double value){
        switch (target) {
            case 0:
                this.x = value;
            case 1:
                this.y = value;
            case 2:
                this.z = value;
            case 3:
                this.w = value;
        } //switch(target)
    } //set(int)
    
    /**
     * Set all coordinates in a vector.
     * 
     * @param v the new vector which will replace the values of the old one.
     */
    public void set(Vector v){
        this.x = v.x;
        this.y = v.y;
        this.z = v.z;
        this.w = v.w;
    }
    
    /**
     * Subtract a vector from another vector.
     * 
     * @param v: the vector to be subtracted
     * @return the result of the subtraction
     */
    public Vector subtract(Vector v){
        return new Vector(this.x - v.x, this.y - v.y, this.z - v.z);
    }
    
    /**
     * Find the dot product of two vectors.
     * 
     * @param v: the other vector
     * @return the dot product of the two vectors
     */
    public double dot(Vector v){
        return this.x * v.x + this.y * v.y + this.z * v.z;
    } //dot(Vector)
    
    /**
     * Calculate the magnitude of a vector.
     * 
     * @return the magnitude of the vector
     */
    public double magnitude(){
        return Math.sqrt(this.dot(this));
    } //magnitude()
    
    /**
     * Normalize the vector.
     * 
     * @return the unit vector for the vector
     */
    public Vector normalize(){
        double mag = this.magnitude();
        return new Vector(this.x / mag, this.y / mag, this.z / mag);
    } //normalize()
    
    /**
     * Calculate the cross product of two vectors.
     * 
     * @param v: the other vector
     * @return the cross product of the two vectors
     */
    public Vector cross(Vector v){
        return new Vector(this.y * v.z - this.z * v.y, this.z * v.x - this.x * v.z, this.x * v.y - this.y * v.x);
    }
} // Vector
