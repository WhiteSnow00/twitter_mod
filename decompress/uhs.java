import java.util.Objects;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class uhs extends lq1<uhs>
{
    public final sis h;
    public final rjs i;
    
    public uhs(final sis h, final ngj ngj, final rjs i, final yjs yjs) {
        e0e.f((Object)h, "currentValue");
        e0e.f((Object)ngj, "offsetMapping");
        e0e.f((Object)yjs, "state");
        final xc0 a = h.a;
        final long b = h.b;
        qjs a2;
        if (i != null) {
            a2 = i.a;
        }
        else {
            a2 = null;
        }
        super(a, b, a2, ngj, yjs);
        this.h = h;
        this.i = i;
    }
    
    public final List<sr9> D(final stb<? super uhs, ? extends sr9> stb) {
        e0e.f((Object)stb, "or");
        List list;
        if (zjs.c(super.f)) {
            final sr9 sr9 = (sr9)stb.invoke((Object)this);
            if (sr9 != null) {
                list = shw.x0((Object)sr9);
            }
            else {
                list = null;
            }
        }
        else {
            list = shw.y0((Object[])new sr9[] { (sr9)new tx4("", 0), (sr9)new gop(zjs.g(super.f), zjs.g(super.f)) });
        }
        return list;
    }
    
    public final int E(final rjs rjs, final int n) {
        final bwe b = rjs.b;
        p6m e = null;
        Label_0058: {
            if (b != null) {
                final bwe c = rjs.c;
                p6m w = null;
                if (c != null) {
                    w = c.w(b, true);
                }
                if ((e = w) != null) {
                    break Label_0058;
                }
            }
            Objects.requireNonNull(p6m.Companion);
            e = p6m.e;
        }
        final p6m c2 = rjs.a.c(super.d.b(zjs.d(this.h.b)));
        return super.d.a(rjs.a.l(kqe.e(c2.a, aeq.b(e.c()) * n + c2.b)));
    }
    
    public final uhs F() {
        if (super.g.F0.length() > 0) {
            final rjs i = this.i;
            if (i != null) {
                this.B(this.E(i, 1));
            }
        }
        return this;
    }
    
    public final uhs G() {
        if (super.g.F0.length() > 0) {
            final rjs i = this.i;
            if (i != null) {
                this.B(this.E(i, -1));
            }
        }
        return this;
    }
}
