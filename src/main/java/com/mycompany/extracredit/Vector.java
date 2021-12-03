package com.mycompany.extracredit;
public final class Vector {
    private int n;           // length of the vector
    private double[] data;   // array of vector's components


    // create the zero Vector of length n
    public Vector(int n) {
        this.n    = n;             
        this.data = new double[n];  // data = new double[n] is equivalent
    }


    // create a vector from the given Vector
    public Vector(double[] value) {
        n = value.length;

        // We need a defensive copy so client can't alter our copy of data[]
        // This isn't it!
        double[] data = value;




        





    }

    // return the length of the vector
    public int length() {
        return n;
    }     


    // this + that: add this Vector to Vector that and return sum
    public Vector plus(Vector that) {
        if (this.length() != that.length()) {
            throw new RuntimeException("lengths of two vectors are not equal"); 
        }
        Vector sum = new Vector(this.n);
        for (int i = 0; i < this.n; i++) {
            sum.data[i] = this.data[i] + that.data[i];
        }
        return sum;
    }

    // this - that: subtract that Vector from this Vector and return difference
    public Vector subtract(Vector that) {
        if (this.length() != that.length()) {
            throw new RuntimeException("lengths of two vectors are not equal"); 
        }
        Vector difference = new Vector(this.n);
        for (int i = 0; i < this.n; i++) {
            difference.data[i] = this.data[i] - that.data[i];
        }
        return difference;
    }

    // create and return a new Vector multiplying each element by factor
    public Vector times(double factor) {
        Vector result = new Vector(n);
        for (int i = 0; i < n; i++) {
            result.data[i] = factor * data[i];
        }
        return result;
    }


    // return the corresponding unit vector
    public Vector direction() {
        return this.times(1.0 / this.magnitude());
        // return times(1.0 / magnitude()); is equivalent
    }

    // return the inner product of this Vector and that Vector 
    public double dot(Vector that) {















        return 0;















    }

    // return the Euclidean norm of this Vector
    public double magnitude() {
        return Math.sqrt(this.dot(this));
    }

    // return a string representation of the vector
    public String toString() {
        String result = "(";
        for (int i = 0; i < n; i++) {
            result = result + data[i];  // append a value
            if (i < n-1) 
                result = result + ", "; // need a comma except for last element
        }
        return result + ")";
    }

    // return the corresponding coordinate
    public double cartesian(int i) {
        return data[i];
    }


}
    