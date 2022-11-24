// 
// Decompiled by Procyon v0.6.0
// 

public final class r61 implements gzi
{
    public final int b;
    
    public r61(final int b) {
        this.b = b;
    }
    
    public final Class<? extends gzi> annotationType() {
        return gzi.class;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (o instanceof gzi) {
            if (this.b != ((r61)o).b) {
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
        return gwl.x(j98.j("@com.twitter.notification.push.di.user.NotificationsSubsystemCoreUserObjectSubgraph_SSM.MapKey_bindNotificationHandlerMap(", "value0="), this.b, ')');
    }
}
