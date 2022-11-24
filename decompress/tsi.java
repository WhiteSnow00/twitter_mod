import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class tsi extends qql
{
    public final List<Long> a;
    
    public tsi(final List<Long> a) {
        e0e.f((Object)a, "notificationIds");
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof tsi && e0e.a((Object)this.a, (Object)((tsi)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        return rh.x("NotificationIdsArg(notificationIds=", (List)this.a, ")");
    }
}
