// 
// Decompiled by Procyon v0.6.0
// 

public final class lnm extends c4e<yp7$c>
{
    public final zml<dnm> K0;
    public final rd6 L0;
    public final b5j<dnm> M0;
    
    public lnm(final y4e<yp7$c> y4e, final x3e<yp7$c> x3e, final ibm ibm) {
        zzd.f((Object)y4e, "provider");
        zzd.f((Object)x3e, "directory");
        zzd.f((Object)ibm, "releaseCompletable");
        super((y4e)y4e, (x3e)x3e, ibm);
        final zml zml = new zml();
        this.K0 = (zml<dnm>)zml;
        this.L0 = new rd6();
        this.M0 = zml;
        ibm.i((rj)new xak((Object)this, 6));
        final qca b = super.G0.b;
        zzd.e((Object)b, "eventObservable");
        final m29 m29;
        m29.c(tdy.A0((pca)b).doOnComplete((rj)new lnm$i(m29 = new m29())).subscribe((fk6)new fk6((rtb)new lnm$j(this))));
    }
}
