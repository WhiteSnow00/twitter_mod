import java.util.Iterator;
import java.util.Map;
import com.twitter.util.user.UserIdentifier;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class k84
{
    public final Context a;
    public final psc b;
    public final gew c;
    public final cfw<tnl> d;
    public final zxi e;
    
    public k84(final Context a, final psc b, final gew c, final cfw<tnl> d, final zxi e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public final void a(final String s) {
        for (final UserIdentifier userIdentifier : this.c.d()) {
            final tnl tnl = (tnl)((hyr)this.d).get((Object)userIdentifier);
            final cyi cyi = (cyi)this.e.a(userIdentifier).e();
            if (tnl.b()) {
                this.b.f((ksc)txi.o0(this.a, userIdentifier, cyi.a, (Map)cyi.b, s));
            }
        }
    }
}
