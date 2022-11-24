// 
// Decompiled by Procyon v0.6.0
// 

public final class uxf
{
    public final qxf a;
    
    public uxf(final uxf.uxf$a uxf$a) {
        this.a = uxf$a.a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o != null && uxf.class == o.getClass() && o5j.a((Object)this.a, (Object)((uxf)o).a));
    }
    
    @Override
    public final int hashCode() {
        return o5j.f((Object)this.a);
    }
    
    @Override
    public final String toString() {
        final StringBuilder f = ehk.f("LiveEventReminderWrapper{reminderSubscription=");
        f.append(this.a);
        f.append('}');
        return f.toString();
    }
}
