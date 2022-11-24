// 
// Decompiled by Procyon v0.6.0
// 

public final class nbi implements mxs
{
    public final boolean a;
    public final boolean b;
    
    public nbi(final boolean a, final boolean b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof nbi)) {
            return false;
        }
        final nbi nbi = (nbi)o;
        return this.a == nbi.a && this.b == nbi.b;
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
        return p4l.f("NavigationInstruction(startAtTop=", this.a, ", getNewer=", this.b, ")");
    }
    
    public static final class a implements xtd
    {
        public final boolean a;
        
        public a(final boolean a) {
            this.a = a;
        }
        
        public final boolean a() {
            return false;
        }
    }
}
