import android.os.BaseBundle;
import android.net.Uri;
import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zyd extends mdl
{
    public zyd(final Bundle bundle, final hfv hfv, final Uri uri, final int n, final Class<? extends wl1> clazz) {
        super(bundle, hfv, uri, (Class)clazz);
        ((BaseBundle)bundle).putInt("interstitial_type", n);
    }
}
