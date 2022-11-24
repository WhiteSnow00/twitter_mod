import android.content.Intent;
import java.util.concurrent.Executor;
import java.util.Objects;
import android.util.Log;
import android.os.Process;
import android.os.Binder;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mrx extends Binder
{
    public static final int b = 0;
    public final a a;
    
    public mrx(final a a) {
        this.a = a;
    }
    
    public final void a(final nrx$a nrx$a) {
        if (Binder.getCallingUid() == Process.myUid()) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "service received new intent via bind strategy");
            }
            final a a = this.a;
            final Intent a2 = nrx$a.a;
            final h5a a3 = ((h5a.h5a$a)a).a;
            Objects.requireNonNull(a3);
            final rcs rcs = new rcs();
            a3.F0.execute((Runnable)new jtl((Object)a3, (Object)a2, (Object)rcs, 2));
            rcs.a.v((Executor)g5a.H0, (uhj<TResult>)new pn1((Object)nrx$a, 4));
            return;
        }
        throw new SecurityException("Binding only allowed within app");
    }
    
    public interface a
    {
    }
}
