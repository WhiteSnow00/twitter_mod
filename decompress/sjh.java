import java.util.Objects;
import java.util.HashMap;
import java.util.Map;
import android.util.Log;
import android.view.View;
import android.content.Context;
import com.twitter.util.user.UserIdentifier;
import androidx.fragment.app.p;

// 
// Decompiled by Procyon v0.6.0
// 

public final class sjh extends sjt implements q5q
{
    public static final String[] i;
    public final p f;
    public final dob g;
    public UserIdentifier h;
    
    static {
        i = new String[] { "can_moderate_replies_tooltip", "can_unmoderate_replies_tooltip", "moderate_replies_location_tooltip" };
    }
    
    public sjh(final dob g, final p f, final qdw qdw) {
        super((Context)g, qdw, f);
        this.g = g;
        this.f = f;
        this.h = null;
    }
    
    public final void c(final View view, final hp6 hp6) {
        final int id = view.getId();
        final boolean b = false;
        String s = null;
        Label_0077: {
            if (id != 2131432287 || hp6 == null || hp6.J() == UserIdentifier.getCurrent().getId()) {
                if (id == 2131430095) {
                    final UserIdentifier h = this.h;
                    if (h != null && UserIdentifier.isCurrentUser(h)) {
                        s = "moderate_replies_location_tooltip";
                        break Label_0077;
                    }
                }
                final StringBuilder sb = new StringBuilder();
                sb.append("Unable to present tooltip for View with ID: ");
                sb.append(id);
                Log.i("ModEduPresenter", sb.toString());
                return;
            }
            s = "can_moderate_replies_tooltip";
        }
        final UserIdentifier h2 = this.h;
        final boolean b2 = h2 != null && UserIdentifier.isCurrentUser(h2);
        int n = b ? 1 : 0;
        if (b2) {
            final boolean b3 = super.c.n() && this.k(s);
            n = (b ? 1 : 0);
            if (b3) {
                n = (b ? 1 : 0);
                if (ob.K(super.c.k())) {
                    n = 1;
                }
            }
        }
        if (n != 0) {
            view.setTag((Object)s);
            final njt$b h3 = this.h(s);
            if (flr.g((CharSequence)s)) {
                h3.g = s;
            }
            super.d = h3.d(this.f, s, true);
            this.m(s);
        }
    }
    
    public final Map<String, usa> e(final UserIdentifier userIdentifier) {
        final HashMap hashMap = new HashMap();
        hashMap.put("can_moderate_replies_tooltip", usa.d("can_moderate_replies_tooltip", userIdentifier));
        hashMap.put("can_unmoderate_replies_tooltip", usa.d("can_unmoderate_replies_tooltip", userIdentifier));
        hashMap.put("moderate_replies_location_tooltip", usa.d("moderate_replies_location_tooltip", userIdentifier));
        return hashMap;
    }
    
    public final njt$b h(final String s) {
        Objects.requireNonNull(s);
        final int hashCode = s.hashCode();
        int n = 0;
        int n2 = -1;
        switch (hashCode) {
            case 1796745759: {
                if (!s.equals("can_moderate_replies_tooltip")) {
                    break;
                }
                n2 = 2;
                break;
            }
            case 121837048: {
                if (!s.equals("can_unmoderate_replies_tooltip")) {
                    break;
                }
                n2 = 1;
                break;
            }
            case -759659636: {
                if (!s.equals("moderate_replies_location_tooltip")) {
                    break;
                }
                n2 = 0;
                break;
            }
        }
        int n3 = 0;
        switch (n2) {
            default: {
                throw new IllegalStateException("Couldn't create tooltip from Tooltip Name");
            }
            case 2: {
                n3 = 2131952372;
                break;
            }
            case 1: {
                n3 = 2131952373;
                break;
            }
            case 0: {
                n3 = 2131955109;
                n = 2131430095;
                break;
            }
        }
        final njt$b d2 = njt.d2(((Context)this.g).getApplicationContext(), n);
        d2.b(n3);
        d2.c = 2132018862;
        d2.d = (njt$c)this;
        d2.a(3);
        return d2;
    }
    
    public final String[] i() {
        return sjh.i;
    }
}
