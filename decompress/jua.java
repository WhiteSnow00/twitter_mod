import java.util.List;
import java.util.LinkedHashSet;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jua implements ddq
{
    public final boolean F0;
    public final kua G0;
    public final boolean H0;
    public final boolean I0;
    public final boolean J0;
    public final boolean K0;
    
    public jua(final boolean f0, final kua g0, final boolean h0, final boolean i0, final boolean j0, final boolean k0) {
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        this.J0 = j0;
        this.K0 = k0;
    }
    
    public final void o(final fcq fcq) {
        final boolean f0 = this.F0;
        final kua g0 = this.G0;
        final boolean h0 = this.H0;
        final boolean i0 = this.I0;
        final boolean j0 = this.J0;
        final boolean k0 = this.K0;
        e0e.f((Object)g0, "this$0");
        final mbq$a mbq$a = (mbq$a)fcq;
        if (!mbq$a.isDisposed()) {
            final LinkedHashSet set = new LinkedHashSet();
            if (f0) {
                final String string = g0.a.getString(2131959323);
                final String string2 = g0.a.getString(2131959325);
                final int drawableRes = jpc.I1.getDrawableRes();
                e0e.e((Object)string, "getString(R.string.undo_tweet)");
                set.add(new por("undo_tweet_settings", string, string2, (String)null, (String)null, false, "twitter://subscriptions/settings/undo-tweet?referring_page=settings", Integer.valueOf(drawableRes), (List)null, (pvv)null, 824));
            }
            if (h0) {
                final String string3 = g0.a.getString(2131951979);
                final String string4 = g0.a.getString(2131952013);
                final int drawableRes2 = jpc.G.getDrawableRes();
                e0e.e((Object)string3, "getString(R.string.app_icon)");
                set.add(new por("app_icon_settings", string3, string4, (String)null, (String)null, false, "twitter://subscriptions/settings/app-icon?referring_page=settings", Integer.valueOf(drawableRes2), (List)null, (pvv)null, 824));
            }
            if (i0) {
                final String string5 = g0.a.getString(2131958963);
                final String string6 = g0.a.getString(2131958965);
                final int drawableRes3 = jpc.O.getDrawableRes();
                e0e.e((Object)string5, "getString(R.string.top_articles_feature_title)");
                set.add(new por("top_articles_settings", string5, string6, (String)null, (String)null, false, "twitter://articles", Integer.valueOf(drawableRes3), (List)null, (pvv)null, 824));
            }
            if (j0) {
                final String string7 = g0.a.getString(2131954529);
                final String string8 = g0.a.getString(2131954528);
                final int drawableRes4 = jpc.S.getDrawableRes();
                e0e.e((Object)string7, "getString(R.string.labs_pref_title)");
                set.add(new por("labs_settings", string7, string8, (String)null, (String)null, false, "twitter://subscriptions/labs?referring_page=settings", Integer.valueOf(drawableRes4), (List)null, (pvv)null, 824));
            }
            if (k0) {
                final String string9 = g0.a.getString(2131952981);
                final String string10 = g0.a.getString(2131952983);
                final int drawableRes5 = jpc.d1.getDrawableRes();
                e0e.e((Object)string9, "getString(R.string.custom_navigation)");
                set.add(new por("tab_customization", string9, string10, (String)null, (String)null, false, "twitter://subscriptions/settings/custom-navigation", Integer.valueOf(drawableRes5), (List)null, (pvv)null, 824));
            }
            mbq$a.b((Object)set);
        }
    }
}
