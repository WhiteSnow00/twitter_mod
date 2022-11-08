import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class poj
{
    public float[] a;
    public double[] b;
    public double[] c;
    public aqh d;
    public int e;
    
    public poj() {
        this.a = new float[0];
        this.b = new double[0];
    }
    
    public final void a(final double n, final float n2) {
        final int n3 = this.a.length + 1;
        int binarySearch;
        final int n4 = binarySearch = Arrays.binarySearch(this.b, n);
        if (n4 < 0) {
            binarySearch = -n4 - 1;
        }
        this.b = Arrays.copyOf(this.b, n3);
        this.a = Arrays.copyOf(this.a, n3);
        this.c = new double[n3];
        final double[] b = this.b;
        System.arraycopy(b, binarySearch, b, binarySearch + 1, n3 - binarySearch - 1);
        this.b[binarySearch] = n;
        this.a[binarySearch] = n2;
    }
    
    @Override
    public final String toString() {
        final StringBuilder g = w48.g("pos =");
        g.append(Arrays.toString(this.b));
        g.append(" period=");
        g.append(Arrays.toString(this.a));
        return g.toString();
    }
}
