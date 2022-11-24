import com.google.android.exoplayer2.v;
import java.util.List;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.e0;
import com.google.android.exoplayer2.source.i$b;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pmk
{
    public static final i$b t;
    public final e0 a;
    public final i$b b;
    public final long c;
    public final long d;
    public final int e;
    public final ExoPlaybackException f;
    public final boolean g;
    public final twt h;
    public final dxt i;
    public final List<q9h> j;
    public final i$b k;
    public final boolean l;
    public final int m;
    public final v n;
    public final boolean o;
    public final boolean p;
    public volatile long q;
    public volatile long r;
    public volatile long s;
    
    static {
        t = new i$b(new Object());
    }
    
    public pmk(final e0 a, final i$b b, final long c, final long d, final int e, final ExoPlaybackException f, final boolean g, final twt h, final dxt i, final List<q9h> j, final i$b k, final boolean l, final int m, final v n, final long q, final long r, final long s, final boolean o, final boolean p19) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = m;
        this.n = n;
        this.q = q;
        this.r = r;
        this.s = s;
        this.o = o;
        this.p = p19;
    }
    
    public static pmk i(final dxt dxt) {
        final e0 f0 = e0.F0;
        final i$b t = pmk.t;
        return new pmk(f0, t, -9223372036854775807L, 0L, 1, null, false, twt.I0, dxt, nbm.J0, t, false, 0, v.I0, 0L, 0L, 0L, false, false);
    }
    
    public final pmk a(final i$b i$b) {
        return new pmk(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, i$b, this.l, this.m, this.n, this.q, this.r, this.s, this.o, this.p);
    }
    
    public final pmk b(final i$b i$b, final long n, final long n2, final long n3, final long n4, final twt twt, final dxt dxt, final List<q9h> list) {
        return new pmk(this.a, i$b, n2, n3, this.e, this.f, this.g, twt, dxt, list, this.k, this.l, this.m, this.n, this.q, n4, n, this.o, this.p);
    }
    
    public final pmk c(final boolean b) {
        return new pmk(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.q, this.r, this.s, b, this.p);
    }
    
    public final pmk d(final boolean b, final int n) {
        return new pmk(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, b, n, this.n, this.q, this.r, this.s, this.o, this.p);
    }
    
    public final pmk e(final ExoPlaybackException ex) {
        return new pmk(this.a, this.b, this.c, this.d, this.e, ex, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.q, this.r, this.s, this.o, this.p);
    }
    
    public final pmk f(final v v) {
        return new pmk(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, v, this.q, this.r, this.s, this.o, this.p);
    }
    
    public final pmk g(final int n) {
        return new pmk(this.a, this.b, this.c, this.d, n, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.q, this.r, this.s, this.o, this.p);
    }
    
    public final pmk h(final e0 e0) {
        return new pmk(e0, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.q, this.r, this.s, this.o, this.p);
    }
}
