import android.content.Intent;

// 
// Decompiled by Procyon v0.6.0
// 

public final class x4y extends z4y
{
    public final Intent F0;
    public final rbf G0;
    
    public x4y(final Intent f0, final rbf g0) {
        this.F0 = f0;
        this.G0 = g0;
    }
    
    public final void a() {
        final Intent f0 = this.F0;
        if (f0 != null) {
            this.G0.startActivityForResult(f0, 2);
        }
    }
}
