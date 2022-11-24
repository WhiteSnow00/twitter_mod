// 
// Decompiled by Procyon v0.6.0
// 

public final class gkb implements yzr
{
    public final int F0;
    public final Object G0;
    
    public gkb(final Object g0, final int f0) {
        this.F0 = f0;
        this.G0 = g0;
    }
    
    public final Object get() {
        switch (this.F0) {
            default: {
                final bh5 bh5 = (bh5)this.G0;
                e0e.f((Object)bh5, "this$0");
                return ((xus)bh5).e1();
            }
            case 2: {
                final kt1 kt1 = (kt1)this.G0;
                e0e.f((Object)kt1, "$batteryUsage");
                return kyv.Companion.a(kt1.a());
            }
            case 1: {
                return ((xus)this.G0).e1();
            }
            case 0: {
                return ((hkb)this.G0).e1();
            }
        }
    }
}
