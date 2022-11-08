// 
// Decompiled by Procyon v0.6.0
// 

public final class qvk
{
    public static final b Companion;
    public final zau a;
    public final rv1<hbf> b;
    public long c;
    public boolean d;
    public boolean e;
    
    static {
        Companion = new b();
    }
    
    public qvk(final b5j<hbf> b5j, final zau a, final ibm ibm) {
        zzd.f((Object)a, "systemClock");
        zzd.f((Object)ibm, "releaseCompletable");
        this.a = a;
        this.b = (rv1<hbf>)new rv1();
        this.c = -1L;
        final j29 subscribe = b5j.subscribe((fk6)new wt1((rtb)new qvk$a(this), 2));
        zzd.e((Object)subscribe, "eventObservable.subscrib\u2026lifecycleEvent)\n        }");
        f.a(subscribe, (raa)ibm);
    }
    
    public static final class b
    {
    }
}
