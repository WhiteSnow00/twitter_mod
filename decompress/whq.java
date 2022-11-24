import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Map;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class whq implements zqg
{
    @Override
    public final int a(final b0e b0e, final List list, final int n) {
        return go9.e((zqg)this, b0e, list, n);
    }
    
    @Override
    public final arg b(final crg crg, final List<? extends wqg> list, final long n) {
        e0e.f((Object)crg, "$this$Layout");
        e0e.f((Object)list, "measurables");
        for (final wqg wqg : list) {
            if (e0e.a(egz.m(wqg), (Object)"action")) {
                final khk w = wqg.W(n);
                final int h = vj6.h(n);
                final int f0 = w.F0;
                final float a = aiq.a;
                int n2 = h - f0 - ((rp8)crg).S(aiq.f);
                final int j = vj6.j(n);
                if (n2 < j) {
                    n2 = j;
                }
                for (final wqg wqg2 : list) {
                    if (e0e.a(egz.m(wqg2), (Object)"text")) {
                        final khk w2 = wqg2.W(vj6.a(n, 0, n2, 0, 0, 9));
                        final mqc a2 = hx.a;
                        final int i0 = ((drg)w2).i0((fx)a2);
                        final int n3 = 1;
                        final int n4 = 0;
                        if (i0 == Integer.MIN_VALUE) {
                            throw new IllegalArgumentException("No baselines for text".toString());
                        }
                        final int i2 = ((drg)w2).i0((fx)hx.b);
                        if (i2 != Integer.MIN_VALUE) {
                            int n5;
                            if (i0 == i2) {
                                n5 = n3;
                            }
                            else {
                                n5 = 0;
                            }
                            final int h2 = vj6.h(n);
                            final int f2 = w.F0;
                            int n6;
                            int max2;
                            int n8;
                            if (n5 != 0) {
                                final float a3 = aiq.a;
                                final int max = Math.max(((rp8)crg).S(aiq.h), w.G0);
                                n6 = (max - w2.G0) / 2;
                                final int i3 = ((drg)w).i0((fx)a2);
                                int n7 = n4;
                                if (i3 != Integer.MIN_VALUE) {
                                    n7 = i0 + n6 - i3;
                                }
                                max2 = max;
                                n8 = n7;
                            }
                            else {
                                final float a4 = aiq.a;
                                final int n9 = ((rp8)crg).S(aiq.a) - i0;
                                max2 = Math.max(((rp8)crg).S(aiq.i), w2.G0 + n9);
                                n8 = (max2 - w.G0) / 2;
                                n6 = n9;
                            }
                            return crg.J(vj6.h(n), max2, (Map)m3a.F0, (stb)new whq$a(w2, n6, w, h2 - f2, n8));
                        }
                        throw new IllegalArgumentException("No baselines for text".toString());
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
    
    @Override
    public final int c(final b0e b0e, final List list, final int n) {
        return go9.g((zqg)this, b0e, list, n);
    }
    
    @Override
    public final int d(final b0e b0e, final List list, final int n) {
        return go9.c((zqg)this, b0e, list, n);
    }
    
    @Override
    public final int e(final b0e b0e, final List list, final int n) {
        return go9.f((zqg)this, b0e, list, n);
    }
}
