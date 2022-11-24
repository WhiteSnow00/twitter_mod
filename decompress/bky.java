import java.util.ArrayList;
import android.os.Bundle;
import java.util.Objects;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Looper;
import android.content.IntentFilter;
import android.content.Context;
import android.os.Handler;
import java.util.concurrent.Executor;
import com.google.android.play.core.assetpacks.AssetPackState;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bky extends loy<AssetPackState>
{
    public final tuy g;
    public final zqy h;
    public final nry<w100> i;
    public final ony j;
    public final mry k;
    public final nry<Executor> l;
    public final nry<Executor> m;
    public final wyy n;
    public final Handler o;
    
    public bky(final Context context, final tuy g, final zqy h, final nry<w100> i, final mry k, final ony j, final nry<Executor> l, final nry<Executor> m, final wyy n) {
        super(new h4a("AssetPackServiceListenerRegistry"), new IntentFilter("com.google.android.play.core.assetpacks.receiver.ACTION_SESSION_UPDATE"), context);
        this.o = new Handler(Looper.getMainLooper());
        this.g = g;
        this.h = h;
        this.i = i;
        this.k = k;
        this.j = j;
        this.l = l;
        this.m = m;
        this.n = n;
    }
    
    @Override
    public final void a(final Context context, final Intent intent) {
        final Bundle bundleExtra = intent.getBundleExtra("com.google.android.play.core.assetpacks.receiver.EXTRA_SESSION_STATE");
        if (bundleExtra == null) {
            super.a.j("Empty bundle received from broadcast.", new Object[0]);
            return;
        }
        final ArrayList stringArrayList = bundleExtra.getStringArrayList("pack_names");
        if (stringArrayList != null && stringArrayList.size() == 1) {
            final AssetPackState i = AssetPackState.i(bundleExtra, (String)stringArrayList.get(0), this.k, this.n, (pky)tqb.U0);
            super.a.i("ListenerRegistryBroadcastReceiver.onReceive: %s", i);
            if (bundleExtra.getParcelable("confirmation_intent") != null) {
                Objects.requireNonNull(this.j);
            }
            ((Executor)this.m.a()).execute(new ljz(this, bundleExtra, i));
            ((Executor)this.l.a()).execute((Runnable)new g4y((Object)this, (Object)bundleExtra, 3, (j98)null));
            return;
        }
        super.a.j("Corrupt bundle received from broadcast.", new Object[0]);
    }
}
