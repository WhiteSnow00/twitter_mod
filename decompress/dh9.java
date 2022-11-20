// 
// Decompiled by Procyon v0.6.0
// 

public final class dh9 extends ste implements qsb<fhp, fzv>
{
    public final String D0;
    public final xh9 E0;
    public final cy6 F0;
    
    public dh9(final String d0, final xh9 e0, final cy6 f0) {
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final fhp fhp = (fhp)o;
        czd.f((Object)fhp, "$this$semantics");
        final String d0 = this.D0;
        final coe<Object>[] a = chp.a;
        czd.f((Object)d0, "<set-?>");
        chp.d.a(fhp, (coe)chp.a[2], (Object)d0);
        if (this.E0.a.f() == hi9.E0) {
            chp.b(fhp, (nsb)new ch9(this.E0, this.F0));
        }
        return fzv.a;
    }
}
