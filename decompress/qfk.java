import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public enum qfk
{
    F0("no_type", (Class<? extends ofk$a>)null), 
    G0("dm_typing", (Class<? extends ofk$a>)unv$a.class), 
    H0("dm_update", (Class<? extends ofk$a>)u39$a.class), 
    I0("tweet_engagement", (Class<? extends ofk$a>)qzb$a.class), 
    J0("live_content", (Class<? extends ofk$a>)qzb$a.class);
    
    public static final Set<qfk> K0;
    public static final Set<String> L0;
    public static final qfk[] M0;
    public final String D0;
    public final Class<? extends ofk$a> E0;
    
    static {
        int i = 0;
        final qfk qfk2 = new qfk("config", (Class<? extends ofk$a>)se6$a.class);
        final qfk qfk3 = new qfk("subscriptions", (Class<? extends ofk$a>)nnr$a.class);
        final dnp x = dnp.x();
        final qfk qfk;
        x.q((Object[])new qfk[] { qfk, qfk2, qfk3 });
        K0 = (Set)((n4j)x).e();
        final dnp x2 = dnp.x();
        for (qfk[] values = values(); i < values.length; ++i) {
            final qfk qfk4 = values[i];
            if (qfk4.E0 == qzb$a.class) {
                x2.o((Object)qfk4.D0);
            }
        }
        L0 = (Set)((n4j)x2).e();
    }
    
    public qfk(final String d0, final Class<? extends ofk$a> e0) {
        this.D0 = d0;
        this.E0 = e0;
    }
    
    @Override
    public final String toString() {
        return this.D0;
    }
}
