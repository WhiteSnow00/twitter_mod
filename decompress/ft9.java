import java.util.Objects;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ft9 implements okw
{
    public final zml<okw$a> a;
    public final zml<pmi> b;
    public final zg6<List<String>> c;
    public final b5j<pmi> d;
    public final b5j<String> e;
    
    public ft9(final et9 et9, final pkw pkw, final ibm ibm) {
        this.a = (zml<okw$a>)new zml();
        final zml b = new zml();
        this.b = (zml<pmi>)b;
        final zg6 publish = ((b5j)b).take(1L).publish();
        Objects.requireNonNull(publish);
        this.d = new h5j(publish);
        final zg6 replay = pkw.D0.S((Object)new qkw.b(pkw.C0.getUser().c())).w((qtb)orf.K0).P().replay(1);
        this.c = (zg6<List<String>>)replay;
        if (((dj1)et9).mIntent.getStringExtra("extra_prefill_username") == null) {
            this.e = (b5j<String>)b5j.never();
        }
        else {
            final zg6 publish2 = b5j.just((Object)((dj1)et9).mIntent.getStringExtra("extra_prefill_username")).publish();
            Objects.requireNonNull(publish2);
            this.e = (b5j<String>)new h5j(publish2);
        }
        final rd6 rd6 = new rd6();
        rd6.a(replay.d());
        ibm.i((rj)new bjf(rd6, 4));
    }
    
    public final void a(final String s) {
        this.a.onNext((Object)new okw$a(false, true, (String)null));
    }
    
    public final b5j<pmi> b() {
        return (b5j<pmi>)this.d;
    }
    
    public final b5j<String> c() {
        return this.e;
    }
    
    public final b5j<okw$a> d() {
        return (b5j<okw$a>)this.a;
    }
    
    public final b5j<List<String>> e() {
        return (b5j<List<String>>)this.c;
    }
    
    public final void f() {
        this.b.onNext((Object)pmi.a);
    }
}
