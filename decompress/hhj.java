import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hhj extends vn
{
    public final Activity F0;
    
    public hhj(final Activity f0) {
        e0e.f((Object)f0, "activity");
        this.F0 = f0;
    }
    
    public final Activity a() {
        return this.F0;
    }
    
    public final boolean equals(final Object o) {
        return this == o || (o instanceof hhj && e0e.a((Object)this.F0, (Object)((hhj)o).F0));
    }
    
    public final int hashCode() {
        return this.F0.hashCode();
    }
    
    public final String toString() {
        final Activity f0 = this.F0;
        final StringBuilder sb = new StringBuilder();
        sb.append("OnActivityStopped(activity=");
        sb.append(f0);
        sb.append(")");
        return sb.toString();
    }
}
