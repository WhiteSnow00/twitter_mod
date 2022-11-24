import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class f2g implements eo6
{
    public final int F0;
    public final Object G0;
    
    public f2g(final Object g0, final int f0) {
        this.F0 = f0;
        this.G0 = g0;
    }
    
    public final vn6 c() {
        switch (this.F0) {
            default: {
                final vn6 vn6 = (vn6)this.G0;
                e0e.f((Object)vn6, "$content");
                return vn6;
            }
            case 0: {
                return (vn6)new e2g((Activity)this.G0);
            }
        }
    }
}
