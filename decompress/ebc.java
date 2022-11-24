// 
// Decompiled by Procyon v0.6.0
// 

public final class ebc extends jpx
{
    public ebc(final tj6 tj6) {
        super(tj6);
        tj6.d.f();
        tj6.e.f();
        super.f = ((dbc)tj6).y0;
    }
    
    public final void a(final vp8 vp8) {
        final zp8 h = super.h;
        if (!h.c) {
            return;
        }
        if (h.j) {
            return;
        }
        super.h.d((int)(((zp8)h.l.get(0)).g * ((dbc)super.b).u0 + 0.5f));
    }
    
    public final void d() {
        final tj6 b = super.b;
        final dbc dbc = (dbc)b;
        final int v0 = dbc.v0;
        final int w0 = dbc.w0;
        if (dbc.y0 == 1) {
            if (v0 != -1) {
                super.h.l.add(b.V.d.h);
                super.b.V.d.h.k.add(super.h);
                super.h.f = v0;
            }
            else if (w0 != -1) {
                super.h.l.add(b.V.d.i);
                super.b.V.d.i.k.add(super.h);
                super.h.f = -w0;
            }
            else {
                final zp8 h = super.h;
                h.b = true;
                h.l.add(b.V.d.i);
                super.b.V.d.i.k.add(super.h);
            }
            this.m(super.b.d.h);
            this.m(super.b.d.i);
        }
        else {
            if (v0 != -1) {
                super.h.l.add(((jpx)b.V.e).h);
                ((jpx)super.b.V.e).h.k.add(super.h);
                super.h.f = v0;
            }
            else if (w0 != -1) {
                super.h.l.add(((jpx)b.V.e).i);
                ((jpx)super.b.V.e).i.k.add(super.h);
                super.h.f = -w0;
            }
            else {
                final zp8 h2 = super.h;
                h2.b = true;
                h2.l.add(((jpx)b.V.e).i);
                ((jpx)super.b.V.e).i.k.add(super.h);
            }
            this.m(((jpx)super.b.e).h);
            this.m(((jpx)super.b.e).i);
        }
    }
    
    public final void e() {
        final tj6 b = super.b;
        if (((dbc)b).y0 == 1) {
            b.a0 = super.h.g;
        }
        else {
            b.b0 = super.h.g;
        }
    }
    
    public final void f() {
        super.h.c();
    }
    
    public final boolean k() {
        return false;
    }
    
    public final void m(final zp8 zp8) {
        super.h.k.add(zp8);
        zp8.l.add(super.h);
    }
}
