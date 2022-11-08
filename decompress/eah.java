// 
// Decompiled by Procyon v0.6.0
// 

public final class eah implements c5r
{
    public final c5r[] C0;
    public final fah D0;
    
    public eah(final c5r... c0) {
        this.C0 = c0;
        this.D0 = new fah();
    }
    
    public final StackTraceElement[] b(StackTraceElement[] b) {
        if (b.length <= 1024) {
            return b;
        }
        final c5r[] c0 = this.C0;
        final int length = c0.length;
        int i = 0;
        StackTraceElement[] b2 = b;
        while (i < length) {
            final c5r c5r = c0[i];
            if (b2.length <= 1024) {
                break;
            }
            b2 = c5r.b(b);
            ++i;
        }
        b = b2;
        if (b2.length > 1024) {
            b = this.D0.b(b2);
        }
        return b;
    }
}
