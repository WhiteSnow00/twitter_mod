import androidx.fragment.app.Fragment;
import android.net.Uri;
import androidx.preference.Preference;
import androidx.preference.Preference$e;

// 
// Decompiled by Procyon v0.6.0
// 

public final class wp9 implements Preference$e
{
    public final int F0;
    public final wp1 G0;
    
    public wp9(final wp1 g0, final int f0) {
        this.F0 = f0;
        this.G0 = g0;
    }
    
    public final boolean w0(final Preference preference) {
        switch (this.F0) {
            default: {
                final pvm pvm = (pvm)this.G0;
                final pvm$a companion = pvm.Companion;
                e0e.f((Object)pvm, "this$0");
                pvm.b2.d("get_support");
                final fci h = ((bod)pvm).v0().h();
                final String w0 = ((Fragment)pvm).W0(2131959246);
                e0e.e((Object)w0, "getString(R.string.twitter_blue_support_url)");
                final Uri parse = Uri.parse(w0);
                e0e.e((Object)parse, "parse(this)");
                h.d((cn)new mnx(parse));
                return true;
            }
            case 1: {
                final bgi bgi = (bgi)this.G0;
                final bgi$a companion2 = bgi.Companion;
                e0e.f((Object)bgi, "this$0");
                bgi.c2.a("news", "ad_free_articles_help");
                final fci h2 = ((bod)bgi).v0().h();
                final String w2 = ((Fragment)bgi).W0(2131951857);
                e0e.e((Object)w2, "getString(R.string.ad_free_help_center_url)");
                final Uri parse2 = Uri.parse(w2);
                e0e.e((Object)parse2, "parse(this)");
                h2.d((cn)new mnx(parse2));
                return true;
            }
            case 0: {
                final xp9 xp9 = (xp9)this.G0;
                final xp9$a companion3 = xp9.Companion;
                e0e.f((Object)xp9, "this$0");
                xp9.b2.a("early_access", "bookmark_folders");
                ((bod)xp9).v0().h().d((cn)new g52.a().e());
                return true;
            }
        }
    }
}
