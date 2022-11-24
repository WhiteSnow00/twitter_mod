import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class tni implements Comparable<tni>
{
    public static final a Companion;
    public static int J0 = 1;
    public final swe F0;
    public final swe G0;
    public final p6m H0;
    public final cwe I0;
    
    static {
        Companion = new a();
    }
    
    public tni(final swe f0, final swe g0) {
        e0e.f((Object)f0, "subtreeRoot");
        this.F0 = f0;
        this.G0 = g0;
        this.I0 = f0.V0;
        final nrd b = f0.g1.b;
        final qni h = zzz.H(g0);
        p6m w;
        if (((qni)b).j() && h.j()) {
            w = ((qni)b).w((bwe)h, true);
        }
        else {
            w = null;
        }
        this.H0 = w;
    }
    
    public final int b(final tni tni) {
        e0e.f((Object)tni, "other");
        final p6m h0 = this.H0;
        final int n = 1;
        final int n2 = 1;
        final int n3 = 1;
        if (h0 == null) {
            return 1;
        }
        final p6m h2 = tni.H0;
        if (h2 == null) {
            return -1;
        }
        if (tni.J0 == 1) {
            if (h0.d - h2.b <= 0.0f) {
                return -1;
            }
            if (h0.b - h2.d >= 0.0f) {
                return 1;
            }
        }
        final cwe i0 = this.I0;
        final cwe f0 = cwe.F0;
        final int n4 = 0;
        if (i0 == f0) {
            final float n5 = fcmpg(h0.a - h2.a, 0.0f);
            if (n5 != 0) {
                int n6 = n3;
                if (n5 < 0) {
                    n6 = -1;
                }
                return n6;
            }
        }
        else {
            final float n7 = fcmpg(h0.c - h2.c, 0.0f);
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
        final float n9 = fcmpg(h0.b - h2.b, 0.0f);
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
        final p6m d = w9y.d((bwe)zzz.H(this.G0));
        final p6m d2 = w9y.d((bwe)zzz.H(tni.G0));
        final swe j = zzz.I(this.G0, (stb)new tni$b(d));
        final swe k = zzz.I(tni.G0, (stb)new tni$c(d2));
        if (j != null && k != null) {
            return new tni(this.F0, j).b(new tni(tni.F0, k));
        }
        if (j != null) {
            return 1;
        }
        if (k != null) {
            return -1;
        }
        Objects.requireNonNull(swe.Companion);
        final int compare = swe.u1.compare((Object)this.G0, (Object)tni.G0);
        if (compare != 0) {
            return -compare;
        }
        return this.G0.G0 - tni.G0.G0;
    }
    
    @Override
    public final /* bridge */ int compareTo(final Object o) {
        return this.b((tni)o);
    }
    
    public static final class a
    {
    }
}
