import java.util.Map;
import com.twitter.util.user.UserIdentifier;
import androidx.fragment.app.p;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fsi extends sjt
{
    public static final String[] f;
    
    static {
        f = new String[] { "not_followed_filter" };
    }
    
    public fsi(final Context context, final qdw qdw, final p p3) {
        super(context, qdw, p3);
    }
    
    public final Map<String, usa> e(final UserIdentifier userIdentifier) {
        final ked$b f0 = ked.F0;
        final int a = o5j.a;
        return (Map<String, usa>)f0;
    }
    
    public final njt$b h(final String s) {
        if ("not_followed_filter".equals(s)) {
            final Context a = super.a;
            final String string = a.getString(2131955464);
            final int n1 = njt.N1;
            final njt$b njt$b = new njt$b(a, string);
            njt$b.b(2131955465);
            njt$b.d = (njt$c)this;
            njt$b.a(0);
            return njt$b;
        }
        final IllegalStateException ex = new IllegalStateException(mqb.l("Couldn't create tooltip from Tooltip Name : ", s));
        r9a.d((Throwable)ex);
        throw ex;
    }
    
    public final String[] i() {
        return fsi.f;
    }
}
