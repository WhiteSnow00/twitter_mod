import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zeo
{
    public final eps a;
    
    public zeo(final eps a) {
        czd.f((Object)a, "ticketGiveawayDataSource");
        this.a = a;
    }
    
    public final sy5 a(final String s, final Set<Long> set) {
        czd.f((Object)s, "roomId");
        czd.f((Object)set, "userIds");
        return (sy5)new iz5((lcq)((enm)this.a).R((Object)new eps$a(s, (Set)set)));
    }
}
