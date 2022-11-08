import java.util.concurrent.TimeUnit;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.HashMap;
import android.content.Context;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jnz
{
    public static mky<String> j;
    public final String a;
    public final String b;
    public final hnz c;
    public final cxp d;
    public final zas<String> e;
    public final zas<String> f;
    public final String g;
    public final Map<cgz, Long> h;
    public final Map<cgz, tky<Object, Long>> i;
    
    public jnz(final Context context, final cxp d, final hnz c, final String g) {
        this.h = new HashMap();
        this.i = new HashMap();
        this.a = context.getPackageName();
        this.b = xx4.a(context);
        this.d = d;
        this.c = c;
        this.g = g;
        this.e = (rzz)dfg.a().b((Callable)new fiz(g, 1));
        final dfg a = dfg.a();
        Objects.requireNonNull(d);
        this.f = (rzz)a.b((Callable)new ghy((Object)d, 1));
    }
    
    public static long a(final List<Long> list, final double n) {
        return list.get(Math.max((int)Math.ceil(n / 100.0 * list.size()) - 1, 0));
    }
    
    public final void b(final qnz qnz, final cgz cgz, final String s) {
        final Object b = dfg.b;
        baz.C0.execute((Runnable)new imz(this, qnz, cgz, s));
    }
    
    public final String c() {
        if (this.e.s()) {
            return (String)this.e.o();
        }
        return iaf.c.a(this.g);
    }
    
    public final boolean d(final cgz cgz, final long n) {
        return this.h.get(cgz) == null || n - this.h.get(cgz) > TimeUnit.SECONDS.toMillis(30L);
    }
}
