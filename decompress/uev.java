import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class uev extends msc
{
    public final hni a;
    public final b4j b;
    
    public uev(final hni a, final b4j b) {
        this.a = a;
        this.b = b;
    }
    
    public static uev c() {
        return go9.i().o0();
    }
    
    public final void a(final asc asc, final long n, final UserIdentifier userIdentifier) {
        final vev e = this.a.e(userIdentifier);
        if (userIdentifier.isRegularUser() && e == null) {
            final dda a = ksc.a;
            if (jba.t("scribe_http_operation_oauth_event_sample_size", nso.b).b()) {
                sbw.b((tlm)new fg4(userIdentifier, a));
            }
        }
        this.b.P(asc, e, n);
    }
    
    public final boolean b(final UserIdentifier userIdentifier) {
        return this.a.e(userIdentifier) != null;
    }
}
