import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public enum dgk
{
    H0("no_type", (Class<? extends bgk$a>)null), 
    I0("dm_typing", (Class<? extends bgk$a>)gov.a.class), 
    J0("dm_update", (Class<? extends bgk$a>)b59$a.class), 
    K0("tweet_engagement", (Class<? extends bgk$a>)r0c$a.class), 
    L0("live_content", (Class<? extends bgk$a>)r0c$a.class);
    
    public static final Set<dgk> M0;
    public static final Set<String> N0;
    public static final dgk[] O0;
    public final String F0;
    public final Class<? extends bgk$a> G0;
    
    static {
        int i = 0;
        final dgk dgk2 = new dgk("config", (Class<? extends bgk$a>)zf6$a.class);
        final dgk dgk3 = new dgk("subscriptions", kor.a.class);
        final aop x = aop.x();
        final dgk dgk;
        x.q((Object[])new dgk[] { dgk, dgk2, dgk3 });
        M0 = (Set)((z4j)x).e();
        final aop x2 = aop.x();
        for (dgk[] values = values(); i < values.length; ++i) {
            final dgk dgk4 = values[i];
            if (dgk4.G0 == r0c$a.class) {
                x2.o((Object)dgk4.F0);
            }
        }
        N0 = (Set)((z4j)x2).e();
    }
    
    public dgk(final String f0, final Class<? extends bgk$a> g0) {
        this.F0 = f0;
        this.G0 = g0;
    }
    
    @Override
    public final String toString() {
        return this.F0;
    }
}
