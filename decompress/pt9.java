import java.util.Objects;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pt9 implements xlw
{
    public final znl<xlw$a> a;
    public final znl<kni> b;
    public final lh6<List<String>> c;
    public final t5j<kni> d;
    public final t5j<String> e;
    
    public pt9(final ot9 ot9, final ylw ylw, final kcm kcm) {
        this.a = (znl<xlw$a>)new znl();
        final znl b = new znl();
        this.b = (znl<kni>)b;
        final lh6 publish = ((t5j)b).take(1L).publish();
        Objects.requireNonNull(publish);
        this.d = new z5j(publish);
        final lh6 replay = ylw.G0.S(new zlw$b(ylw.F0.getUser().c())).w((rtb)fxf.W0).P().replay(1);
        this.c = (lh6<List<String>>)replay;
        if (ot9.mIntent.getStringExtra("extra_prefill_username") == null) {
            this.e = (t5j<String>)t5j.never();
        }
        else {
            final lh6 publish2 = t5j.just((Object)ot9.mIntent.getStringExtra("extra_prefill_username")).publish();
            Objects.requireNonNull(publish2);
            this.e = (t5j<String>)new z5j(publish2);
        }
        final de6 de6 = new de6();
        de6.a(replay.d());
        kcm.i((sj)new lv1(de6, 4));
    }
    
    public final void a(final String s) {
        this.a.onNext((Object)new xlw$a(false, true, (String)null));
    }
    
    public final t5j<kni> b() {
        return (t5j<kni>)this.d;
    }
    
    public final t5j<String> c() {
        return this.e;
    }
    
    public final t5j<xlw$a> d() {
        return (t5j<xlw$a>)this.a;
    }
    
    public final t5j<List<String>> e() {
        return (t5j<List<String>>)this.c;
    }
    
    public final void f() {
        this.b.onNext((Object)kni.a);
    }
}
