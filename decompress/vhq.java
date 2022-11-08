// 
// Decompiled by Procyon v0.6.0
// 

public final class vhq
{
    public static final Object a;
    
    static {
        a = new Object();
    }
    
    public static final Void a() {
        throw new IllegalStateException("Cannot modify a state list through an iterator".toString());
    }
    
    public static final void b(final int n, final int n2) {
        int n3 = 0;
        if (n >= 0) {
            n3 = n3;
            if (n < n2) {
                n3 = 1;
            }
        }
        if (n3 != 0) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("index (");
        sb.append(n);
        sb.append(") is out of bound of [0, ");
        sb.append(n2);
        sb.append(')');
        throw new IndexOutOfBoundsException(sb.toString());
    }
}
