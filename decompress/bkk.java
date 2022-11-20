import androidx.fragment.app.Fragment;
import android.os.BaseBundle;
import androidx.fragment.app.Fragment$InstantiationException;
import android.os.Parcelable;
import android.os.Bundle;
import com.twitter.revenue.api.PlayableContentArgs;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bkk implements akk
{
    public final void a(final cnb cnb, final vn vn, final PlayableContentArgs playableContentArgs) {
        czd.f((Object)cnb, "fragmentActivity");
        czd.f((Object)vn, "activityOrientationViewDelegate");
        vn.a.setRequestedOrientation(1);
        final Bundle bundle = new Bundle();
        ((BaseBundle)bundle).putInt("twitter:id", 100);
        ((BaseBundle)bundle).putString("website_url", playableContentArgs.getUrl());
        ((BaseBundle)bundle).putString("thumbnail_url", playableContentArgs.getThumbnailUrl());
        ((BaseBundle)bundle).putString("title", playableContentArgs.getTitle());
        bundle.putByteArray("app_store_data", klp.e((Object)playableContentArgs.getAppStoreData(), (rlp)lo0.o));
        final faa sourceComponent = playableContentArgs.getSourceComponent();
        final lw6$h a = lw6.a;
        bundle.putByteArray("source_component", klp.e((Object)sourceComponent, (rlp)new mw6((Class)faa.class)));
        bundle.putParcelable("browser_data_source", (Parcelable)playableContentArgs.getBrowserDataSource());
        bundle.putByteArray("scribe_association", klp.e((Object)playableContentArgs.getScribeAssociation(), (rlp)efv.i));
        bundle.putByteArray("button", klp.e((Object)playableContentArgs.getButton(), (rlp)s33.a));
        if (((BaseBundle)bundle).containsKey("twitter:id")) {
            final wjk wjk = new wjk();
            ((Fragment)wjk).N1(bundle);
            final int a2 = c5j.a;
            ((wk1)wjk).e2(cnb.P(), null);
            return;
        }
        throw new Fragment$InstantiationException("Missing fragment id", (Exception)null);
    }
}
