// 
// Decompiled by Procyon v0.6.0
// 

public final class yj4 extends gue implements rtb<snj<Boolean>, oyv>
{
    public final /* synthetic */ xj4 C0;
    
    public yj4(final xj4 c0) {
        this.C0 = c0;
        super(1);
    }
    
    public final Object invoke(Object c) {
        final snj snj = (snj)c;
        zzd.f((Object)snj, "isEnabledOptional");
        if (snj.f()) {
            c = snj.c();
            zzd.e(c, "isEnabledOptional.get()");
            if (c) {
                this.C0.K0 = true;
                if (!zi8.E()) {
                    final gk4 h0 = this.C0.H0;
                    if (h0 != null) {
                        h0.a();
                    }
                }
            }
        }
        return oyv.a;
    }
}
