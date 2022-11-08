// 
// Decompiled by Procyon v0.6.0
// 

public final class jed implements yrl
{
    public static final jed d;
    public int a;
    public boolean b;
    public boolean c;
    
    static {
        d = new jed(Integer.MAX_VALUE, true, true);
    }
    
    public jed(final int a, final boolean b, final boolean c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (!(o instanceof jed)) {
            return false;
        }
        final jed jed = (jed)o;
        if (this.a != jed.a || this.b != jed.b || this.c != jed.c) {
            b = false;
        }
        return b;
    }
    
    @Override
    public final int hashCode() {
        final int a = this.a;
        final boolean b = this.b;
        int n = 0;
        int n2;
        if (b) {
            n2 = 4194304;
        }
        else {
            n2 = 0;
        }
        if (this.c) {
            n = 8388608;
        }
        return a ^ n2 ^ n;
    }
}
