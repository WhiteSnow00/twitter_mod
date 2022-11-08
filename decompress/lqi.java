import android.app.Notification$BigTextStyle;
import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lqi extends rqi
{
    public CharSequence e;
    
    public final void a(final Bundle bundle) {
        super.a(bundle);
    }
    
    public final void b(final npi npi) {
        final Notification$BigTextStyle bigText = new Notification$BigTextStyle(((sqi)npi).b).setBigContentTitle(super.b).bigText(this.e);
        if (super.d) {
            bigText.setSummaryText(super.c);
        }
    }
    
    public final String f() {
        return "androidx.core.app.NotificationCompat$BigTextStyle";
    }
    
    public final lqi k(final CharSequence charSequence) {
        this.e = mqi.d(charSequence);
        return this;
    }
}
