import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public enum kfk
{
    E0("no_type", (Class<? extends ifk$a>)null), 
    F0("dm_typing", (Class<? extends ifk$a>)wmv$a.class), 
    G0("dm_update", (Class<? extends ifk$a>)l49$a.class), 
    H0("tweet_engagement", (Class<? extends ifk$a>)p0c$a.class), 
    I0("live_content", (Class<? extends ifk$a>)p0c$a.class);
    
    public static final Set<kfk> J0;
    public static final Set<String> K0;
    public final String C0;
    public final Class<? extends ifk$a> D0;
    
    static {
        int i = 0;
        final kfk kfk2 = new kfk("config", (Class<? extends ifk$a>)nf6$a.class);
        final kfk kfk3 = new kfk("subscriptions", umr.a.class);
        final nmp x = nmp.x();
        final kfk kfk;
        x.q((Object[])new kfk[] { kfk, kfk2, kfk3 });
        J0 = (Set)((h4j)x).e();
        final nmp x2 = nmp.x();
        for (kfk[] values = values(); i < values.length; ++i) {
            final kfk kfk4 = values[i];
            if (kfk4.D0 == p0c$a.class) {
                x2.o((Object)kfk4.C0);
            }
        }
        K0 = (Set)((h4j)x2).e();
    }
    
    public kfk(final String c0, final Class<? extends ifk$a> d0) {
        this.C0 = c0;
        this.D0 = d0;
    }
    
    @Override
    public final String toString() {
        return this.C0;
    }
}
