// 
// Decompiled by Procyon v0.6.0
// 

public final class lkk extends gue implements rtb<gq2, oyv>
{
    public final /* synthetic */ rtb<Long, oyv> C0;
    public final /* synthetic */ fq2 D0;
    
    public lkk(final rtb<? super Long, oyv> c0, final fq2 d0) {
        this.C0 = (rtb<Long, oyv>)c0;
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final gq2 gq2 = (gq2)o;
        zzd.f((Object)gq2, "it");
        final rtb<Long, oyv> c0 = this.C0;
        Long value;
        if (gq2.f) {
            value = this.D0.a();
        }
        else {
            value = null;
        }
        c0.invoke((Object)value);
        return oyv.a;
    }
}
