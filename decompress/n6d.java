// 
// Decompiled by Procyon v0.6.0
// 

public final class n6d
{
    public static final a Companion;
    public final int a;
    
    static {
        Companion = new a();
    }
    
    public n6d(final int a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        final int a = this.a;
        final boolean b = o instanceof n6d;
        boolean b2 = false;
        if (b) {
            if (a == ((n6d)o).a) {
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
            s = "Argb8888";
        }
        else if (a == 1) {
            s = "Alpha8";
        }
        else if (a == 2) {
            s = "Rgb565";
        }
        else if (a == 3) {
            s = "F16";
        }
        else {
            int n2 = n;
            if (a == 4) {
                n2 = 1;
            }
            if (n2 != 0) {
                s = "Gpu";
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
