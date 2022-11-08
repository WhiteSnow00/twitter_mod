// 
// Decompiled by Procyon v0.6.0
// 

public final class iy7 extends gue implements rtb<wx7, oyv>
{
    public final /* synthetic */ zml<wz7> C0;
    
    public iy7(final zml<wz7> c0) {
        this.C0 = c0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final wx7 wx7 = (wx7)o;
        zzd.f((Object)wx7, "withLink");
        this.C0.onNext((Object)new wz7$f((wx7$d)wx7));
        return oyv.a;
    }
}
