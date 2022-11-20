import j$.util.concurrent.ConcurrentHashMap;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class q3b extends ste implements qsb<b3e$a<ql1>, fzv>
{
    public final m3b D0;
    
    public q3b(final m3b d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final b3e$a b3e$a = (b3e$a)o;
        final a3b f0 = this.D0.F0;
        final v7x a = b3e$a.a;
        final Object b = b3e$a.b;
        czd.e(b, "it.item");
        final ql1 ql1 = (ql1)b;
        final int c = b3e$a.c;
        Objects.requireNonNull(f0);
        czd.f((Object)a, "viewHolder");
        final boolean b2 = ql1 instanceof hy5;
        final int n = 0;
        boolean b3 = false;
        if (b2) {
            final ConcurrentHashMap d = f0.d;
            final o01 m = ((hy5)ql1).m;
            final String a2 = m.a;
            final String r = m.r;
            if (r == null || r.length() == 0) {
                b3 = true;
            }
            d.put((Object)a, (Object)new a3b$c(c, a2, b3 ^ true));
        }
        else if (ql1 instanceof tmq) {
            final ConcurrentHashMap d2 = f0.d;
            final tmq tmq = (tmq)ql1;
            final String j = tmq.j;
            final String r2 = tmq.o.r;
            int n2 = 0;
            Label_0203: {
                if (r2 != null) {
                    n2 = n;
                    if (r2.length() != 0) {
                        break Label_0203;
                    }
                }
                n2 = 1;
            }
            d2.put((Object)a, (Object)new a3b$c(c, j, (boolean)((n2 ^ 0x1) != 0x0)));
        }
        return fzv.a;
    }
}
