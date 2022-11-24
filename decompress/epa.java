// 
// Decompiled by Procyon v0.6.0
// 

public final class epa extends g5j$a
{
    public static g5j<epa> d;
    public float b;
    public float c;
    
    static {
        (epa.d = (g5j<epa>)g5j.a(256, (g5j$a)new epa(0.0f, 0.0f))).f = 0.5f;
    }
    
    public epa() {
    }
    
    public epa(final float n, final float n2) {
        this.b = 0.0f;
        this.c = 0.0f;
    }
    
    public static epa b(final float b, final float c) {
        final epa epa = (epa)epa.d.b();
        epa.b = b;
        epa.c = c;
        return epa;
    }
    
    public static void c(final epa epa) {
        epa.d.c((g5j$a)epa);
    }
    
    public final g5j$a a() {
        return new epa(0.0f, 0.0f);
    }
    
    public final boolean equals(final Object o) {
        final boolean b = false;
        if (o == null) {
            return false;
        }
        if (this == o) {
            return true;
        }
        boolean b2 = b;
        if (o instanceof epa) {
            final epa epa = (epa)o;
            b2 = b;
            if (this.b == epa.b) {
                b2 = b;
                if (this.c == epa.c) {
                    b2 = true;
                }
            }
        }
        return b2;
    }
    
    public final int hashCode() {
        return Float.floatToIntBits(this.b) ^ Float.floatToIntBits(this.c);
    }
    
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.b);
        sb.append("x");
        sb.append(this.c);
        return sb.toString();
    }
}
