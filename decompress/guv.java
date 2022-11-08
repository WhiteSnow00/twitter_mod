// 
// Decompiled by Procyon v0.6.0
// 

public final class guv extends gue implements rtb<Throwable, oyv>
{
    public final /* synthetic */ huv C0;
    public final /* synthetic */ p8v<?> D0;
    
    public guv(final huv c0, final p8v<?> d0) {
        this.C0 = c0;
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final Throwable t = (Throwable)o;
        final huv c0 = this.C0;
        final p8v<?> d0 = this.D0;
        zzd.e((Object)d0, "twitterBluePreference");
        c0.a.b(d0.getKey(), d0.getValue().toString(), false);
        this.C0.c.f(t);
        return oyv.a;
    }
}
