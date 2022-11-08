import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class yr7 implements ww7<ls7, xr7, fs7>
{
    public static final yr7.yr7$a Companion;
    public static final ls7 k;
    public static final nca l;
    public final bv7 a;
    public final qvo b;
    public final rv1<ls7> c;
    public final zml<xr7> d;
    public final zml<fs7> e;
    public final zml<String> f;
    public final m29 g;
    public b5j<ls7> h;
    public b5j<fs7> i;
    public final wbj<xr7> j;
    
    static {
        Companion = new yr7.yr7$a();
        k = new ls7("", h28.C0, (List)v2a.C0);
        l = new nca("messages", "inbox", "recent_search", "", "add");
    }
    
    public yr7(final bv7 a, final qvo b) {
        zzd.f((Object)a, "recentSearchRepository");
        zzd.f((Object)b, "mainScheduler");
        this.a = a;
        this.b = b;
        final rv1 e = rv1.e((Object)yr7.k);
        this.c = (rv1<ls7>)e;
        final zml zml = new zml();
        this.d = (zml<xr7>)zml;
        final zml e2 = new zml();
        this.e = (zml<fs7>)e2;
        this.f = (zml<String>)new zml();
        this.g = new m29();
        final b5j compose = ((b5j)e).compose((jbj)ngm.C0);
        zzd.e((Object)compose, "searchStateSubject.compo\u2026eplayingShare.instance())");
        this.h = (b5j<ls7>)compose;
        final b5j share = ((b5j)e2).share();
        zzd.e((Object)share, "searchEffectSubject.share()");
        this.i = (b5j<fs7>)share;
        this.j = zml;
    }
    
    public final wbj<xr7> a() {
        return (wbj<xr7>)this.j;
    }
    
    public final b5j<ls7> b() {
        return this.h;
    }
    
    public final b5j<fs7> c() {
        return this.i;
    }
    
    public final ls7 d(final rtb<? super ls7, ls7> rtb) {
        ls7 k;
        if ((k = (ls7)this.c.f()) == null) {
            k = yr7.k;
        }
        zzd.e((Object)k, "searchStateSubject.value ?: INITIAL_STATE");
        final ls7 ls7 = (ls7)rtb.invoke((Object)k);
        this.c.onNext((Object)ls7);
        return ls7;
    }
}
