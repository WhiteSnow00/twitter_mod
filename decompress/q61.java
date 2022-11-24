// 
// Decompiled by Procyon v0.6.0
// 

public final class q61 implements dqi
{
    public final int b;
    
    public q61(final int b) {
        this.b = b;
    }
    
    @Override
    public final Class<? extends dqi> annotationType() {
        return dqi.class;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (o instanceof dqi) {
            if (this.b != ((q61)o).b) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return this.b ^ 0xCEE59CDF;
    }
    
    @Override
    public final String toString() {
        return gwl.x(j98.j("@com.twitter.notification.actions.api.di.NotificationActionsSubgraph_SSM.MapKey_notificationActions(", "value0="), this.b, ')');
    }
}
