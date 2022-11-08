// 
// Decompiled by Procyon v0.6.0
// 

public final class amb implements agc
{
    public final er0 a;
    public final zfc b;
    public final qvo c;
    public final ibm d;
    
    public amb(final er0 a, final zfc b, final qvo c, final ibm d) {
        zzd.f((Object)a, "applicationLifecycle");
        zzd.f((Object)b, "hashflagPreferences");
        zzd.f((Object)c, "scheduler");
        zzd.f((Object)d, "releaseCompletable");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final void a() {
        final j29 subscribe = this.a.i().observeOn(this.c).switchMap((qtb)new uii((rtb)new amb$a(this), 11)).switchMapSingle((qtb)new i5i((rtb)amb$b.C0, 8)).subscribe();
        zzd.e((Object)subscribe, "override fun scheduleWor\u2026releaseCompletable)\n    }");
        f.a(subscribe, (raa)this.d);
    }
}
