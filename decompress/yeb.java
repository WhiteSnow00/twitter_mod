import java.util.Comparator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class yeb implements Comparator<ceb>
{
    public static final yeb D0;
    
    static {
        D0 = new yeb();
    }
    
    public final suh<vve> a(vve x) {
        final suh suh = new suh((Object[])new vve[16]);
        while (x != null) {
            suh.a(0, (Object)x);
            x = x.x();
        }
        return (suh<vve>)suh;
    }
    
    @Override
    public final int compare(final Object o, final Object o2) {
        final ceb ceb = (ceb)o;
        final ceb ceb2 = (ceb)o2;
        if (ceb == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        if (ceb2 != null) {
            final boolean a0 = jee.a0(ceb);
            final int n = 0;
            int n2 = 0;
            int h;
            if (!a0) {
                h = n;
            }
            else if (!jee.a0(ceb2)) {
                h = n;
            }
            else {
                final zmi p2 = ceb.P0;
                vve j0 = null;
                vve j2;
                if (p2 != null) {
                    j2 = p2.J0;
                }
                else {
                    j2 = null;
                }
                if (j2 == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
                final zmi p3 = ceb2.P0;
                if (p3 != null) {
                    j0 = p3.J0;
                }
                if (j0 == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
                if (!czd.a((Object)j2, (Object)j0)) {
                    final suh<vve> a2 = this.a(j2);
                    final suh<vve> a3 = this.a(j0);
                    final int min = Math.min(a2.F0 - 1, a3.F0 - 1);
                    if (min >= 0) {
                        while (czd.a(a2.D0[n2], a3.D0[n2])) {
                            if (n2 == min) {
                                throw new IllegalStateException("Could not find a common ancestor between the two FocusModifiers.".toString());
                            }
                            ++n2;
                        }
                        h = czd.h(((vve)a2.D0[n2]).W0, ((vve)a3.D0[n2]).W0);
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
