import com.twitter.util.user.UserIdentifier;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class eri extends v09
{
    public eri(final Context context, final UserIdentifier userIdentifier) {
        super(userIdentifier);
    }
    
    @Override
    public final kmm b(final nws nws, final iva iva, final Boolean b) {
        if (nws instanceof yzs) {
            final nsi i = ((yzs)nws).k.i;
            String e = "";
            String f;
            if (i != null) {
                e = i.e;
                f = i.f;
            }
            else {
                f = "";
            }
            if (iva.e.isEmpty() && !b && !e.isEmpty()) {
                return (kmm)new qmb(super.a, e, nws, "DISLIKE");
            }
            if (iva.e.isEmpty() && !f.isEmpty()) {
                return (kmm)new qmb(super.a, f, nws, "REVERTED_DISLIKE");
            }
        }
        return super.b(nws, iva, b);
    }
}
