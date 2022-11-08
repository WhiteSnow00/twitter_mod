// 
// Decompiled by Procyon v0.6.0
// 

public final class e3e
{
    public final boolean a = a;
    
    public static String a(final boolean b) {
        return mb0.x("IsQualityFilterEnabled(b=", b, ")");
    }
    
    @Override
    public final boolean equals(final Object o) {
        final boolean a = this.a;
        final boolean b = o instanceof e3e;
        boolean b2 = false;
        if (b) {
            if (a == ((e3e)o).a) {
                b2 = true;
            }
        }
        return b2;
    }
    
    @Override
    public final int hashCode() {
        int a;
        if ((a = (this.a ? 1 : 0)) != 0) {
            a = 1;
        }
        return a;
    }
    
    @Override
    public final String toString() {
        return a(this.a);
    }
}
