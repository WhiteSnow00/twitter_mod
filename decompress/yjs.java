// 
// Decompiled by Procyon v0.6.0
// 

public final class yjs
{
    public static final a Companion;
    public final long a;
    
    static {
        Companion = new a();
    }
    
    public yjs(final long a) {
        this.a = a;
    }
    
    public static final boolean a(final long n, final long n2) {
        return n == n2;
    }
    
    public static String b(final long n) {
        String s;
        if (a(n, 0L)) {
            s = "Unspecified";
        }
        else if (a(n, 4294967296L)) {
            s = "Sp";
        }
        else if (a(n, 8589934592L)) {
            s = "Em";
        }
        else {
            s = "Invalid";
        }
        return s;
    }
    
    @Override
    public final boolean equals(final Object o) {
        final long a = this.a;
        final boolean b = o instanceof yjs;
        boolean b2 = false;
        if (b) {
            if (a == ((yjs)o).a) {
                b2 = true;
            }
        }
        return b2;
    }
    
    @Override
    public final int hashCode() {
        final long a = this.a;
        return (int)(a ^ a >>> 32);
    }
    
    @Override
    public final String toString() {
        return b(this.a);
    }
    
    public static final class a
    {
    }
}
