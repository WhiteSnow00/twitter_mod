// 
// Decompiled by Procyon v0.6.0
// 

public final class jfs
{
    public static final jfs.jfs$a Companion;
    public final int a;
    
    static {
        Companion = new jfs.jfs$a();
    }
    
    public jfs(final int a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        final int a = this.a;
        final boolean b = o instanceof jfs;
        boolean b2 = false;
        if (b) {
            if (a == ((jfs)o).a) {
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
        if (a == 1) {
            s = "Ltr";
        }
        else if (a == 2) {
            s = "Rtl";
        }
        else if (a == 3) {
            s = "Content";
        }
        else if (a == 4) {
            s = "ContentOrLtr";
        }
        else {
            int n2 = n;
            if (a == 5) {
                n2 = 1;
            }
            if (n2 != 0) {
                s = "ContentOrRtl";
            }
            else {
                s = "Invalid";
            }
        }
        return s;
    }
}
