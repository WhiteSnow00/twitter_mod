// 
// Decompiled by Procyon v0.6.0
// 

public final class yu1 implements pba<zu1>
{
    public final r6x C0;
    public final kda<x00> D0;
    public final zml<zu1> E0;
    
    public yu1(final r6x c0, final kda<x00> d0, final qvo qvo, final ibm ibm) {
        zzd.f((Object)c0, "eventSourceFactory");
        zzd.f((Object)d0, "eventSourceMetadataRegistry");
        zzd.f((Object)qvo, "workScheduler");
        zzd.f((Object)ibm, "releaseCompletable");
        this.C0 = c0;
        this.D0 = d0;
        final zml e0 = new zml();
        this.E0 = (zml<zu1>)e0;
        final b5j ofType = ((b5j)e0).ofType((Class)fam.class);
        zzd.b((Object)ofType, "ofType(R::class.java)");
        final b5j observeOn = ofType.observeOn(qvo);
        zzd.e((Object)observeOn, "metadataEmitter.ofType<R\u2026.observeOn(workScheduler)");
        final m29 m29 = new m29();
        ((iz5)ibm.D0).q((rj)new wu1(m29));
        m29.c(observeOn.subscribe((fk6)new f$o((rtb)new xu1(this))));
    }
    
    public final void e(final Object o) {
        final zu1 zu1 = (zu1)o;
        zzd.f((Object)zu1, "t");
        this.E0.onNext((Object)zu1);
    }
}
