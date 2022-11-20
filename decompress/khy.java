import android.util.Log;
import com.google.android.gms.common.api.c$c;
import com.google.android.gms.common.api.c$b;
import android.os.Looper;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class khy extends rkz
{
    public final rfy l1;
    
    public khy(final Context context, final Looper looper, final c$b c$b, final c$c c$c, final gg4 gg4) {
        super(context, looper, c$b, c$c, gg4);
        this.l1 = new rfy(context, super.k1);
    }
    
    public final void o() {
        synchronized (this.l1) {
            if (((bm1)this).b()) {
                try {
                    this.l1.a();
                    this.l1.c();
                }
                catch (final Exception ex) {
                    Log.e("LocationClientImpl", "Client disconnected before listeners could be cleaned up", (Throwable)ex);
                }
            }
            super.o();
        }
    }
}
