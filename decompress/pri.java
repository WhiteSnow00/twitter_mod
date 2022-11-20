import java.util.Map;
import com.twitter.util.user.UserIdentifier;
import androidx.fragment.app.p;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pri extends ajt
{
    public static final String[] I0;
    
    static {
        I0 = new String[] { "not_followed_filter" };
    }
    
    public pri(final Context context, final adw adw, final p p3) {
        super(context, adw, p3);
    }
    
    public final Map<String, mra> d(final UserIdentifier userIdentifier) {
        final kdd$b d0 = kdd.D0;
        final int a = c5j.a;
        return (Map<String, mra>)d0;
    }
    
    public final vit$b h(final String s) {
        if ("not_followed_filter".equals(s)) {
            final Context d0 = super.D0;
            final String string = d0.getString(2131955464);
            final int l1 = vit.L1;
            final vit$b vit$b = new vit$b(d0, string);
            vit$b.b(2131955465);
            vit$b.d = (vit$c)this;
            vit$b.a(0);
            return vit$b;
        }
        final IllegalStateException ex = new IllegalStateException(hmg.h("Couldn't create tooltip from Tooltip Name : ", s));
        m8a.d((Throwable)ex);
        throw ex;
    }
    
    public final String[] i() {
        return pri.I0;
    }
}
