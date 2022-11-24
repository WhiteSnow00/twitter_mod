// 
// Decompiled by Procyon v0.6.0
// 

public class ltm
{
    public final float a;
    public final float b;
    
    public ltm(final float a, final float b) {
        this.a = a;
        this.b = b;
    }
    
    public static float a(final ltm ltm, final ltm ltm2) {
        final float a = ltm.a;
        final float b = ltm.b;
        final float a2 = ltm2.a;
        final float b2 = ltm2.b;
        final float n = a - a2;
        final float n2 = b - b2;
        return (float)Math.sqrt(n2 * n2 + n * n);
    }
    
    @Override
    public final boolean equals(final Object o) {
        final boolean b = o instanceof ltm;
        boolean b3;
        final boolean b2 = b3 = false;
        if (b) {
            final ltm ltm = (ltm)o;
            b3 = b2;
            if (this.a == ltm.a) {
                b3 = b2;
                if (this.b == ltm.b) {
                    b3 = true;
                }
            }
        }
        return b3;
    }
    
    @Override
    public final int hashCode() {
        return Float.floatToIntBits(this.b) + Float.floatToIntBits(this.a) * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder(25);
        sb.append('(');
        sb.append(this.a);
        sb.append(',');
        return dn.C(sb, this.b, ')');
    }
}
