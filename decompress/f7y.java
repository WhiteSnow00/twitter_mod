import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class f7y
{
    public static f7y b;
    public final whr a;
    
    public f7y(final Context context) {
        final whr a = whr.a(context);
        (this.a = a).b();
        a.c();
    }
    
    public static f7y a(final Context context) {
        synchronized (f7y.class) {
            final Context applicationContext = context.getApplicationContext();
            synchronized (f7y.class) {
                f7y b = f7y.b;
                if (b != null) {
                    monitorexit(f7y.class);
                }
                else {
                    b = (f7y.b = new f7y(applicationContext));
                }
                return b;
            }
        }
    }
    
    public final void b() {
        synchronized (this) {
            final whr a = this.a;
            a.a.lock();
            try {
                a.b.edit().clear().apply();
            }
            finally {
                a.a.unlock();
            }
        }
    }
}
