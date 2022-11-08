import java.util.Objects;
import java.util.HashMap;
import java.util.Map;
import com.twitter.util.user.UserIdentifier;
import androidx.fragment.app.p;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bfx extends kit
{
    public bfx(final Context context, final ocw ocw, final p p3) {
        super(context, ocw, p3);
    }
    
    public final Map<String, psa> e(final UserIdentifier userIdentifier) {
        final HashMap hashMap = new HashMap();
        hashMap.put("dockIconTooltip", psa.d("dockIconTooltip", userIdentifier));
        hashMap.put("videoSettingsToolTip", psa.d("videoSettingsToolTip", userIdentifier));
        return hashMap;
    }
    
    public final fit$b h(final String s) {
        Objects.requireNonNull(s);
        int n;
        int n2;
        if (!s.equals("videoSettingsToolTip")) {
            if (!s.equals("dockIconTooltip")) {
                throw new IllegalStateException("Couldn't create tooltip from Tooltip Name");
            }
            n = 2131954178;
            n2 = 2131430010;
        }
        else {
            n = 2131954179;
            n2 = 2131432565;
        }
        final fit$b d2 = fit.d2(super.a, n2);
        d2.b(n);
        d2.c = 2132017709;
        d2.d = (fit$c)this;
        d2.a(1);
        return d2;
    }
    
    public final String[] i() {
        return new String[] { "dockIconTooltip", "videoSettingsToolTip" };
    }
    
    public final void l(final String s) {
        if (super.c.n() && this.k("dockIconTooltip")) {
            super.l("dockIconTooltip");
        }
    }
    
    public final void m(final String s) {
        super.m(s);
    }
}
