import com.twitter.util.user.UserIdentifier;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fps extends d2v<tmi>
{
    public static final a Companion;
    public final String j1;
    public final Set<Long> k1;
    
    static {
        Companion = new a();
    }
    
    public fps(final UserIdentifier userIdentifier, final String j1, final Set<Long> k1) {
        czd.f((Object)userIdentifier, "owner");
        czd.f((Object)j1, "spaceId");
        czd.f((Object)k1, "recipients");
        super(userIdentifier, 0);
        this.j1 = j1;
        this.k1 = k1;
    }
    
    public final tqc f0() {
        final p6c a = w1e.A("audiospace_giveaway_tickets");
        a.p("audio_space_id", (Object)this.j1);
        a.p("ticket_receivers", (Object)this.k1);
        return (tqc)((n4j)a).e();
    }
    
    public final asc<tmi, kbv> g0() {
        return (asc<tmi, kbv>)v8g.d();
    }
    
    public static final class a
    {
    }
}
