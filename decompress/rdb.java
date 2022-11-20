// 
// Decompiled by Procyon v0.6.0
// 

public final class rdb
{
    public static final a Companion;
    public final int a;
    
    static {
        Companion = new a();
    }
    
    public rdb(final int a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        final int a = this.a;
        final boolean b = o instanceof rdb;
        boolean b2 = false;
        if (b) {
            if (a == ((rdb)o).a) {
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
            s = "Next";
        }
        else if (a == 2) {
            s = "Previous";
        }
        else if (a == 3) {
            s = "Left";
        }
        else if (a == 4) {
            s = "Right";
        }
        else if (a == 5) {
            s = "Up";
        }
        else if (a == 6) {
            s = "Down";
        }
        else if (a == 7) {
            s = "Enter";
        }
        else {
            int n2 = n;
            if (a == 8) {
                n2 = 1;
            }
            if (n2 != 0) {
                s = "Exit";
            }
            else {
                s = "Invalid FocusDirection";
            }
        }
        return s;
    }
    
    public static final class a
    {
    }
}
