import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class e3y implements bg1$a
{
    public final t5c a;
    
    public e3y(final t5c a) {
        this.a = a;
    }
    
    public final void a(final boolean b) {
        final d6y s0 = this.a.S0;
        ((Handler)s0).sendMessage(((Handler)s0).obtainMessage(1, (Object)b));
    }
}
