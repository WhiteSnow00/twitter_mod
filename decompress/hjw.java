import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hjw extends d2v<tmi>
{
    public static final hjw.hjw$a Companion;
    public final boolean j1;
    
    static {
        Companion = new hjw.hjw$a();
    }
    
    public hjw(final UserIdentifier userIdentifier, final boolean j1) {
        czd.f((Object)userIdentifier, "owner");
        super(userIdentifier, 0);
        this.j1 = j1;
    }
    
    public final tqc f0() {
        final p6c a = w1e.A("user_sharing_listening_data_with_followers_settings_update");
        a.p("user_id", (Object)((anm)this).Q0.getStringId());
        a.p("sharing_listening_data_with_followers", (Object)this.j1);
        return (tqc)((n4j)a).e();
    }
    
    public final asc<tmi, kbv> g0() {
        return (asc<tmi, kbv>)new vge();
    }
}
