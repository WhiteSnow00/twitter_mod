// 
// Decompiled by Procyon v0.6.0
// 

public final class s99 implements Comparable<s99>
{
    public static final a Companion;
    public final float F0;
    
    static {
        Companion = new a();
    }
    
    public s99(final float f0) {
        this.F0 = f0;
    }
    
    public static final boolean b(final float n, final float n2) {
        return e0e.a((Object)n, (Object)n2);
    }
    
    public static String e(final float n) {
        String string;
        if (Float.isNaN(n)) {
            string = "Dp.Unspecified";
        }
        else {
            final StringBuilder sb = new StringBuilder();
            sb.append(n);
            sb.append(".dp");
            string = sb.toString();
        }
        return string;
    }
    
    @Override
    public final int compareTo(final Object o) {
        return Float.compare(this.F0, ((s99)o).F0);
    }
    
    @Override
    public final boolean equals(final Object o) {
        final float f0 = this.F0;
        final boolean b = o instanceof s99;
        boolean b2 = false;
        if (b) {
            if (e0e.a((Object)f0, (Object)((s99)o).F0)) {
                b2 = true;
            }
        }
        return b2;
    }
    
    @Override
    public final int hashCode() {
        return Float.floatToIntBits(this.F0);
    }
    
    @Override
    public final String toString() {
        return e(this.F0);
    }
    
    public static final class a
    {
    }
}
