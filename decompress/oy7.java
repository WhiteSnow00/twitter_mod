// 
// Decompiled by Procyon v0.6.0
// 

public final class oy7 extends gue implements rtb<wx7$g, oyv>
{
    public final /* synthetic */ zml<wz7> C0;
    
    public oy7(final zml<wz7> c0) {
        this.C0 = c0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final wx7$g wx7$g = (wx7$g)o;
        zzd.f((Object)wx7$g, "person");
        this.C0.onNext((Object)new wz7$c((wx7$e)wx7$g));
        return oyv.a;
    }
}
