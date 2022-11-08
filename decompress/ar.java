// 
// Decompiled by Procyon v0.6.0
// 

public final class ar
{
    public static final xq<String> a;
    public static final xq<Integer> b;
    public static final xq<Double> c;
    public static final xq<Float> d;
    public static final xq<Long> e;
    public static final xq<Boolean> f;
    public static final xq<Object> g;
    public static final xq<r3w> h;
    public static final c2j<String> i;
    public static final c2j<Double> j;
    public static final c2j<Integer> k;
    public static final c2j<Boolean> l;
    
    static {
        final ar$g ar$g = ar.a = new ar$g();
        final ar$e ar$e = ar.b = new ar$e();
        final ar$c ar$c = ar.c = new ar$c();
        ar.d = new ar$d();
        ar.e = new ar$f();
        final ar$b ar$b = ar.f = new ar$b();
        final ar$a ar$a = ar.g = new ar$a();
        ar.h = new ar$h();
        i = b((xq<String>)ar$g);
        j = b((xq<Double>)ar$c);
        k = b((xq<Integer>)ar$e);
        l = b((xq<Boolean>)ar$b);
        b((xq<Object>)ar$a);
    }
    
    public static final <T> xif<T> a(final xq<T> xq) {
        return (xif<T>)new xif((xq)xq);
    }
    
    public static final <T> c2j<T> b(final xq<T> xq) {
        zzd.f((Object)xq, "<this>");
        return new c2j<T>(xq);
    }
    
    public static final <T> g4j<T> c(final xq<T> xq, final boolean b) {
        return (g4j<T>)new g4j((xq)xq, b);
    }
    
    public static final <T> tnj<T> d(final xq<T> xq) {
        zzd.f((Object)xq, "<this>");
        return (tnj<T>)new tnj((xq)xq);
    }
}
