// 
// Decompiled by Procyon v0.6.0
// 

public final class p61 implements hpi
{
    public final int b;
    
    public p61(final int b) {
        this.b = b;
    }
    
    @Override
    public final Class<? extends hpi> annotationType() {
        return hpi.class;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (o instanceof hpi) {
            if (this.b != ((p61)o).b) {
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
        return y70.y(dia.t("@com.twitter.notification.actions.api.di.NotificationActionsSubgraph_SSM.MapKey_notificationActions(", "value0="), this.b, ')');
    }
}
