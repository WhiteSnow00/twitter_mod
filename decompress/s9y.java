import android.app.PendingIntent;
import android.os.IInterface;
import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class s9y extends zny<Boolean>
{
    public final int d;
    public final Bundle e;
    public final bm1 f;
    
    public s9y(final bm1 f, final int d, final Bundle e) {
        super(this.f = f);
        this.d = d;
        this.e = e;
    }
    
    public final void a() {
        if (this.d == 0) {
            if (!this.e()) {
                this.f.N(1, (IInterface)null);
                this.d(new vg6(8, null, null));
            }
            return;
        }
        this.f.N(1, (IInterface)null);
        final Bundle e = this.e;
        PendingIntent pendingIntent;
        if (e != null) {
            pendingIntent = (PendingIntent)e.getParcelable("pendingIntent");
        }
        else {
            pendingIntent = null;
        }
        this.d(new vg6(this.d, pendingIntent, null));
    }
    
    public final void b() {
    }
    
    public abstract void d(final vg6 p0);
    
    public abstract boolean e();
}
