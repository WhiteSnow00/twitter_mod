// 
// Decompiled by Procyon v0.6.0
// 

public final class vt2 implements myd
{
    public final /* synthetic */ int C0;
    public final Object D0;
    
    public vt2(final ot2 d0) {
        this.C0 = 0;
        zzd.f((Object)d0, "dispatcher");
        this.D0 = d0;
    }
    
    public vt2(final zml d0) {
        this.C0 = 1;
        zzd.f((Object)d0, "navigatorEvents");
        this.D0 = d0;
    }
    
    @Override
    public final boolean j() {
        switch (this.C0) {
            default: {
                ((zml)this.D0).onNext((Object)fdh.b.a);
                return true;
            }
            case 0: {
                ((ot2)this.D0).a.onNext((Object)ot2$a.c.a);
                return true;
            }
        }
    }
}
