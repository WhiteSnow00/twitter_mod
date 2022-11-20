import android.app.Service;
import java.util.Map;
import android.content.Intent;
import android.os.Bundle;
import com.twitter.notification.push.NotificationService;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fui implements Runnable
{
    public final NotificationService D0;
    public final int E0;
    public final Bundle F0;
    public final String G0;
    public final Intent H0;
    
    public fui(final NotificationService d0, final int e0, final Bundle f0, final String g0, final Intent h0) {
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
    }
    
    @Override
    public final void run() {
        final NotificationService d0 = this.D0;
        final int e0 = this.E0;
        final Bundle f0 = this.F0;
        final String g0 = this.G0;
        final Intent h0 = this.H0;
        final Map s0 = NotificationService.S0;
        ((Service)d0).stopSelf(e0);
        d0.c(f0, false, false);
        d0.b(d0.D0, f0, g0, h0);
    }
}
