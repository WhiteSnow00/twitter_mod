import java.util.Set;
import java.util.Iterator;
import java.util.Objects;
import java.util.HashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class lx
{
    public final mx a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public mx h;
    public final Map<fx, Integer> i;
    
    public lx(final mx a) {
        this.a = a;
        this.b = true;
        this.i = new HashMap();
    }
    
    public static final void a(final lx lx, final fx fx, int n, qni qni) {
        Objects.requireNonNull(lx);
        final float n2 = (float)n;
        long n3 = kqe.e(n2, n2);
        while (true) {
            n3 = lx.b(qni, n3);
            final qni n4 = qni.N0;
            e0e.c((Object)n4);
            if (e0e.a((Object)n4, (Object)lx.a.E())) {
                break;
            }
            qni = n4;
            if (!lx.c(n4).containsKey(fx)) {
                continue;
            }
            final float n5 = (float)lx.d(n4, fx);
            n3 = kqe.e(n5, n5);
            qni = n4;
        }
        if (fx instanceof mqc) {
            n = jb2.B0(kgj.e(n3));
        }
        else {
            n = jb2.B0(kgj.d(n3));
        }
        final HashMap i = lx.i;
        int intValue = n;
        if (i.containsKey(fx)) {
            final int intValue2 = ((Number)mlg.Q((Map)lx.i, (Object)fx)).intValue();
            final mqc a = hx.a;
            e0e.f((Object)fx, "<this>");
            intValue = ((Number)fx.a.invoke((Object)intValue2, (Object)n)).intValue();
        }
        i.put(fx, intValue);
    }
    
    public abstract long b(final qni p0, final long p1);
    
    public abstract Map<fx, Integer> c(final qni p0);
    
    public abstract int d(final qni p0, final fx p1);
    
    public final boolean e() {
        return this.c || this.e || this.f || this.g;
    }
    
    public final boolean f() {
        this.i();
        return this.h != null;
    }
    
    public final void g() {
        this.b = true;
        final mx i = this.a.i();
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
        this.a.z((stb<? super mx, vzv>)new stb<mx, vzv>(this) {
            public final lx F0;
            
            public final Object invoke(final Object o) {
                final mx mx = (mx)o;
                e0e.f((Object)mx, "childOwner");
                if (mx.u()) {
                    if (mx.d().b) {
                        mx.q();
                    }
                    final HashMap i = mx.d().i;
                    final lx f0 = this.F0;
                    for (final Map.Entry<fx, V> entry : i.entrySet()) {
                        lx.a(f0, entry.getKey(), ((Number)entry.getValue()).intValue(), mx.E());
                    }
                    qni qni = mx.E().N0;
                    e0e.c((Object)qni);
                    while (!e0e.a((Object)qni, (Object)this.F0.a.E())) {
                        final Set<fx> keySet = this.F0.c(qni).keySet();
                        final lx f2 = this.F0;
                        for (final fx fx : keySet) {
                            lx.a(f2, fx, f2.d(qni, fx), qni);
                        }
                        qni = qni.N0;
                        e0e.c((Object)qni);
                    }
                }
                return vzv.a;
            }
        });
        this.i.putAll(this.c(this.a.E()));
        this.b = false;
    }
    
    public final void i() {
        mx h = null;
        Label_0141: {
            if (this.e()) {
                h = this.a;
            }
            else {
                final mx i = this.a.i();
                if (i == null) {
                    return;
                }
                h = i.d().h;
                if (h == null || !h.d().e()) {
                    final mx h2 = this.h;
                    if (h2 == null) {
                        return;
                    }
                    if (h2.d().e()) {
                        return;
                    }
                    final mx j = h2.i();
                    if (j != null) {
                        final lx d = j.d();
                        if (d != null) {
                            d.i();
                        }
                    }
                    final mx k = h2.i();
                    if (k != null) {
                        final lx d2 = k.d();
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
