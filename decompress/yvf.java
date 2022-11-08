// 
// Decompiled by Procyon v0.6.0
// 

public final class yvf extends gue implements rtb<Boolean, oyv>
{
    public final /* synthetic */ awf C0;
    public final /* synthetic */ hfv D0;
    
    public yvf(final awf c0, final hfv d0) {
        this.C0 = c0;
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final Boolean b = (Boolean)o;
        final awf c0 = this.C0;
        zzd.e((Object)b, "blocked");
        awf.a(c0, (boolean)b, this.D0);
        return oyv.a;
    }
}
