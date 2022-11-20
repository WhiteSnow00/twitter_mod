import com.twitter.util.user.UserIdentifier;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class i0c extends qqv
{
    public final i7w E1;
    public final g7c F1;
    
    public i0c(final Context context, final UserIdentifier userIdentifier, final int n, final yov yov, final String s, final pqv pqv, final i7w e1, final vav vav, final g7c f1) {
        super(context, userIdentifier, userIdentifier, 26, n, yov, s, pqv, vav);
        this.E1 = e1;
        if (ikr.b(e1.b, ".json")) {
            this.F1 = f1;
            return;
        }
        throw new IllegalArgumentException("jsonPath must point to a json resource");
    }
    
    @Override
    public final g7c B0() {
        return this.F1;
    }
    
    @Override
    public final boolean C0() {
        return false;
    }
    
    @Override
    public final boolean D0() {
        return true;
    }
    
    public final g7c r0() {
        return null;
    }
    
    public final zvl s0() {
        cj1.b(this.E1.b.startsWith("/2/") || this.E1.b.startsWith("/1.1/"));
        final zvl$a zvl$a = new zvl$a();
        zvl$a.a = this.E1.b;
        return (zvl)((n4j)zvl$a).e();
    }
    
    @Override
    public final boolean y0() {
        return false;
    }
    
    @Override
    public final boolean z0() {
        final int l1 = super.l1;
        boolean b = true;
        if (l1 != 1) {
            b = (l1 == 2 && b);
        }
        return b;
    }
}
