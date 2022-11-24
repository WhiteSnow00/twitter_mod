import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kyz extends wvz<Bundle>
{
    public kyz(final int n, final Bundle bundle) {
        super(n, 1, bundle);
    }
    
    public final void a(Bundle bundle) {
        if ((bundle = bundle.getBundle("data")) == null) {
            bundle = Bundle.EMPTY;
        }
        this.d((Object)bundle);
    }
    
    public final boolean b() {
        return false;
    }
}
