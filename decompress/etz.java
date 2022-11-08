import com.google.android.gms.cloudmessaging.zzq;
import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

public final class etz extends kuz<Void>
{
    public etz(final int n, final Bundle bundle) {
        super(n, 2, bundle);
    }
    
    public final void a(final Bundle bundle) {
        if (bundle.getBoolean("ack", false)) {
            this.d((Object)null);
            return;
        }
        this.c(new zzq("Invalid response to one way request", (Throwable)null));
    }
    
    public final boolean b() {
        return true;
    }
}
