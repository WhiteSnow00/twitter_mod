// 
// Decompiled by Procyon v0.6.0
// 

public final class gyw
{
    public static final a Companion;
    public static final gyw c;
    public final boolean a;
    public final boolean b;
    
    static {
        Companion = new a();
        c = new gyw(false, false);
    }
    
    public gyw(final boolean a, final boolean b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof gyw)) {
            return false;
        }
        final gyw gyw = (gyw)o;
        return this.a == gyw.a && this.b == gyw.b;
    }
    
    @Override
    public final int hashCode() {
        final int a = this.a ? 1 : 0;
        int n = 1;
        int n2 = a;
        if (a != 0) {
            n2 = 1;
        }
        final int b = this.b ? 1 : 0;
        if (b == 0) {
            n = b;
        }
        return n2 * 31 + n;
    }
    
    @Override
    public final String toString() {
        return tok.h("VideoDockPlaybackState(isMuted=", this.a, ", isPaused=", this.b, ")");
    }
    
    public static final class a
    {
    }
}
