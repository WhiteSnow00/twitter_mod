import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class u93
{
    public final rrz a;
    public final Handler b;
    
    public u93(final rrz a, final Handler b) {
        this.a = a;
        this.b = b;
    }
    
    public final void a(final hkb$a hkb$a) {
        final int b = hkb$a.b;
        if (b == 0) {
            this.b.post((Runnable)new s93(this.a, hkb$a.a));
        }
        else {
            this.b.post((Runnable)new t93(this.a, b));
        }
    }
}
