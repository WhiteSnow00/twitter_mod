// 
// Decompiled by Procyon v0.6.0
// 

public final class pep extends gue implements rtb<sve, oyv>
{
    public final /* synthetic */ lep C0;
    
    public pep(final lep c0) {
        this.C0 = c0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final sve j = (sve)o;
        zzd.f((Object)j, "it");
        final lep c0 = this.C0;
        c0.j = j;
        if (c0.g() && c0.h() != null) {
            final qfj i = new qfj(m8y.y(j));
            if (!zzd.a((Object)c0.i, (Object)i)) {
                c0.i = i;
                c0.o();
                c0.r();
            }
        }
        return oyv.a;
    }
}
