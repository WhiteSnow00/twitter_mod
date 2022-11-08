import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rlq extends i1v<pmi>
{
    public static final rlq.rlq$a Companion;
    public final String i1;
    
    static {
        Companion = new rlq.rlq$a();
    }
    
    public rlq(final UserIdentifier userIdentifier, final String i1) {
        zzd.f((Object)userIdentifier, "owner");
        zzd.f((Object)i1, "userId");
        super(userIdentifier, 0);
        this.i1 = i1;
    }
    
    @Override
    public final qrc f0() {
        final o7c e = q1a.e("user_with_profile_space_device_follow");
        e.p("user_id", this.i1);
        return (qrc)e.e();
    }
    
    @Override
    public final wsc<pmi, pav> g0() {
        return (wsc<pmi, pav>)f9g.d();
    }
}
