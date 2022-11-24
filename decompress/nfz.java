import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nfz implements dsy
{
    public final int F0;
    public final dsy G0;
    
    public nfz(final dsy g0, final int f0) {
        this.F0 = f0;
        this.G0 = g0;
    }
    
    public final /* bridge */ Object a() {
        switch (this.F0) {
            default: {
                return new xyz((Context)this.G0.a());
            }
            case 1: {
                return new xwy((dly)this.G0.a());
            }
            case 0: {
                final x2z x2z = (x2z)this.G0.a();
                vq9.u((Object)x2z);
                return x2z;
            }
        }
    }
}
