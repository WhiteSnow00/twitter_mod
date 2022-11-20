import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jr4
{
    public static final zll<ir4> a;
    
    static {
        jr4.a = (iar)xd6.d((nsb)jr4$a.D0);
    }
    
    public static final long a(final ir4 ir4, long n) {
        czd.f((Object)ir4, "$this$contentColorFor");
        if (nq4.c(n, ir4.h())) {
            n = ir4.e();
        }
        else if (nq4.c(n, ir4.i())) {
            n = ir4.e();
        }
        else if (nq4.c(n, ir4.j())) {
            n = ir4.f();
        }
        else if (nq4.c(n, ir4.k())) {
            n = ir4.f();
        }
        else if (nq4.c(n, ir4.a())) {
            n = ir4.c();
        }
        else if (nq4.c(n, ir4.l())) {
            n = ir4.g();
        }
        else if (nq4.c(n, ir4.b())) {
            n = ir4.d();
        }
        else {
            Objects.requireNonNull(nq4.Companion);
            n = nq4.g;
        }
        return n;
    }
    
    public static final long b(long n, final x66 x66) {
        final n96$b a = n96.a;
        n = a((ir4)x66.m((wd6)jr4.a), n);
        Objects.requireNonNull(nq4.Companion);
        if (n == nq4.g) {
            n = ((nq4)x66.m((wd6)sk6.a)).a;
        }
        return n;
    }
    
    public static final long c(final ir4 ir4) {
        czd.f((Object)ir4, "<this>");
        long n;
        if (ir4.m()) {
            n = ir4.h();
        }
        else {
            n = ir4.l();
        }
        return n;
    }
}
