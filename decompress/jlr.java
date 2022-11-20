// 
// Decompiled by Procyon v0.6.0
// 

public final class jlr
{
    public static final a Companion;
    public final int a;
    
    static {
        Companion = new a();
    }
    
    public jlr(final int a) {
        this.a = a;
    }
    
    public static String a(final int n) {
        final int n2 = 0;
        String s;
        if (n == 0) {
            s = "Butt";
        }
        else if (n == 1) {
            s = "Round";
        }
        else {
            int n3 = n2;
            if (n == 2) {
                n3 = 1;
            }
            if (n3 != 0) {
                s = "Square";
            }
            else {
                s = "Unknown";
            }
        }
        return s;
    }
    
    @Override
    public final boolean equals(final Object o) {
        final int a = this.a;
        final boolean b = o instanceof jlr;
        boolean b2 = false;
        if (b) {
            if (a == ((jlr)o).a) {
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
        return a(this.a);
    }
    
    public static final class a
    {
    }
}
