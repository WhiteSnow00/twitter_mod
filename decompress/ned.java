// 
// Decompiled by Procyon v0.6.0
// 

public final class ned implements ysl
{
    public static final ned d;
    public int a;
    public boolean b;
    public boolean c;
    
    static {
        d = new ned(Integer.MAX_VALUE, true, true);
    }
    
    public ned(final int a, final boolean b, final boolean c) {
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
        if (!(o instanceof ned)) {
            return false;
        }
        final ned ned = (ned)o;
        if (this.a != ned.a || this.b != ned.b || this.c != ned.c) {
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
