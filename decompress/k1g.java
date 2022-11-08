// 
// Decompiled by Procyon v0.6.0
// 

public final class k1g
{
    public static final a Companion;
    public final int a = 0;
    
    static {
        Companion = new a();
    }
    
    @Override
    public final boolean equals(final Object o) {
        final int a = this.a;
        final boolean b = o instanceof k1g;
        boolean b2 = false;
        if (b) {
            if (a == ((k1g)o).a) {
                b2 = true;
            }
        }
        return b2;
    }
    
    @Override
    public final int hashCode() {
        return this.a;
    }
    
    @Override
    public final String toString() {
        final int a = this.a;
        final int n = 0;
        String s;
        if (a == 0) {
            s = "Polite";
        }
        else {
            int n2 = n;
            if (a == 1) {
                n2 = 1;
            }
            if (n2 != 0) {
                s = "Assertive";
            }
            else {
                s = "Unknown";
            }
        }
        return s;
    }
    
    public static final class a
    {
    }
}
