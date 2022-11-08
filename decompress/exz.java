import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class exz implements go0
{
    public final luz a;
    public final zmz b;
    
    public exz(final Context context) {
        final o5c b = o5c.b;
        this.a = new luz(context, b);
        synchronized (zmz.class) {
            xd.u((Object)context, (Object)"Context must not be null");
            if (zmz.d == null) {
                zmz.d = new zmz(context.getApplicationContext());
            }
            final zmz d = zmz.d;
            monitorexit(zmz.class);
            this.b = d;
        }
    }
    
    public final zas<ho0> d() {
        return (zas<ho0>)this.a.d().l((zo6)new m90(this));
    }
}
