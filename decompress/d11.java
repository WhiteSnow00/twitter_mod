import java.util.concurrent.TimeUnit;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class d11 implements c11
{
    public static final d11.d11$a Companion;
    public final w01 a;
    public final m11 b;
    public final r11 c;
    public final e39 d;
    public final znl<Long> e;
    public final uv1<List<e31>> f;
    public String g;
    
    static {
        Companion = new d11.d11$a();
    }
    
    public d11(final w01 a, final m11 b, final r11 c, final kcm kcm) {
        e0e.f((Object)a, "addContentDataSource");
        e0e.f((Object)b, "deleteContentDataSource");
        e0e.f((Object)c, "fetchContentDataSource");
        e0e.f((Object)kcm, "releaseCompletable");
        this.a = a;
        this.b = b;
        this.c = c;
        final e39 d = new e39();
        this.d = d;
        this.e = (znl<Long>)new znl();
        this.f = (uv1<List<e31>>)uv1.e((Object)h3a.F0);
        kcm.i((sj)new vo0(d, 3));
    }
    
    public final bbq<e31> a(final String s, final String s2) {
        return (bbq<e31>)new ccq((idq)((tnm<w01.a, Object, osc>)this.a).S(new w01.a(s, s2)), (rk6)new xql((stb)new d11$c(this), 23));
    }
    
    public final yz5 b(final String s, final String s2) {
        e0e.f((Object)s2, "sharingId");
        return (yz5)new o06((idq)new ccq((idq)((tnm<m11$a, Object, osc>)this.b).S(new m11$a(s, s2)), (rk6)new ltt((stb)new d11$b(this), 14)));
    }
    
    public final void c() {
        this.e.onNext((Object)v7q.k());
    }
    
    public final t5j<List<e31>> d(final String g) {
        if (!e0e.a((Object)g, (Object)this.g)) {
            this.d.a();
            this.f.onNext((Object)h3a.F0);
            this.g = g;
            final e39 d = this.d;
            final t5j map = t5j.merge((fbj)t5j.interval(0L, 30L, TimeUnit.SECONDS), (fbj)this.e).flatMapSingle((rtb)new kzf((stb)new e11(this, g), 15)).map((rtb)new wsn((stb)g11.F0, 7));
            final h11 h11 = new h11((Object)this.f);
            e0e.e((Object)map, "map { response -> respon\u2026ending { it.updatedAt } }");
            d.c(znr.f(map, (stb)i11.F0, (stb)h11, 2));
        }
        return (t5j<List<e31>>)this.f;
    }
    
    public final void e() {
        this.g = null;
        this.d.a();
    }
}
