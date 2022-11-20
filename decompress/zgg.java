// 
// Decompiled by Procyon v0.6.0
// 

public final class zgg implements ftb
{
    public final int D0;
    public final Object E0;
    
    public zgg(final Object e0, final int d0) {
        this.D0 = d0;
        this.E0 = e0;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        switch (this.D0) {
            default: {
                final adw adw = (adw)this.E0;
                final mzu mzu = (mzu)o;
                final Integer n = (Integer)o2;
                final wzv v1 = mzu.a.D0.v1;
                return v1 != null && v1.a(adw.k().getId());
            }
            case 0: {
                ((chg)this.E0).a5((kbg)o, (cgv)o2);
                return fzv.a;
            }
        }
    }
}
