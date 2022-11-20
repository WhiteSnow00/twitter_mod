import android.os.BaseBundle;
import android.os.Parcelable;
import android.os.Bundle;
import com.google.android.gms.common.api.a$f;
import com.google.android.gms.common.api.c$c;
import com.google.android.gms.common.api.c$b;
import android.os.Looper;
import android.content.Context;
import com.google.android.gms.common.api.a$a;

// 
// Decompiled by Procyon v0.6.0
// 

public final class z0y extends a$a<i6q, l6q>
{
    public final a$f c(final Context context, final Looper looper, final gg4 gg4, final Object o, final c$b c$b, final c$c c$c) {
        final l6q l6q = (l6q)o;
        final Integer i = gg4.i;
        final Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", (Parcelable)gg4.a);
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
        return (a$f)new i6q(context, looper, gg4, bundle, c$b, c$c);
    }
}
