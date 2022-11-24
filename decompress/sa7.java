// 
// Decompiled by Procyon v0.6.0
// 

public abstract class sa7
{
    public static sa7 a(int n, final double[] array, final double[][] array2) {
        if (array.length == 1) {
            n = 2;
        }
        if (n == 0) {
            return (sa7)new vqh(array, array2);
        }
        if (n != 2) {
            return (sa7)new vdf(array, array2);
        }
        return new a(array[0], array2[0]);
    }
    
    public abstract double b(final double p0);
    
    public abstract void c(final double p0, final double[] p1);
    
    public abstract void d(final double p0, final float[] p1);
    
    public abstract void e(final double p0, final double[] p1);
    
    public abstract double[] f();
    
    public static final class a extends sa7
    {
        public double a;
        public double[] b;
        
        public a(final double a, final double[] b) {
            this.a = a;
            this.b = b;
        }
        
        @Override
        public final double b(final double n) {
            return this.b[0];
        }
        
        @Override
        public final void c(final double n, final double[] array) {
            final double[] b = this.b;
            System.arraycopy(b, 0, array, 0, b.length);
        }
        
        @Override
        public final void d(final double n, final float[] array) {
            int n2 = 0;
            while (true) {
                final double[] b = this.b;
                if (n2 >= b.length) {
                    break;
                }
                array[n2] = (float)b[n2];
                ++n2;
            }
        }
        
        @Override
        public final void e(final double n, final double[] array) {
            for (int i = 0; i < this.b.length; ++i) {
                array[i] = 0.0;
            }
        }
        
        @Override
        public final double[] f() {
            return new double[] { this.a };
        }
    }
}
