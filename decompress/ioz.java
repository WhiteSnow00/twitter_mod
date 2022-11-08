import java.io.IOException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ioz implements apz
{
    public final xnz a;
    public final kqz b;
    public final boolean c;
    public final miz d;
    
    public ioz(final kqz b, final miz d, final xnz a) {
        this.b = b;
        this.c = d.c(a);
        this.d = d;
        this.a = a;
    }
    
    @Override
    public final Object f() {
        return ((mjz)this.a.a()).k();
    }
    
    @Override
    public final int g(final Object o) {
        final kqz b = this.b;
        final int b2 = b.b(b.c(o));
        if (!this.c) {
            return b2;
        }
        this.d.a(o);
        throw null;
    }
    
    @Override
    public final void h(final Object o) {
        this.b.g(o);
        this.d.b(o);
    }
    
    @Override
    public final void i(final Object o, final srz srz) throws IOException {
        this.d.a(o);
        throw null;
    }
    
    @Override
    public final int j(final Object o) {
        final int hashCode = this.b.c(o).hashCode();
        if (!this.c) {
            return hashCode;
        }
        this.d.a(o);
        throw null;
    }
    
    @Override
    public final void k(final Object o, final byte[] array, final int n, final int n2, final lfz lfz) throws IOException {
        final okz okz = (okz)o;
        if (okz.zzc == lqz.f) {
            okz.zzc = lqz.b();
        }
        final pjz pjz = (pjz)o;
        throw null;
    }
    
    @Override
    public final void l(final Object o, final Object o2) {
        final kqz b = this.b;
        final Class a = dpz.a;
        b.h(o, b.d(b.c(o), b.c(o2)));
        if (!this.c) {
            return;
        }
        this.d.a(o2);
        throw null;
    }
    
    @Override
    public final boolean m(final Object o, final Object o2) {
        if (!this.b.c(o).equals(this.b.c(o2))) {
            return false;
        }
        if (!this.c) {
            return true;
        }
        this.d.a(o);
        this.d.a(o2);
        throw null;
    }
    
    @Override
    public final boolean n(final Object o) {
        this.d.a(o);
        throw null;
    }
}
