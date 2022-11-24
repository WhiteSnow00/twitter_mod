import android.os.BaseBundle;
import java.util.Iterator;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.Context;
import com.google.android.play.core.install.InstallState;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bjy extends loy<InstallState>
{
    public bjy(final Context context) {
        super(new h4a("AppUpdateListenerRegistry"), new IntentFilter("com.google.android.play.core.install.ACTION_INSTALL_STATUS"), context);
    }
    
    @Override
    public final void a(final Context context, final Intent intent) {
        if (!context.getPackageName().equals(intent.getStringExtra("package.name"))) {
            super.a.i("ListenerRegistryBroadcastReceiver received broadcast for third party app: %s", intent.getStringExtra("package.name"));
            return;
        }
        super.a.i("List of extras in received intent:", new Object[0]);
        for (final String s : ((BaseBundle)intent.getExtras()).keySet()) {
            super.a.i("Key: %s; value: %s", s, ((BaseBundle)intent.getExtras()).get(s));
        }
        final h4a a = super.a;
        a.i("List of extras in received intent needed by fromUpdateIntent:", new Object[0]);
        a.i("Key: %s; value: %s", "install.status", intent.getIntExtra("install.status", 0));
        a.i("Key: %s; value: %s", "error.code", intent.getIntExtra("error.code", 0));
        final z9y z9y = new z9y(intent.getIntExtra("install.status", 0), intent.getLongExtra("bytes.downloaded", 0L), intent.getLongExtra("total.bytes.to.download", 0L), intent.getIntExtra("error.code", 0), intent.getStringExtra("package.name"));
        super.a.i("ListenerRegistryBroadcastReceiver.onReceive: %s", z9y);
        ((loy<z9y>)this).c(z9y);
    }
}
