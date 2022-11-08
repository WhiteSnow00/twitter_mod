import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class n9g extends i1v<pmi>
{
    public static final n9g.n9g$a Companion;
    
    static {
        Companion = new n9g.n9g$a();
    }
    
    public n9g(final UserIdentifier userIdentifier) {
        zzd.f((Object)userIdentifier, "owner");
        super(userIdentifier, 0);
    }
    
    @Override
    public final qrc f0() {
        final o7c e = q1a.e("logged_in_mr_by_id");
        e.p("user_ids", tdy.u0((Object)super.P0.getStringId()));
        return (qrc)e.e();
    }
    
    @Override
    public final wsc<pmi, pav> g0() {
        return (wsc<pmi, pav>)f9g.d();
    }
}
