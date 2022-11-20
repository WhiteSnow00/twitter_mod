import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dux
{
    public static dux b;
    public nrj a;
    
    static {
        dux.b = new dux();
    }
    
    public dux() {
        this.a = null;
    }
    
    public static nrj a(final Context context) {
        final dux b = dux.b;
        synchronized (b) {
            if (b.a == null) {
                Context applicationContext = context;
                if (context.getApplicationContext() != null) {
                    applicationContext = context.getApplicationContext();
                }
                b.a = new nrj(applicationContext);
            }
            return b.a;
        }
    }
}
