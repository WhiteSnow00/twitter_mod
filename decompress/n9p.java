import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class n9p extends i1v<pmi>
{
    public static final n9p.n9p$a Companion;
    public final String i1;
    
    static {
        Companion = new n9p.n9p$a();
    }
    
    public n9p(final UserIdentifier userIdentifier, final String i1) {
        zzd.f((Object)userIdentifier, "owner");
        zzd.f((Object)i1, "query");
        super(userIdentifier, 0);
        this.i1 = i1;
    }
    
    @Override
    public final qrc f0() {
        final o7c e = q1a.e("search_unsubscribe");
        e.p("search_term", this.i1);
        return (qrc)e.e();
    }
    
    @Override
    public final wsc<pmi, pav> g0() {
        return (wsc<pmi, pav>)xha.d(d8c.Companion);
    }
}
