import android.app.PendingIntent;
import android.os.IInterface;
import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class c9y extends jny<Boolean>
{
    public final int d;
    public final Bundle e;
    public final /* synthetic */ fm1 f;
    
    public c9y(final fm1 f, final int d, final Bundle e) {
        this.f = f;
        super(f);
        this.d = d;
        this.e = e;
    }
    
    public final void a() {
        if (this.d == 0) {
            if (!this.e()) {
                this.f.N(1, null);
                this.d(new ph6(8, (PendingIntent)null, (String)null));
            }
            return;
        }
        this.f.N(1, null);
        final Bundle e = this.e;
        PendingIntent pendingIntent;
        if (e != null) {
            pendingIntent = (PendingIntent)e.getParcelable("pendingIntent");
        }
        else {
            pendingIntent = null;
        }
        this.d(new ph6(this.d, pendingIntent, (String)null));
    }
    
    @Override
    public final void b() {
    }
    
    public abstract void d(final ph6 p0);
    
    public abstract boolean e();
}
