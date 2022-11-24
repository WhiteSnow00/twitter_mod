import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vd9
{
    public static final int a = 0;
    
    static {
        final wd9.a companion = wd9.Companion;
    }
    
    public static long a(final long n, final long n2) {
        return jty.g(aeq.d(n) - kgj.d(n2), aeq.b(n) - kgj.e(n2));
    }
    
    public static void b(final wd9 wd9, final long n, final float n2, final float n3, final boolean b, long b2, long a, float n4, dcu f0, final vr4 vr4, int b3, final int n5, final Object o) {
        if ((n5 & 0x10) != 0x0) {
            Objects.requireNonNull(kgj.Companion);
            b2 = kgj.b;
        }
        if ((n5 & 0x20) != 0x0) {
            a = a(wd9.c(), b2);
        }
        if ((n5 & 0x40) != 0x0) {
            n4 = 1.0f;
        }
        if ((n5 & 0x80) != 0x0) {
            f0 = (dcu)vya.F0;
        }
        if ((n5 & 0x200) != 0x0) {
            Objects.requireNonNull(wd9.Companion);
            b3 = wd9.a.b;
        }
        else {
            b3 = 0;
        }
        wd9.B(n, n2, n3, b2, a, n4, f0, null, b3);
    }
    
    public static void c(final wd9 wd9, final long n, float n2, long b0, float n3, final dcu dcu, final vr4 vr4, int b2, final int n4, final Object o) {
        if ((n4 & 0x2) != 0x0) {
            n2 = aeq.c(wd9.c()) / 2.0f;
        }
        if ((n4 & 0x4) != 0x0) {
            b0 = wd9.B0();
        }
        if ((n4 & 0x8) != 0x0) {
            n3 = 1.0f;
        }
        else {
            n3 = 0.0f;
        }
        Object f0;
        if ((n4 & 0x10) != 0x0) {
            f0 = vya.F0;
        }
        else {
            f0 = null;
        }
        if ((n4 & 0x40) != 0x0) {
            Objects.requireNonNull(wd9.Companion);
            b2 = wd9.a.b;
        }
        else {
            b2 = 0;
        }
        wd9.x0(n, n2, b0, n3, (dcu)f0, null, b2);
    }
    
    public static void d(final wd9 wd9, final m6d m6d, long f, long b, long b2, long n, float n2, final dcu dcu, vr4 vr4, int b3, int c, final int n3, final Object o) {
        if ((n3 & 0x2) != 0x0) {
            Objects.requireNonNull(hud.Companion);
            b2 = hud.b;
        }
        else {
            b2 = f;
        }
        if ((n3 & 0x4) != 0x0) {
            f = shw.f(m6d.getWidth(), m6d.getHeight());
        }
        else {
            f = b;
        }
        if ((n3 & 0x8) != 0x0) {
            Objects.requireNonNull(hud.Companion);
            b = hud.b;
        }
        else {
            b = 0L;
        }
        if ((n3 & 0x10) != 0x0) {
            n = f;
        }
        if ((n3 & 0x20) != 0x0) {
            n2 = 1.0f;
        }
        final vr4 vr5 = null;
        Object f2;
        if ((n3 & 0x40) != 0x0) {
            f2 = vya.F0;
        }
        else {
            f2 = null;
        }
        if ((n3 & 0x80) != 0x0) {
            vr4 = vr5;
        }
        if ((n3 & 0x100) != 0x0) {
            Objects.requireNonNull(wd9.Companion);
            b3 = wd9.a.b;
        }
        else {
            b3 = 0;
        }
        if ((n3 & 0x200) != 0x0) {
            Objects.requireNonNull(wd9.Companion);
            c = wd9.a.c;
        }
        wd9.M(m6d, b2, f, b, n, n2, (dcu)f2, vr4, b3, c);
    }
    
    public static void e(final wd9 wd9, final m6d m6d, long b, final float n, final dcu dcu, final vr4 vr4, final int n2, final int n3, final Object o) {
        Objects.requireNonNull(kgj.Companion);
        b = kgj.b;
        final vya f0 = vya.F0;
        Objects.requireNonNull(wd9.Companion);
        wd9.b0(m6d, b, 1.0f, (dcu)f0, vr4, wd9.a.b);
    }
    
    public static void f(final wd9 wd9, final wq2 wq2, final long n, final long n2, float n3, int b, final f0k f0k, float n4, final vr4 vr4, final int n5, final int n6, final Object o) {
        if ((n6 & 0x8) != 0x0) {
            n3 = 0.0f;
        }
        if ((n6 & 0x10) != 0x0) {
            Objects.requireNonNull(fmr.Companion);
            final fmr.fmr$a companion = fmr.Companion;
        }
        if ((n6 & 0x40) != 0x0) {
            n4 = 1.0f;
        }
        if ((n6 & 0x100) != 0x0) {
            Objects.requireNonNull(wd9.Companion);
            b = wd9.a.b;
        }
        else {
            b = 0;
        }
        wd9.G(wq2, n, n2, n3, 0, null, n4, null, b);
    }
    
    public static void g(final wd9 wd9, final c0k c0k, final wq2 wq2, float n, dcu f0, final vr4 vr4, int b, final int n2, final Object o) {
        if ((n2 & 0x4) != 0x0) {
            n = 1.0f;
        }
        if ((n2 & 0x8) != 0x0) {
            f0 = (dcu)vya.F0;
        }
        if ((n2 & 0x20) != 0x0) {
            Objects.requireNonNull(wd9.Companion);
            b = wd9.a.b;
        }
        else {
            b = 0;
        }
        wd9.r0(c0k, wq2, n, f0, null, b);
    }
    
    public static void h(final wd9 wd9, final c0k c0k, final long n, float n2, dcu f0, final vr4 vr4, int b, final int n3, final Object o) {
        if ((n3 & 0x4) != 0x0) {
            n2 = 1.0f;
        }
        if ((n3 & 0x8) != 0x0) {
            f0 = (dcu)vya.F0;
        }
        if ((n3 & 0x20) != 0x0) {
            Objects.requireNonNull(wd9.Companion);
            b = wd9.a.b;
        }
        else {
            b = 0;
        }
        wd9.k0(c0k, n, n2, f0, null, b);
    }
    
    public static void i(final wd9 wd9, final wq2 wq2, long b, long a, float n, dcu f0, final vr4 vr4, int b2, final int n2, final Object o) {
        if ((n2 & 0x2) != 0x0) {
            Objects.requireNonNull(kgj.Companion);
            b = kgj.b;
        }
        if ((n2 & 0x4) != 0x0) {
            a = a(wd9.c(), b);
        }
        if ((n2 & 0x8) != 0x0) {
            n = 1.0f;
        }
        if ((n2 & 0x10) != 0x0) {
            f0 = (dcu)vya.F0;
        }
        if ((n2 & 0x40) != 0x0) {
            Objects.requireNonNull(wd9.Companion);
            b2 = wd9.a.b;
        }
        else {
            b2 = 0;
        }
        wd9.D0(wq2, b, a, n, f0, null, b2);
    }
    
    public static void j(final wd9 wd9, final long n, long b, long a, float n2, final dcu dcu, vr4 vr4, int b2, final int n3, final Object o) {
        if ((n3 & 0x2) != 0x0) {
            Objects.requireNonNull(kgj.Companion);
            b = kgj.b;
        }
        if ((n3 & 0x4) != 0x0) {
            a = a(wd9.c(), b);
        }
        if ((n3 & 0x8) != 0x0) {
            n2 = 1.0f;
        }
        Object f0;
        if ((n3 & 0x10) != 0x0) {
            f0 = vya.F0;
        }
        else {
            f0 = null;
        }
        if ((n3 & 0x20) != 0x0) {
            vr4 = null;
        }
        if ((n3 & 0x40) != 0x0) {
            Objects.requireNonNull(wd9.Companion);
            b2 = wd9.a.b;
        }
        else {
            b2 = 0;
        }
        wd9.o0(n, b, a, n2, (dcu)f0, vr4, b2);
    }
    
    public static void k(final wd9 wd9, final wq2 wq2, long b, long a, long a2, float n, dcu f0, final vr4 vr4, int b2, final int n2, final Object o) {
        if ((n2 & 0x2) != 0x0) {
            Objects.requireNonNull(kgj.Companion);
            b = kgj.b;
        }
        if ((n2 & 0x4) != 0x0) {
            a = a(wd9.c(), b);
        }
        if ((n2 & 0x8) != 0x0) {
            Objects.requireNonNull(ty6.Companion);
            a2 = ty6.a;
        }
        if ((n2 & 0x10) != 0x0) {
            n = 1.0f;
        }
        else {
            n = 0.0f;
        }
        if ((n2 & 0x20) != 0x0) {
            f0 = (dcu)vya.F0;
        }
        if ((n2 & 0x80) != 0x0) {
            Objects.requireNonNull(wd9.Companion);
            b2 = wd9.a.b;
        }
        else {
            b2 = 0;
        }
        wd9.N(wq2, b, a, a2, n, f0, null, b2);
    }
    
    public static void l(final wd9 wd9, final long n, long b, long a, long a2, dcu f0, float n2, final vr4 vr4, int b2, final int n3, final Object o) {
        if ((n3 & 0x2) != 0x0) {
            Objects.requireNonNull(kgj.Companion);
            b = kgj.b;
        }
        if ((n3 & 0x4) != 0x0) {
            a = a(wd9.c(), b);
        }
        if ((n3 & 0x8) != 0x0) {
            Objects.requireNonNull(ty6.Companion);
            a2 = ty6.a;
        }
        if ((n3 & 0x10) != 0x0) {
            f0 = (dcu)vya.F0;
        }
        if ((n3 & 0x20) != 0x0) {
            n2 = 1.0f;
        }
        else {
            n2 = 0.0f;
        }
        if ((n3 & 0x80) != 0x0) {
            Objects.requireNonNull(wd9.Companion);
            b2 = wd9.a.b;
        }
        else {
            b2 = 0;
        }
        wd9.f0(n, b, a, a2, f0, n2, null, b2);
    }
}
