import java.util.List;
import com.twitter.navigation.profile.ProfilePhotoPromptSuccess;
import android.view.View;
import com.twitter.navigation.composer.ComposerContentViewResult;
import com.twitter.util.user.UserIdentifier;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class xgj implements View$OnClickListener
{
    public final kn C0;
    public final UserIdentifier D0;
    public final String E0;
    public final xn6<o76, ComposerContentViewResult> F0;
    public final String G0;
    public final j99 H0;
    
    public xgj(final kn c0, final UserIdentifier d0, final String e0, final xn6<o76, ComposerContentViewResult> f0, final String g0, final j99 h0) {
        this.F0 = f0;
        this.C0 = c0;
        this.D0 = d0;
        this.E0 = e0;
        this.H0 = h0;
        this.G0 = g0;
    }
    
    public final void onClick(final View view) {
        final int id = view.getId();
        final List list = null;
        List<j99> v = null;
        if (id != 2131427752 && id != 2131430364) {
            String i = "";
            if (id == 2131432262) {
                final zf4 zf4 = new zf4(this.D0);
                zf4.q(new String[] { this.G0, null, null, null, "send_tweet" });
                saw.b((okm)zf4);
                final String e0 = this.E0;
                if (e0 != null) {
                    i = e0;
                }
                final j99 h0 = this.H0;
                if (h0 != null) {
                    v = ijf.v((Object)h0);
                }
                final ea9.b b = new ea9.b();
                b.i = i;
                b.o(v);
                r4w.a(this.D0).b((ea9)b.e());
                this.C0.c((vn6)ProfilePhotoPromptSuccess.INSTANCE);
            }
            else if (id == 2131428856) {
                final zf4 zf5 = new zf4(this.D0);
                zf5.q(new String[] { this.G0, null, null, "edit_button", "click" });
                saw.b((okm)zf5);
                final j99 h2 = this.H0;
                List v2 = list;
                if (h2 != null) {
                    v2 = ijf.v((Object)h2);
                }
                final String e2 = this.E0;
                if (e2 != null) {
                    i = e2;
                }
                final xn6<o76, ComposerContentViewResult> f0 = this.F0;
                final o76 o76 = new o76();
                o76.r(i, i.length());
                o76.j(v2);
                o76.o(this.G0);
                o76.q(true);
                f0.d(o76);
            }
        }
        else {
            final zf4 zf6 = new zf4(this.D0);
            zf6.q(new String[] { this.G0, null, null, null, "cancel" });
            saw.b((okm)zf6);
            this.C0.c((vn6)ProfilePhotoPromptSuccess.INSTANCE);
        }
    }
}
