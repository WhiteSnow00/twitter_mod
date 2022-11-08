// 
// Decompiled by Procyon v0.6.0
// 

public abstract class ia7
{
    public static ia7 a(int n, final double[] array, final double[][] array2) {
        if (array.length == 1) {
            n = 2;
        }
        if (n == 0) {
            return (ia7)new aqh(array, array2);
        }
        if (n != 2) {
            return new mdf(array, array2);
        }
        return (ia7)new ia7.ia7$a(array[0], array2[0]);
    }
    
    public abstract double b(final double p0);
    
    public abstract void c(final double p0, final double[] p1);
    
    public abstract void d(final double p0, final float[] p1);
    
    public abstract void e(final double p0, final double[] p1);
    
    public abstract double[] f();
}
