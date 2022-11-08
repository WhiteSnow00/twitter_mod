import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ot9 extends i1v<pmi>
{
    public static final ot9.ot9$a Companion;
    public final UserIdentifier i1;
    public final String j1;
    
    static {
        Companion = new ot9.ot9$a();
    }
    
    public ot9(final UserIdentifier i1, final String j1) {
        zzd.f((Object)i1, "userIdentifier");
        zzd.f((Object)j1, "pronouns");
        super(i1, 0);
        this.i1 = i1;
        this.j1 = j1;
    }
    
    @Override
    public final qrc f0() {
        final o7c e = q1a.e("user_pronouns_put");
        e.p("user_id", this.i1.getStringId());
        e.p("pronouns", this.j1);
        return (qrc)e.e();
    }
    
    @Override
    public final wsc<pmi, pav> g0() {
        return (wsc<pmi, pav>)xha.d(d8c.Companion);
    }
}
