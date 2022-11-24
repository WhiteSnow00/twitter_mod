// 
// Decompiled by Procyon v0.6.0
// 

public final class qom extends j4e<iq7$c>
{
    public final znl<iom> N0;
    public final de6 O0;
    public final t5j<iom> P0;
    
    public qom(final f5e<iq7$c> f5e, final d4e<iq7$c> d4e, final kcm kcm) {
        e0e.f((Object)f5e, "provider");
        e0e.f((Object)d4e, "directory");
        e0e.f((Object)kcm, "releaseCompletable");
        super((f5e)f5e, (d4e)d4e, kcm);
        final znl znl = new znl();
        this.N0 = (znl<iom>)znl;
        this.O0 = new de6();
        this.P0 = znl;
        kcm.i((sj)new gwt((Object)this, 3));
        final gda b = super.J0.b;
        e0e.e((Object)b, "eventObservable");
        final e39 e39;
        e39.c(tqb.T((fda)b).doOnComplete((sj)new qom$i(e39 = new e39())).subscribe((rk6)new f$w2((stb)new qom$j(this))));
    }
}
