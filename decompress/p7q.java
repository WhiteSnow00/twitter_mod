import java.util.Iterator;
import java.util.List;
import android.graphics.Bitmap;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class p7q implements uqm, qtb, pyy
{
    public static p7q C0;
    public static final p7q D0;
    public static final p7q E0;
    public static final String[] G0;
    public static final String[] H0;
    public static final String[] I0;
    public static final String[] J0;
    
    public static p7q c() {
        if (p7q.C0 == null) {
            p7q.C0 = new p7q();
        }
        return p7q.C0;
    }
    
    public static final void d(final rg3 rg3, final dis dis) {
        final long c = dis.c;
        final float n = (float)(int)(c >> 32);
        final ish b = dis.b;
        final float d = b.d;
        final int n2 = 0;
        final boolean b2 = n < d || (b.c || iud.b(c) < dis.b.e);
        int n3 = n2;
        if (b2) {
            final int f = dis.a.f;
            Objects.requireNonNull(jis.Companion);
            final boolean b3 = f == 3;
            n3 = n2;
            if (!b3) {
                n3 = 1;
            }
        }
        if (n3 != 0) {
            final long c2 = dis.c;
            final float n4 = (float)(int)(c2 >> 32);
            final float n5 = (float)iud.b(c2);
            Objects.requireNonNull(qfj.Companion);
            final n5m a = m8y.a(qfj.b, x3j.f(n4, n5));
            rg3.p();
            Objects.requireNonNull(gi4.Companion);
            rg3.g(a, 1);
        }
        try {
            final oq2 c3 = dis.a.b.c();
            if (c3 != null) {
                final ish b4 = dis.b;
                final float b5 = dis.a.b.b();
                final ozq a2 = dis.a.b.a;
                b4.b(rg3, c3, b5, a2.n, a2.m);
            }
            else {
                final ish b6 = dis.b;
                final long d2 = dis.a.b.d();
                final ozq a3 = dis.a.b.a;
                b6.c(rg3, d2, a3.n, a3.m);
            }
        }
        finally {
            if (n3 != 0) {
                rg3.c();
            }
        }
    }
    
    public static String f(final String s) {
        return wvz.q(s, p7q.I0, p7q.G0);
    }
    
    public static String g(final String s) {
        return wvz.q(s, p7q.G0, p7q.I0);
    }
    
    public Object a() {
        final azy c = fzy.c;
        return (int)fsz.D0.b().v();
    }
    
    public Object apply(final Object o) {
        final n9q n9q = (n9q)o;
        zzd.g((Object)n9q, "it");
        return n9q;
    }
    
    public void b(final Object o) {
        ((Bitmap)o).recycle();
    }
    
    public snj e(final List list, final ezz ezz) {
        if (list.isEmpty()) {
            final snj b = snj.b;
            final int a = w4j.a;
            return b;
        }
        final Object d0 = ezz.D0;
        n89 i0;
        if (d0 != n89.E0) {
            i0 = (n89)d0;
        }
        else {
            i0 = n89.I0;
        }
        final float n = i0.D0 * 1024.0f * 4.0f;
        final List e = i2h.e;
        final i2h i2h = null;
        final Iterator iterator = list.iterator();
        i2h i2h2 = i2h;
        while (iterator.hasNext()) {
            final i2h i2h3 = (i2h)iterator.next();
            int n2 = 0;
            boolean b2 = false;
            Label_0161: {
                if (i2h3 != null) {
                    final String c = i2h3.c;
                    if (c != null && !c.isEmpty()) {
                        if (i2h.e.contains(i2h3.c)) {
                            b2 = e1.i().b(i2h3.d);
                            break Label_0161;
                        }
                    }
                }
                b2 = false;
            }
            if (b2) {
                Label_0294: {
                    Label_0174: {
                        if (i2h2 != null) {
                            if (i2h3 != null) {
                                final int index = e.indexOf(i2h2.c);
                                final int index2 = e.indexOf(i2h3.c);
                                if (index == index2) {
                                    final int a2 = i2h2.a;
                                    final int a3 = i2h3.a;
                                    if (a2 == a3) {
                                        break Label_0294;
                                    }
                                    if ((a2 > n || a3 > n) ? (a2 >= a3) : (a2 <= a3)) {
                                        break Label_0174;
                                    }
                                }
                                else if (index >= index2) {
                                    break Label_0174;
                                }
                            }
                            n2 = 1;
                            break Label_0294;
                        }
                        if (i2h3 == null) {
                            break Label_0294;
                        }
                    }
                    n2 = -1;
                }
                if (n2 >= 0) {
                    continue;
                }
                i2h2 = i2h3;
            }
        }
        snj b3;
        if (i2h2 == null) {
            b3 = snj.b;
            final int a4 = w4j.a;
        }
        else {
            b3 = new snj((Object)i2h2.b);
        }
        return b3;
    }
}
