import java.util.Collection;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class myo
{
    public static final b Companion;
    public final m29 a;
    public final u3s b;
    
    static {
        Companion = new b();
    }
    
    public myo(final eyo eyo, final z7x z7x, final jn6 jn6) {
        zzd.f((Object)eyo, "screenshotDetector");
        zzd.f((Object)z7x, "viewLifecycle");
        this.a = new m29();
        this.b = (u3s)rp2.z0((otb)myo$c.C0);
        final m29 m29;
        m29.c(z7x.d().doOnComplete((rj)new myo$e(m29 = new m29())).subscribe((fk6)new f$n3((rtb)new myo$f(this, eyo, jn6))));
        final m29 m30;
        m30.c(z7x.g().doOnComplete((rj)new myo$g(m30 = new m29())).subscribe((fk6)new f$n3((rtb)new myo$h(this))));
    }
    
    public static final void a(final myo myo) {
        Objects.requireNonNull(myo);
        final tba c = sba.c;
        final v2a c2 = v2a.C0;
        final zf4 zf4 = new zf4(nca.Companion.c((sba)c, "take_screenshot"));
        zf4.j((Collection)c2);
        saw.b((okm)zf4);
    }
    
    public static final class b
    {
    }
}
