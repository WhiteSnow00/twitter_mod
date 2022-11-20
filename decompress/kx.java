import java.util.Objects;
import java.util.HashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class kx
{
    public final lx a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public lx h;
    public final Map<fx, Integer> i;
    
    public kx(final lx a) {
        this.a = a;
        this.b = true;
        this.i = new HashMap();
    }
    
    public static final void a(final kx kx, final fx fx, int n, zmi zmi) {
        Objects.requireNonNull(kx);
        final float n2 = (float)n;
        long n3 = wj1.a(n2, n2);
        while (true) {
            n3 = kx.b(zmi, n3);
            final zmi l0 = zmi.L0;
            czd.c((Object)l0);
            if (czd.a((Object)l0, (Object)kx.a.E())) {
                break;
            }
            zmi = l0;
            if (!kx.c(l0).containsKey(fx)) {
                continue;
            }
            final float n4 = (float)kx.d(l0, fx);
            n3 = wj1.a(n4, n4);
            zmi = l0;
        }
        if (fx instanceof mpc) {
            n = zyz.n(wfj.e(n3));
        }
        else {
            n = zyz.n(wfj.d(n3));
        }
        final HashMap i = kx.i;
        int intValue = n;
        if (i.containsKey(fx)) {
            final int intValue2 = ((Number)tkg.l0((Map)kx.i, (Object)fx)).intValue();
            final mpc a = hx.a;
            czd.f((Object)fx, "<this>");
            intValue = ((Number)fx.a.invoke((Object)intValue2, (Object)n)).intValue();
        }
        i.put(fx, intValue);
    }
    
    public abstract long b(final zmi p0, final long p1);
    
    public abstract Map<fx, Integer> c(final zmi p0);
    
    public abstract int d(final zmi p0, final fx p1);
    
    public final boolean e() {
        return this.c || this.e || this.f || this.g;
    }
    
    public final boolean f() {
        this.i();
        return this.h != null;
    }
    
    public final void g() {
        this.b = true;
        final lx i = this.a.i();
        if (i == null) {
            return;
        }
        if (this.c) {
            i.q0();
        }
        else if (this.e || this.d) {
            i.requestLayout();
        }
        if (this.f) {
            this.a.q0();
        }
        if (this.g) {
            i.requestLayout();
        }
        i.d().g();
    }
    
    public final void h() {
        this.i.clear();
        this.a.z((qsb<? super lx, fzv>)new kx$a(this));
        this.i.putAll(this.c(this.a.E()));
        this.b = false;
    }
    
    public final void i() {
        lx h = null;
        Label_0141: {
            if (this.e()) {
                h = this.a;
            }
            else {
                final lx i = this.a.i();
                if (i == null) {
                    return;
                }
                h = i.d().h;
                if (h == null || !h.d().e()) {
                    final lx h2 = this.h;
                    if (h2 == null) {
                        return;
                    }
                    if (h2.d().e()) {
                        return;
                    }
                    final lx j = h2.i();
                    if (j != null) {
                        final kx d = j.d();
                        if (d != null) {
                            d.i();
                        }
                    }
                    final lx k = h2.i();
                    if (k != null) {
                        final kx d2 = k.d();
                        if (d2 != null) {
                            h = d2.h;
                            break Label_0141;
                        }
                    }
                    h = null;
                }
            }
        }
        this.h = h;
    }
}
