import java.util.Comparator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zfb implements Comparator<dfb>
{
    public static final zfb F0;
    
    static {
        F0 = new zfb();
    }
    
    public final ivh<swe> a(swe x) {
        final ivh ivh = new ivh((Object[])new swe[16]);
        while (x != null) {
            ivh.a(0, (Object)x);
            x = x.x();
        }
        return (ivh<swe>)ivh;
    }
    
    @Override
    public final int compare(final Object o, final Object o2) {
        final dfb dfb = (dfb)o;
        final dfb dfb2 = (dfb)o2;
        if (dfb == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        if (dfb2 != null) {
            final boolean i = jty.I(dfb);
            final int n = 0;
            int n2 = 0;
            int h;
            if (!i) {
                h = n;
            }
            else if (!jty.I(dfb2)) {
                h = n;
            }
            else {
                final qni r0 = dfb.R0;
                swe l0 = null;
                swe l2;
                if (r0 != null) {
                    l2 = r0.L0;
                }
                else {
                    l2 = null;
                }
                if (l2 == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
                final qni r2 = dfb2.R0;
                if (r2 != null) {
                    l0 = r2.L0;
                }
                if (l0 == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
                if (!e0e.a((Object)l2, (Object)l0)) {
                    final ivh<swe> a = this.a(l2);
                    final ivh<swe> a2 = this.a(l0);
                    final int min = Math.min(a.H0 - 1, a2.H0 - 1);
                    if (min >= 0) {
                        while (e0e.a(a.F0[n2], a2.F0[n2])) {
                            if (n2 == min) {
                                throw new IllegalStateException("Could not find a common ancestor between the two FocusModifiers.".toString());
                            }
                            ++n2;
                        }
                        h = e0e.h(((swe)a.F0[n2]).Y0, ((swe)a2.F0[n2]).Y0);
                        return h;
                    }
                    throw new IllegalStateException("Could not find a common ancestor between the two FocusModifiers.".toString());
                }
                h = n;
            }
            return h;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
