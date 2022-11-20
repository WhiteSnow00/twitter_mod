import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cni implements Comparable<cni>
{
    public static final a Companion;
    public static int H0 = 1;
    public final vve D0;
    public final vve E0;
    public final c6m F0;
    public final fve G0;
    
    static {
        Companion = new a();
    }
    
    public cni(final vve d0, final vve e0) {
        czd.f((Object)d0, "subtreeRoot");
        this.D0 = d0;
        this.E0 = e0;
        this.G0 = d0.T0;
        final lqd b = d0.e1.b;
        final zmi s0 = nza.S0(e0);
        c6m w;
        if (((zmi)b).j() && s0.j()) {
            w = ((zmi)b).w((eve)s0, true);
        }
        else {
            w = null;
        }
        this.F0 = w;
    }
    
    public final int b(final cni cni) {
        czd.f((Object)cni, "other");
        final c6m f0 = this.F0;
        final int n = 1;
        final int n2 = 1;
        final int n3 = 1;
        if (f0 == null) {
            return 1;
        }
        final c6m f2 = cni.F0;
        if (f2 == null) {
            return -1;
        }
        if (cni.H0 == 1) {
            if (f0.d - f2.b <= 0.0f) {
                return -1;
            }
            if (f0.b - f2.d >= 0.0f) {
                return 1;
            }
        }
        final fve g0 = this.G0;
        final fve d0 = fve.D0;
        final int n4 = 0;
        if (g0 == d0) {
            final float n5 = fcmpg(f0.a - f2.a, 0.0f);
            if (n5 != 0) {
                int n6 = n3;
                if (n5 < 0) {
                    n6 = -1;
                }
                return n6;
            }
        }
        else {
            final float n7 = fcmpg(f0.c - f2.c, 0.0f);
            if (n7 != 0) {
                int n8;
                if (n7 < 0) {
                    n8 = n;
                }
                else {
                    n8 = -1;
                }
                return n8;
            }
        }
        final float n9 = fcmpg(f0.b - f2.b, 0.0f);
        int n10 = n4;
        if (n9 == 0) {
            n10 = 1;
        }
        if (n10 == 0) {
            int n11 = n2;
            if (n9 < 0) {
                n11 = -1;
            }
            return n11;
        }
        final c6m g2 = af8.g((eve)nza.S0(this.E0));
        final c6m g3 = af8.g((eve)nza.S0(cni.E0));
        final vve t0 = nza.T0(this.E0, (qsb)new qsb<vve, Boolean>(g2) {
            public final c6m D0;
            
            public final Object invoke(final Object o) {
                final vve vve = (vve)o;
                czd.f((Object)vve, "it");
                final zmi s0 = nza.S0(vve);
                return s0.j() && !czd.a((Object)this.D0, (Object)af8.g((eve)s0));
            }
        });
        final vve t2 = nza.T0(cni.E0, (qsb)new qsb<vve, Boolean>(g3) {
            public final c6m D0;
            
            public final Object invoke(final Object o) {
                final vve vve = (vve)o;
                czd.f((Object)vve, "it");
                final zmi s0 = nza.S0(vve);
                return s0.j() && !czd.a((Object)this.D0, (Object)af8.g((eve)s0));
            }
        });
        if (t0 != null && t2 != null) {
            return new cni(this.D0, t0).b(new cni(cni.D0, t2));
        }
        if (t0 != null) {
            return 1;
        }
        if (t2 != null) {
            return -1;
        }
        Objects.requireNonNull(vve.Companion);
        final int compare = vve.s1.compare((Object)this.E0, (Object)cni.E0);
        if (compare != 0) {
            return -compare;
        }
        return this.E0.E0 - cni.E0.E0;
    }
    
    @Override
    public final /* bridge */ int compareTo(final Object o) {
        return this.b((cni)o);
    }
    
    public static final class a
    {
    }
}
