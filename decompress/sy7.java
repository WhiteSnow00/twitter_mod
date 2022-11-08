// 
// Decompiled by Procyon v0.6.0
// 

public final class sy7 extends gue implements rtb<wx7$h, oyv>
{
    public final /* synthetic */ zml<j18> C0;
    
    public sy7(final zml<j18> c0) {
        this.C0 = c0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final wx7$h wx7$h = (wx7$h)o;
        zzd.f((Object)wx7$h, "it");
        this.C0.onNext((Object)new j18$c(wx7$h));
        return oyv.a;
    }
}
