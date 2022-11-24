import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fha implements wzr
{
    public final Context F0;
    
    public fha(final Context f0) {
        this.F0 = f0;
    }
    
    public final Object get() {
        final Context f0 = this.F0;
        final nbm n = wf8.n;
        synchronized (wf8.class) {
            if (wf8.t == null) {
                wf8.t = new wf8.b(f0).a();
            }
            return wf8.t;
        }
    }
}
