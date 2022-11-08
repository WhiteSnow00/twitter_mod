import java.util.List;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import android.content.res.Resources;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gua implements uor
{
    public final Resources a;
    public final cor b;
    
    public gua(final Resources a, final cor b) {
        zzd.f((Object)a, "resources");
        zzd.f((Object)b, "subscriptionsFeatures");
        this.a = a;
        this.b = b;
    }
    
    public final n9q<Set<zmr>> a() {
        final cor$g companion = cor.Companion;
        Objects.requireNonNull(companion);
        final hlv b = dta.b();
        final boolean b2 = false;
        final boolean b3 = b.b("subscriptions_feature_labs_1003", false);
        final boolean f = this.b.f();
        final boolean b4 = this.b.b();
        final boolean b5 = this.b.e("subscriptions_feature_labs_1004", "client_feature_switch/subscriptions_feature_labs_1004/true") && cv9.Companion.a().t();
        int n = b2 ? 1 : 0;
        if (!oio.m()) {
            n = (b2 ? 1 : 0);
            if (companion.b()) {
                n = 1;
            }
        }
        n9q n9q;
        if (!b3 && !f && !b4 && !b5) {
            n9q = n9q.v((Object)f3a.C0);
        }
        else {
            final LinkedHashSet set = new LinkedHashSet();
            if (b3) {
                final String string = this.a.getString(2131954527);
                zzd.e((Object)string, "resources.getString(R.string.labs_nft_title)");
                set.add(new zmr("nftProfilePicture", string, this.a.getString(2131954526), (String)null, (String)null, false, (String)null, (Integer)null, (List)null, (juv)null, 1016));
            }
            if (f) {
                final String string2 = this.a.getString(2131954523);
                zzd.e((Object)string2, "resources.getString(R.st\u2026_long_video_upload_title)");
                set.add(new zmr("uploadLongerVideos", string2, this.a.getString(2131954522), (String)null, (String)null, false, (String)null, (Integer)null, (List)null, (juv)null, 1016));
            }
            if (b4) {
                final String string3 = this.a.getString(2131954513);
                zzd.e((Object)string3, "resources.getString(R.st\u2026.labs_1080p_upload_title)");
                set.add(new zmr("1080pVideoUpload", string3, this.a.getString(2131954512), (String)null, (String)null, false, "twitter://settings/data_usage", (Integer)null, (List)null, (juv)null, 952));
            }
            if (n != 0) {
                final String string4 = this.a.getString(2131952083);
                zzd.e((Object)string4, "resources.getString(R.st\u2026.audio_tab_feature_title)");
                set.add(new zmr("AudioTab", string4, this.a.getString(2131952082), (String)null, (String)null, false, (String)null, (Integer)null, (List)null, (juv)null, 1016));
            }
            if (b5) {
                final String string5 = this.a.getString(2131953764);
                zzd.e((Object)string5, "resources.getString(R.st\u2026edit_tweet_feature_title)");
                set.add(new zmr("editTweet", string5, this.a.getString(2131953763), (String)null, (String)null, false, (String)null, (Integer)null, (List)null, (juv)null, 1016));
            }
            n9q = n9q.v((Object)set);
        }
        return (n9q<Set<zmr>>)n9q;
    }
    
    public final boolean b(final String s) {
        return dta.b().b(s, false);
    }
    
    public final n9q<Set<zmr>> getSettings() {
        final boolean b = this.b("subscriptions_feature_1003");
        final boolean b2 = this.b("subscriptions_feature_1001");
        final boolean b3 = this.b("subscriptions_feature_1007");
        final boolean b4 = this.b("subscriptions_feature_1006");
        final boolean b5 = this.b("subscriptions_feature_1009");
        final boolean b6 = this.b("subscriptions_feature_1008");
        Object v;
        if (!b && !b2 && !b3 && !b4 && !b5 && !b6) {
            v = n9q.v((Object)f3a.C0);
        }
        else {
            v = new y9q((pbq)new fua(b, this, b2, b3, b5, b6));
        }
        return (n9q<Set<zmr>>)v;
    }
}
