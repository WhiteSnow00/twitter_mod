import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bqp
{
    public final List<oap> a;
    public final String b;
    
    public bqp() {
        this((List<oap>)f2a.D0, "");
    }
    
    public bqp(final List<oap> a, final String b) {
        czd.f((Object)a, "results");
        czd.f((Object)b, "query");
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof bqp)) {
            return false;
        }
        final bqp bqp = (bqp)o;
        return czd.a((Object)this.a, (Object)bqp.a) && czd.a((Object)this.b, (Object)bqp.b);
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 31;
    }
    
    @Override
    public final String toString() {
        final List<oap> a = this.a;
        final String b = this.b;
        final StringBuilder sb = new StringBuilder();
        sb.append("SettingsSearchState(results=");
        sb.append(a);
        sb.append(", query=");
        sb.append(b);
        sb.append(")");
        return sb.toString();
    }
}
