// 
// Decompiled by Procyon v0.6.0
// 

public final class vai implements tws
{
    public final boolean a;
    public final boolean b;
    
    public vai(final boolean a, final boolean b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof vai)) {
            return false;
        }
        final vai vai = (vai)o;
        return this.a == vai.a && this.b == vai.b;
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
        return da8.k("NavigationInstruction(startAtTop=", this.a, ", getNewer=", this.b, ")");
    }
    
    public static final class a implements vsd
    {
        public final boolean a;
        
        public a(final boolean a) {
            this.a = a;
        }
        
        @Override
        public final boolean a() {
            return false;
        }
    }
}
