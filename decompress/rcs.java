// 
// Decompiled by Procyon v0.6.0
// 

public final class rcs
{
    public final qll<dw0> a;
    public final ncs$a b;
    
    public rcs(final qfv qfv, final qll<dw0> a, final ncs$a b) {
        this.a = a;
        this.b = b;
        qfv.p().subscribe((fk6)new pcs((Object)this, 0));
        qfv.j().subscribe((fk6)new ocs((Object)this, 0));
        b5j.combineLatest((naj)dta.d().o("account_teams_enabled"), (naj)dta.d().o("responsive_web_delegate_enabled"), (ew1)bbf.E0).distinctUntilChanged().subscribe((fk6)new qcs((Object)this, (Object)qfv, 0));
    }
    
    public final void a(final ocw ocw, final boolean b) {
        if (!ocw.g() || b) {
            ((dw0)this.a.get()).e((fw0<Object>)this.b.a(ocw.k()));
        }
    }
}
