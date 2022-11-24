import android.util.Log;
import com.google.android.gms.common.api.c$c;
import com.google.android.gms.common.api.c$b;
import android.os.Looper;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class eiy extends qlz
{
    public final mgy n1;
    
    public eiy(final Context context, final Looper looper, final c$b c$b, final c$c c$c, final lh4 lh4) {
        super(context, looper, c$b, c$c, lh4);
        this.n1 = new mgy(context, super.m1);
    }
    
    public final void o() {
        synchronized (this.n1) {
            if (((gm1)this).b()) {
                try {
                    this.n1.a();
                    this.n1.c();
                }
                catch (final Exception ex) {
                    Log.e("LocationClientImpl", "Client disconnected before listeners could be cleaned up", (Throwable)ex);
                }
            }
            super.o();
        }
    }
}
