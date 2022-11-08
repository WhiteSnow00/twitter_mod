// 
// Decompiled by Procyon v0.6.0
// 

public final class fst implements yai
{
    public final ost a;
    public final n1c b;
    public final abi c;
    public final n2j d;
    public final m29 e;
    
    public fst(final ost a, final n1c b, final abi c, final n2j d, final ibm ibm) {
        zzd.f((Object)a, "topicsRepository");
        zzd.f((Object)b, "viewHelper");
        zzd.f((Object)c, "navLinkOptions");
        zzd.f((Object)d, "numTopicsSelectedManager");
        zzd.f((Object)ibm, "releaseCompletable");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = new m29();
        ibm.i((rj)new hj4((Object)this, 27));
    }
    
    public final void bind() {
        final dsr d = this.c.d;
        if (d != null) {
            int n = 0;
            if (d != null) {
                n = n;
                if (d.c == 9) {
                    n = 1;
                }
            }
            if (n != 0) {
                this.e.c(this.a.b().subscribe((fk6)new tst((rtb)new fst$a(this), 1), (fk6)new aqi((rtb)fst$b.C0, 7), (rj)qea.D0));
            }
        }
    }
}
