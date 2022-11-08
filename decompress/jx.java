import java.util.Objects;
import java.util.HashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class jx
{
    public final kx a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public kx h;
    public final Map<ex, Integer> i;
    
    public jx(final kx a) {
        this.a = a;
        this.b = true;
        this.i = new HashMap();
    }
    
    public static final void a(final jx jx, final ex ex, int n, vmi vmi) {
        Objects.requireNonNull(jx);
        final float n2 = (float)n;
        long n3 = ukg.m(n2, n2);
        while (true) {
            n3 = jx.b(vmi, n3);
            final vmi k0 = vmi.K0;
            zzd.c((Object)k0);
            if (zzd.a((Object)k0, (Object)jx.a.E())) {
                break;
            }
            vmi = k0;
            if (!jx.c(k0).containsKey(ex)) {
                continue;
            }
            final float n4 = (float)jx.d(k0, ex);
            n3 = ukg.m(n4, n4);
            vmi = k0;
        }
        if (ex instanceof jqc) {
            n = q0b.p(qfj.e(n3));
        }
        else {
            n = q0b.p(qfj.d(n3));
        }
        final HashMap i = jx.i;
        int intValue = n;
        if (i.containsKey(ex)) {
            final int intValue2 = ((Number)vkg.i1((Map)jx.i, (Object)ex)).intValue();
            final jqc a = gx.a;
            zzd.f((Object)ex, "<this>");
            intValue = ((Number)ex.a.invoke((Object)intValue2, (Object)n)).intValue();
        }
        i.put(ex, intValue);
    }
    
    public abstract long b(final vmi p0, final long p1);
    
    public abstract Map<ex, Integer> c(final vmi p0);
    
    public abstract int d(final vmi p0, final ex p1);
    
    public final boolean e() {
        return this.c || this.e || this.f || this.g;
    }
    
    public final boolean f() {
        this.i();
        return this.h != null;
    }
    
    public final void g() {
        this.b = true;
        final kx i = this.a.i();
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
        this.a.z((rtb<? super kx, oyv>)new jx$a(this));
        this.i.putAll(this.c(this.a.E()));
        this.b = false;
    }
    
    public final void i() {
        kx h = null;
        Label_0141: {
            if (this.e()) {
                h = this.a;
            }
            else {
                final kx i = this.a.i();
                if (i == null) {
                    return;
                }
                h = i.d().h;
                if (h == null || !h.d().e()) {
                    final kx h2 = this.h;
                    if (h2 == null) {
                        return;
                    }
                    if (h2.d().e()) {
                        return;
                    }
                    final kx j = h2.i();
                    if (j != null) {
                        final jx d = j.d();
                        if (d != null) {
                            d.i();
                        }
                    }
                    final kx k = h2.i();
                    if (k != null) {
                        final jx d2 = k.d();
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
