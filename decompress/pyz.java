import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pyz implements bo0
{
    public final xvz a;
    public final moz b;
    
    public pyz(final Context context) {
        final s5c b = s5c.b;
        this.a = new xvz(context, b);
        synchronized (moz.class) {
            iuk.D((Object)context, (Object)"Context must not be null");
            if (moz.d == null) {
                moz.d = new moz(context.getApplicationContext());
            }
            final moz d = moz.d;
            monitorexit(moz.class);
            this.b = d;
        }
    }
    
    public final mcs<co0> d() {
        return (mcs<co0>)this.a.d().l((lp6)new gdg(this));
    }
}
