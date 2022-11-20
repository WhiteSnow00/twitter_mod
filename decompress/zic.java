import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zic extends sox
{
    public zic(final ni6 ni6) {
        super(ni6);
    }
    
    public final void a(final po8 po8) {
        final ni1 ni1 = (ni1)super.b;
        final int w0 = ni1.w0;
        final Iterator iterator = super.h.l.iterator();
        int n = 0;
        int n2 = -1;
        while (iterator.hasNext()) {
            final int g = ((to8)iterator.next()).g;
            int n3;
            if (n2 == -1 || g < (n3 = n2)) {
                n3 = g;
            }
            n2 = n3;
            if (n < g) {
                n = g;
                n2 = n3;
            }
        }
        if (w0 != 0 && w0 != 2) {
            super.h.d(n + ni1.y0);
        }
        else {
            super.h.d(n2 + ni1.y0);
        }
    }
    
    public final void d() {
        final ni6 b = super.b;
        if (b instanceof ni1) {
            final to8 h = super.h;
            h.b = true;
            final ni1 ni1 = (ni1)b;
            final int w0 = ni1.w0;
            final boolean x0 = ni1.x0;
            int i = 0;
            final int n = 0;
            final int n2 = 0;
            final int n3 = 0;
            if (w0 != 0) {
                if (w0 != 1) {
                    if (w0 != 2) {
                        if (w0 == 3) {
                            h.e = 7;
                            for (int j = n3; j < ni1.v0; ++j) {
                                final ni6 ni2 = ni1.u0[j];
                                if (x0 || ni2.i0 != 8) {
                                    final to8 k = ni2.e.i;
                                    k.k.add(super.h);
                                    super.h.l.add(k);
                                }
                            }
                            this.m(super.b.e.h);
                            this.m(super.b.e.i);
                        }
                    }
                    else {
                        h.e = 6;
                        while (i < ni1.v0) {
                            final ni6 ni3 = ni1.u0[i];
                            if (x0 || ni3.i0 != 8) {
                                final to8 h2 = ni3.e.h;
                                h2.k.add(super.h);
                                super.h.l.add(h2);
                            }
                            ++i;
                        }
                        this.m(super.b.e.h);
                        this.m(super.b.e.i);
                    }
                }
                else {
                    h.e = 5;
                    for (int l = n; l < ni1.v0; ++l) {
                        final ni6 ni4 = ni1.u0[l];
                        if (x0 || ni4.i0 != 8) {
                            final to8 m = ((sox)ni4.d).i;
                            m.k.add(super.h);
                            super.h.l.add(m);
                        }
                    }
                    this.m(((sox)super.b.d).h);
                    this.m(((sox)super.b.d).i);
                }
            }
            else {
                h.e = 4;
                for (int n4 = n2; n4 < ni1.v0; ++n4) {
                    final ni6 ni5 = ni1.u0[n4];
                    if (x0 || ni5.i0 != 8) {
                        final to8 h3 = ((sox)ni5.d).h;
                        h3.k.add(super.h);
                        super.h.l.add(h3);
                    }
                }
                this.m(((sox)super.b.d).h);
                this.m(((sox)super.b.d).i);
            }
        }
    }
    
    public final void e() {
        final ni6 b = super.b;
        if (b instanceof ni1) {
            final int w0 = ((ni1)b).w0;
            if (w0 != 0 && w0 != 1) {
                b.b0 = super.h.g;
            }
            else {
                b.a0 = super.h.g;
            }
        }
    }
    
    public final void f() {
        super.c = null;
        super.h.c();
    }
    
    public final boolean k() {
        return false;
    }
    
    public final void m(final to8 to8) {
        super.h.k.add(to8);
        to8.l.add(super.h);
    }
}
