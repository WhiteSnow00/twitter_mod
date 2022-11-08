import android.os.BaseBundle;
import android.os.Parcelable;
import android.os.Bundle;
import com.google.android.gms.common.api.c;
import android.os.Looper;
import android.content.Context;
import com.google.android.gms.common.api.a;

// 
// Decompiled by Procyon v0.6.0
// 

public final class j0y extends a<q5q, t5q>
{
    @Override
    public final com.google.android.gms.common.api.a.f c(final Context context, final Looper looper, final fh4 fh4, final Object o, final c.b b, final c.c c) {
        final t5q t5q = (t5q)o;
        final Integer i = fh4.i;
        final Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", (Parcelable)fh4.a);
        if (i != null) {
            ((BaseBundle)bundle).putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", (int)i);
        }
        bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
        bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
        ((BaseBundle)bundle).putString("com.google.android.gms.signin.internal.serverClientId", (String)null);
        bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
        bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
        ((BaseBundle)bundle).putString("com.google.android.gms.signin.internal.hostedDomain", (String)null);
        ((BaseBundle)bundle).putString("com.google.android.gms.signin.internal.logSessionId", (String)null);
        bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
        return (com.google.android.gms.common.api.a.f)new q5q(context, looper, fh4, bundle, b, c);
    }
}
