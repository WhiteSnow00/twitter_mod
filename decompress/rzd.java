// 
// Decompiled by Procyon v0.6.0
// 

public final class rzd extends jie
{
    public final jie d;
    
    public rzd(final jie d) {
        super(d.b, d.c);
        this.d = d;
    }
    
    @Override
    public final byte[] a() {
        final byte[] a = this.d.a();
        final int n = super.b * super.c;
        final byte[] array = new byte[n];
        for (int i = 0; i < n; ++i) {
            array[i] = (byte)(255 - (a[i] & 0xFF));
        }
        return array;
    }
    
    @Override
    public final byte[] b(int i, byte[] b) {
        b = this.d.b(i, b);
        int b2;
        for (b2 = super.b, i = 0; i < b2; ++i) {
            b[i] = (byte)(255 - (b[i] & 0xFF));
        }
        return b;
    }
    
    @Override
    public final jie f() {
        return this.d;
    }
}
