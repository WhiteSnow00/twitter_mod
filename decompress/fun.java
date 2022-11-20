import android.content.Context;
import java.util.Collection;
import java.util.List;
import tv.periscope.model.b$a;
import tv.periscope.model.a$a;
import tv.periscope.model.b;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fun
{
    public static final b a(final r21 r21) {
        czd.f((Object)r21, "<this>");
        final b$a g = b.g();
        g.e(r21.h);
        final a$a a$a = (a$a)g;
        a$a.n = "";
        a$a.d = r21.e;
        a$a.z = "";
        a$a.k(r21.v);
        return ((b$a)a$a).a();
    }
    
    public static final ah2$b b(final r21 r21, final String g) {
        final ah2$b ah2$b = new ah2$b();
        ah2$b.c = a(r21);
        ah2$b.e = true;
        ah2$b.f = asa.b().b("android_audio_low_latency_hls_enabled", true);
        ah2$b.g = g;
        return ah2$b;
    }
    
    public static final List<ti1> c(final w4 w4, final nsb<fzv> nsb, final nnl<x1> nnl, final nnl<x1> nnl2, final nnl<ylk> nnl3, final kmk kmk) {
        czd.f((Object)nnl, "hydraAVEventPublishSubject");
        czd.f((Object)nnl2, "replayAVEventPublishSubject");
        czd.f((Object)nnl3, "errorAVEventPublishSubject");
        czd.f((Object)kmk, "playbackMode");
        final qsv qsv = new qsv(nnl) {
            public final nnl<x1> I0;
            
            public final void r() {
                ((ti1)this).l((Class)swc.class, (xv1)new rx0((Object)this.I0, 4), 0);
                ((ti1)this).l((Class)cwc.class, (xv1)new c3(this.I0, 8), 0);
            }
        };
        final fun$d fun$d = new fun$d(kmk, (nsb)nsb);
        final sx0 sx0 = new sx0(w4, (sx0$a)new fun$c((nsb)nsb));
        final nnk nnk = new nnk((nnk$a)new fun$f((nnl)nnl3, (nsb)nsb));
        boolean b = false;
        final List w5 = s9i.w((ti1)sx0, (ti1)nnk, (ti1)qsv);
        if (kmk != kmk.F0) {
            b = true;
        }
        if (b) {
            w5.add(new fok(fun$d, nnl2) {
                public final nnl<x1> J0;
                
                public final void r() {
                    super.r();
                    ((ti1)this).l((Class)zlk.class, (xv1)new b3((Object)this.J0, 4), 0);
                    ((ti1)this).l((Class)hok.class, (xv1)new h41((Object)this.J0, 29), 0);
                    ((ti1)this).l((Class)ink.class, (xv1)new g41((Object)this.J0, 28), 4);
                    ((ti1)this).l((Class)xzi.class, (xv1)new i41((Object)this.J0, 28), 0);
                    ((ti1)this).l((Class)lmk.class, (xv1)new j41((Object)this.J0, 21), 0);
                    ((ti1)this).l((Class)g0k.class, (xv1)new eok((Object)this.J0, 2), 4);
                    ((ti1)this).l((Class)cnk.class, (xv1)new cok((Object)this.J0, 2), 4);
                }
            });
        }
        if (kmk == kmk.D0) {
            w5.add(new xhl(nnl2) {
                public final nnl<x1> J0;
                
                public final void r() {
                    super.r();
                    ((ti1)this).l((Class)lhl.class, (xv1)new dok((Object)this.J0, 3), 0);
                }
            });
        }
        w4.e.l((Collection)mq4.R0((Iterable)w5));
        return w5;
    }
    
    public static final i0 d(final Context e, final i1 c, final flk a, final boolean i) {
        czd.f((Object)e, "context");
        final i0$a i0$a = new i0$a();
        i0$a.c = c;
        i0$a.a = a;
        i0$a.b = (mba)new hvf(new efv(), "AudioSpaces");
        i0$a.e = e;
        i0$a.f = true;
        i0$a.g = true;
        i0$a.h = true;
        i0$a.i = i;
        return (i0)((n4j)i0$a).e();
    }
}
