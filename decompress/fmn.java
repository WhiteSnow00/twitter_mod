// 
// Decompiled by Procyon v0.6.0
// 

public final class fmn
{
    public final i9c a;
    public final e6e b;
    public final r5e c;
    public final wj2 d;
    public final w19 e;
    
    public fmn(final i9c a, final e6e b, final r5e c, final wj2 d) {
        czd.f((Object)a, "guestSessionInfoDelegate");
        czd.f((Object)b, "janusInfoDelegate");
        czd.f((Object)c, "connectionDelegate");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = new w19();
    }
    
    public final void a() {
        this.e.c(h5j.combineLatest((taj)this.b.getPublisherListObservable(), (taj)this.a.a(), (zv1)new gfh((Object)fmn$a.D0, 6)).subscribe((lj6)new fwi((qsb)new fmn$b(this), 18)));
    }
    
    public final void b() {
        this.e.a();
    }
}
