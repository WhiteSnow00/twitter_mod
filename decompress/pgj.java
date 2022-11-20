import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pgj extends rn
{
    public final Activity D0;
    
    public pgj(final Activity d0) {
        czd.f((Object)d0, "activity");
        this.D0 = d0;
    }
    
    @Override
    public final Activity a() {
        return this.D0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof pgj && czd.a((Object)this.D0, (Object)((pgj)o).D0));
    }
    
    @Override
    public final int hashCode() {
        return this.D0.hashCode();
    }
    
    @Override
    public final String toString() {
        final Activity d0 = this.D0;
        final StringBuilder sb = new StringBuilder();
        sb.append("OnActivityPaused(activity=");
        sb.append(d0);
        sb.append(")");
        return sb.toString();
    }
}
