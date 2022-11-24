import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class z4p implements jci
{
    public final l9r<k5p> F0;
    public final boolean G0;
    
    public z4p(final l9r<k5p> f0, final boolean g0) {
        this.F0 = f0;
        this.G0 = g0;
    }
    
    @Override
    public final Object a(final long n, final mp6 mp6) {
        return j98.d();
    }
    
    @Override
    public final long b(long n, final long n2, final int n3) {
        if (this.G0) {
            final k5p k5p = (k5p)this.F0.getValue();
            if (k5p.d.a()) {
                Objects.requireNonNull(kgj.Companion);
                n = kgj.b;
            }
            else {
                n = k5p.h(k5p.e(k5p.d.b(k5p.e(k5p.g(n2)))));
            }
        }
        else {
            Objects.requireNonNull(kgj.Companion);
            n = kgj.b;
        }
        return n;
    }
    
    @Override
    public final Object c(long n, long g0, final mp6<? super crw> mp6) {
        Object o = null;
        Label_0059: {
            if (mp6 instanceof z4p$a) {
                final z4p$a z4p$a = (z4p$a)mp6;
                final int j0 = z4p$a.J0;
                if ((j0 & Integer.MIN_VALUE) != 0x0) {
                    z4p$a.J0 = j0 + Integer.MIN_VALUE;
                    o = z4p$a;
                    break Label_0059;
                }
            }
            o = new z4p$a(this, (mp6)mp6);
        }
        Object o2 = ((z4p$a)o).H0;
        final jz6 f0 = jz6.F0;
        final int j2 = ((z4p$a)o).J0;
        z4p f2 = null;
        Label_0217: {
            if (j2 != 0) {
                if (j2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                g0 = ((z4p$a)o).G0;
                f2 = ((z4p$a)o).F0;
                jb2.M0(o2);
            }
            else {
                jb2.M0(o2);
                if (!this.G0) {
                    Objects.requireNonNull(crw.Companion);
                    n = crw.b;
                    f2 = this;
                    break Label_0217;
                }
                final k5p k5p = (k5p)this.F0.getValue();
                ((z4p$a)o).F0 = this;
                ((z4p$a)o).G0 = g0;
                ((z4p$a)o).J0 = 1;
                o2 = k5p.b(g0, (mp6)o);
                if (o2 == f0) {
                    return f0;
                }
                f2 = this;
            }
            n = crw.d(g0, ((crw)o2).a);
        }
        final crw crw = new crw(n);
        ((k5p)f2.F0.getValue()).d(false);
        return crw;
    }
    
    @Override
    public final long f(final long n, int n2) {
        Objects.requireNonNull(pci.Companion);
        if (n2 == 2) {
            n2 = 1;
        }
        else {
            n2 = 0;
        }
        if (n2 != 0) {
            ((k5p)this.F0.getValue()).d(true);
        }
        Objects.requireNonNull(kgj.Companion);
        return kgj.b;
    }
}
