// 
// Decompiled by Procyon v0.6.0
// 

public final class t0e extends fje
{
    public final fje d;
    
    public t0e(final fje d) {
        super(d.b, d.c);
        this.d = d;
    }
    
    public final byte[] a() {
        final byte[] a = this.d.a();
        final int n = super.b * super.c;
        final byte[] array = new byte[n];
        for (int i = 0; i < n; ++i) {
            array[i] = (byte)(255 - (a[i] & 0xFF));
        }
        return array;
    }
    
    public final byte[] b(int i, byte[] b) {
        b = this.d.b(i, b);
        int b2;
        for (b2 = super.b, i = 0; i < b2; ++i) {
            b[i] = (byte)(255 - (b[i] & 0xFF));
        }
        return b;
    }
    
    public final fje f() {
        return this.d;
    }
}
