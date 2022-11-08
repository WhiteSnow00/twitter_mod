import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mgj extends rn
{
    public final Activity C0;
    
    public mgj(final Activity c0) {
        zzd.f((Object)c0, "activity");
        this.C0 = c0;
    }
    
    public final Activity a() {
        return this.C0;
    }
    
    public final boolean equals(final Object o) {
        return this == o || (o instanceof mgj && zzd.a((Object)this.C0, (Object)((mgj)o).C0));
    }
    
    public final int hashCode() {
        return this.C0.hashCode();
    }
    
    public final String toString() {
        final Activity c0 = this.C0;
        final StringBuilder sb = new StringBuilder();
        sb.append("OnActivityStarted(activity=");
        sb.append(c0);
        sb.append(")");
        return sb.toString();
    }
}
