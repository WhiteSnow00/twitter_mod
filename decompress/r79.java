import java.util.Comparator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class r79 implements Comparator
{
    public final float F0;
    
    public r79(final float f0) {
        this.F0 = f0;
    }
    
    @Override
    public final int compare(final Object o, final Object o2) {
        final float f0 = this.F0;
        final h3h$e h3h$e = (h3h$e)o;
        final h3h$e h3h$e2 = (h3h$e)o2;
        final float a = s79.a(h3h$e, f0);
        final float a2 = s79.a(h3h$e2, f0);
        int n;
        if (a < a2) {
            n = 1;
        }
        else if (a > a2) {
            n = -1;
        }
        else {
            n = 0;
        }
        return n;
    }
}
