import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class p5l
{
    public final xmq<cmw$a> a;
    public noj<t4l> b;
    
    public p5l(final xmq<cmw$a> a) {
        e0e.f((Object)a, "sourceReader");
        this.a = a;
        final noj b = noj.b;
        final int a2 = o5j.a;
        this.b = (noj<t4l>)b;
    }
    
    public final t5j<noj<t4l>> a() {
        final xmq<cmw$a> a = this.a;
        final p5l.p5l$a p5l$a = new p5l.p5l$a();
        final m2d b = jih.b((Class)cmw$a.class, (Class)qgv.class);
        e0e.c((Object)b);
        final x6j a2 = ctl.a(yru.p((xmq)a, b), (btl)p5l$a);
        final UserIdentifier k = pdw.d().k();
        e0e.e((Object)k, "getCurrent().userIdentifier");
        final t5j doOnNext = ((ctl$b)a2).w((Object)k).map((rtb)new t3i((stb)p5l$b.F0, 10)).map((rtb)new dql((stb)p5l$c.F0, 7)).doOnNext((rk6)new gpl((stb)new p5l$d(this), 6));
        e0e.e((Object)doOnNext, "fun professionalObservab\u2026 = it\n            }\n    }");
        return (t5j<noj<t4l>>)doOnNext;
    }
}
