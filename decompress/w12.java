import com.twitter.async.http.HttpRequestResultException;
import kotlin.NoWhenBranchMatchedException;
import com.twitter.util.user.UserIdentifier;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class w12 extends enm<n12, cgv$b, t12>
{
    public final Context E0;
    public final UserIdentifier F0;
    
    public w12(final Context e0, final UserIdentifier f0) {
        czd.f((Object)e0, "context");
        czd.f((Object)f0, "owner");
        super((trc)null, 1, (rf8)null);
        this.E0 = e0;
        this.F0 = f0;
    }
    
    public final orc c(final Object o) {
        final n12 n12 = (n12)o;
        czd.f((Object)n12, "action");
        final Context e0 = this.E0;
        final UserIdentifier f0 = this.F0;
        final long a = n12.a;
        int n13;
        if (n12 instanceof n12.a) {
            n13 = 1;
        }
        else {
            if (!(n12 instanceof n12.b)) {
                throw new NoWhenBranchMatchedException();
            }
            n13 = 3;
        }
        return (orc)new t12(e0, f0, a, (uil)null, n13);
    }
    
    public final Object d(final orc orc) {
        final t12 t12 = (t12)orc;
        czd.f((Object)t12, "request");
        final cgv$b cgv$b = (cgv$b)((orc)t12).T().g;
        if (cgv$b != null) {
            return cgv$b;
        }
        throw HttpRequestResultException.a(((orc)t12).T());
    }
}
