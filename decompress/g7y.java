import android.os.BaseBundle;
import android.os.IInterface;
import android.os.IBinder;
import java.util.Objects;
import android.os.Bundle;
import com.google.android.gms.common.api.c;
import android.os.Looper;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class g7y extends g5c<o7y>
{
    public final f51$a i1;
    
    public g7y(final Context context, final Looper looper, final fh4 fh4, final f51$a f51$a, final c.b b, final c.c c) {
        super(context, looper, 68, fh4, (nh6)b, (chj)c);
        f51$a e0 = f51$a;
        if (f51$a == null) {
            e0 = f51$a.E0;
        }
        final f51.f51$a.a a = new f51.f51$a.a(e0);
        a.b = t5y.a();
        this.i1 = new f51$a(a);
    }
    
    public final Bundle B() {
        final f51$a i1 = this.i1;
        Objects.requireNonNull(i1);
        final Bundle bundle = new Bundle();
        ((BaseBundle)bundle).putString("consumer_package", (String)null);
        bundle.putBoolean("force_save_dialog", i1.C0);
        ((BaseBundle)bundle).putString("log_session_id", i1.D0);
        return bundle;
    }
    
    public final String E() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }
    
    public final String F() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }
    
    public final int r() {
        return 12800000;
    }
}
