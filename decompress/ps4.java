import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ps4
{
    public static final lml<os4> a;
    
    static {
        ps4.a = (gbr)ef6.d((ptb)ps4$a.F0);
    }
    
    public static final long a(final os4 os4, long n) {
        e0e.f((Object)os4, "$this$contentColorFor");
        if (sr4.c(n, os4.h())) {
            n = os4.e();
        }
        else if (sr4.c(n, os4.i())) {
            n = os4.e();
        }
        else if (sr4.c(n, os4.j())) {
            n = os4.f();
        }
        else if (sr4.c(n, os4.k())) {
            n = os4.f();
        }
        else if (sr4.c(n, os4.a())) {
            n = os4.c();
        }
        else if (sr4.c(n, os4.l())) {
            n = os4.g();
        }
        else if (sr4.c(n, os4.b())) {
            n = os4.d();
        }
        else {
            Objects.requireNonNull(sr4.Companion);
            n = sr4.g;
        }
        return n;
    }
    
    public static final long b(long n, final d86 d86) {
        final sa6$b a = sa6.a;
        n = a((os4)d86.m((df6)ps4.a), n);
        Objects.requireNonNull(sr4.Companion);
        if (n == sr4.g) {
            n = ((sr4)d86.m((df6)yl6.a)).a;
        }
        return n;
    }
    
    public static final long c(final os4 os4) {
        e0e.f((Object)os4, "<this>");
        long n;
        if (os4.m()) {
            n = os4.h();
        }
        else {
            n = os4.l();
        }
        return n;
    }
}
