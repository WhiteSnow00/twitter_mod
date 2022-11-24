// 
// Decompiled by Procyon v0.6.0
// 

public final class cyo extends mq9
{
    public double d;
    public double e;
    
    public cyo(final String a) {
        super.a = a;
        final int index = a.indexOf(40);
        final int index2 = a.indexOf(44, index);
        this.d = Double.parseDouble(a.substring(index + 1, index2).trim());
        final int n = index2 + 1;
        this.e = Double.parseDouble(a.substring(n, a.indexOf(44, n)).trim());
    }
    
    @Override
    public final double a(double n) {
        final double e = this.e;
        if (n < e) {
            n = e * n / ((e - n) * this.d + n);
        }
        else {
            n = (n - 1.0) * (1.0 - e) / (1.0 - n - (e - n) * this.d);
        }
        return n;
    }
    
    @Override
    public final double b(double n) {
        final double e = this.e;
        if (n < e) {
            final double d = this.d;
            n += (e - n) * d;
            n = d * e * e / (n * n);
        }
        else {
            final double d2 = this.d;
            final double n2 = e - 1.0;
            n = (e - n) * -d2 - n + 1.0;
            n = n2 * d2 * n2 / (n * n);
        }
        return n;
    }
}
