// 
// Decompiled by Procyon v0.6.0
// 

package androidx.work.impl.diagnostics;

import java.util.List;
import java.util.Collections;
import androidx.work.c;
import androidx.work.impl.workers.DiagnosticsWorker;
import java.util.Objects;
import android.content.Intent;
import android.content.Context;
import android.content.BroadcastReceiver;

public class DiagnosticsReceiver extends BroadcastReceiver
{
    public static final String a;
    
    static {
        a = y9g.g("DiagnosticsRcvr");
    }
    
    public final void onReceive(final Context context, final Intent intent) {
        if (intent == null) {
            return;
        }
        y9g.e().a(DiagnosticsReceiver.a, "Requesting diagnostics");
        try {
            final irx i = irx.i(context);
            Objects.requireNonNull(jlj.Companion);
            final jlj jlj = ((xrx.a<B, jlj>)new jlj.a((Class<? extends c>)DiagnosticsWorker.class)).b();
            Objects.requireNonNull(i);
            i.d(Collections.singletonList(jlj));
        }
        catch (final IllegalStateException ex) {
            y9g.e().d(DiagnosticsReceiver.a, "WorkManager is not initialized", (Throwable)ex);
        }
    }
}
