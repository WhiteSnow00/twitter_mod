import java.util.Objects;
import android.graphics.Typeface;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class x30 implements aik
{
    public final Context a;
    
    public x30(final Context context) {
        this.a = context.getApplicationContext();
    }
    
    public final Object a(final jkb g0, final mp6<? super Typeface> mp6) {
        Object o = null;
        Label_0051: {
            if (mp6 instanceof x30$a) {
                final x30$a x30$a = (x30$a)mp6;
                final int j0 = x30$a.J0;
                if ((j0 & Integer.MIN_VALUE) != 0x0) {
                    x30$a.J0 = j0 + Integer.MIN_VALUE;
                    o = x30$a;
                    break Label_0051;
                }
            }
            o = new x30$a(this, (mp6)mp6);
        }
        Object o2 = ((x30$a)o).H0;
        final jz6 f0 = jz6.F0;
        final int j2 = ((x30$a)o).J0;
        x30 f2;
        jkb jkb;
        if (j2 != 0) {
            if (j2 == 1) {
                jb2.M0(o2);
                return o2;
            }
            if (j2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            final jkb g2 = ((x30$a)o).G0;
            f2 = ((x30$a)o).F0;
            jb2.M0(o2);
            jkb = g2;
        }
        else {
            jb2.M0(o2);
            if (g0 instanceof w30) {
                Objects.requireNonNull((w30)g0);
                e0e.e((Object)this.a, "context");
                ((x30$a)o).J0 = 1;
                throw null;
            }
            if (!(g0 instanceof rrm)) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Unknown font type: ");
                sb.append(g0);
                throw new IllegalArgumentException(sb.toString());
            }
            final rrm rrm = (rrm)g0;
            final Context a = this.a;
            e0e.e((Object)a, "context");
            ((x30$a)o).F0 = this;
            ((x30$a)o).G0 = g0;
            ((x30$a)o).J0 = 2;
            o2 = ma7.T((yy6)j29.c, (hub)new y30(rrm, a, (mp6)null), (mp6)o);
            if (o2 == f0) {
                return f0;
            }
            jkb = g0;
            f2 = this;
        }
        final Typeface typeface = (Typeface)o2;
        final plb d = ((rrm)jkb).d;
        final Context a2 = f2.a;
        e0e.e((Object)a2, "context");
        return kqe.p0(typeface, d, a2);
    }
    
    public final void b() {
    }
    
    public final Object c(final jkb jkb) {
        final boolean b = jkb instanceof w30;
        Object p = null;
        final Typeface typeface = null;
        if (!b) {
            if (jkb instanceof rrm) {
                final int a = jkb.a();
                Objects.requireNonNull(ykb.Companion);
                final int n = 0;
                Typeface h;
                if (a == 0) {
                    final rrm rrm = (rrm)jkb;
                    final Context a2 = this.a;
                    e0e.e((Object)a2, "context");
                    h = xi4.h(rrm, a2);
                }
                else if (a == 1) {
                    Object m = null;
                    try {
                        final rrm rrm2 = (rrm)jkb;
                        final Context a3 = this.a;
                        e0e.e((Object)a3, "context");
                        xi4.h(rrm2, a3);
                    }
                    finally {
                        final Throwable t;
                        m = jb2.M(t);
                    }
                    if (m instanceof ctm$b) {
                        m = typeface;
                    }
                    h = (Typeface)m;
                }
                else {
                    int n2 = n;
                    if (a == 2) {
                        n2 = 1;
                    }
                    if (n2 != 0) {
                        throw new UnsupportedOperationException("Unsupported Async font load path");
                    }
                    final StringBuilder f = ehk.f("Unknown loading type ");
                    f.append((Object)ykb.a(jkb.a()));
                    throw new IllegalArgumentException(f.toString());
                }
                final plb d = ((rrm)jkb).d;
                final Context a4 = this.a;
                e0e.e((Object)a4, "context");
                p = kqe.p0(h, d, a4);
            }
            return p;
        }
        final w30 w30 = (w30)jkb;
        e0e.e((Object)this.a, "context");
        throw null;
    }
}
