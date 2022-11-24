import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class khp
{
    public final Context a;
    
    public khp(final Context a) {
        e0e.f((Object)a, "context");
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof khp && e0e.a((Object)this.a, (Object)((khp)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        final Context a = this.a;
        final StringBuilder sb = new StringBuilder();
        sb.append("SelfUserResultShowParams(context=");
        sb.append(a);
        sb.append(")");
        return sb.toString();
    }
}
