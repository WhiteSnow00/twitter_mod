import androidx.fragment.app.Fragment;
import android.os.BaseBundle;
import androidx.fragment.app.Fragment$InstantiationException;
import android.os.Parcelable;
import android.os.Bundle;
import com.twitter.revenue.api.PlayableContentArgs;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rkk implements qkk
{
    public final void a(final dob dob, final zn zn, final PlayableContentArgs playableContentArgs) {
        e0e.f((Object)dob, "fragmentActivity");
        e0e.f((Object)zn, "activityOrientationViewDelegate");
        zn.a.setRequestedOrientation(1);
        final Bundle bundle = new Bundle();
        ((BaseBundle)bundle).putInt("twitter:id", 100);
        ((BaseBundle)bundle).putString("website_url", playableContentArgs.getUrl());
        ((BaseBundle)bundle).putString("thumbnail_url", playableContentArgs.getThumbnailUrl());
        ((BaseBundle)bundle).putString("title", playableContentArgs.getTitle());
        bundle.putByteArray("app_store_data", gmp.e((Object)playableContentArgs.getAppStoreData(), (nmp)ko0.o));
        final mba sourceComponent = playableContentArgs.getSourceComponent();
        final rx6$h a = rx6.a;
        bundle.putByteArray("source_component", gmp.e((Object)sourceComponent, (nmp)new sx6((Class)mba.class)));
        bundle.putParcelable("browser_data_source", (Parcelable)playableContentArgs.getBrowserDataSource());
        bundle.putByteArray("scribe_association", gmp.e((Object)playableContentArgs.getScribeAssociation(), (nmp)sfv.i));
        bundle.putByteArray("button", gmp.e((Object)playableContentArgs.getButton(), (nmp)l43.a));
        if (((BaseBundle)bundle).containsKey("twitter:id")) {
            final mkk mkk = new mkk();
            ((Fragment)mkk).N1(bundle);
            final int a2 = o5j.a;
            ((bl1)mkk).e2(dob.P(), (String)null);
            return;
        }
        throw new Fragment$InstantiationException("Missing fragment id", (Exception)null);
    }
}
