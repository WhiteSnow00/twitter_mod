// 
// Decompiled by Procyon v0.6.0
// 

public final class zwf
{
    public final vwf a;
    
    public zwf(final zwf.zwf$a zwf$a) {
        this.a = zwf$a.a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o != null && zwf.class == o.getClass() && c5j.a((Object)this.a, (Object)((zwf)o).a));
    }
    
    @Override
    public final int hashCode() {
        return c5j.f((Object)this.a);
    }
    
    @Override
    public final String toString() {
        final StringBuilder j = fu8.j("LiveEventReminderWrapper{reminderSubscription=");
        j.append(this.a);
        j.append('}');
        return j.toString();
    }
}
