import java.util.Map;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class wf6
{
    public static final a Companion;
    public final List<yf6> a;
    public final List<yf6> b;
    public final u3s c;
    public final u3s d;
    
    static {
        Companion = new a();
    }
    
    public wf6(final List<yf6> a, final List<yf6> b) {
        this.a = a;
        this.b = b;
        this.c = (u3s)rp2.z0((otb)new wf6$c(this));
        this.d = (u3s)rp2.z0((otb)new wf6$b(this));
    }
    
    public final Map<String, yf6> a() {
        return (Map)this.d.getValue();
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof wf6)) {
            return false;
        }
        final wf6 wf6 = (wf6)o;
        return zzd.a((Object)this.a, (Object)wf6.a) && zzd.a((Object)this.b, (Object)wf6.b);
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 31;
    }
    
    @Override
    public final String toString() {
        final List<yf6> a = this.a;
        final List<yf6> b = this.b;
        final StringBuilder sb = new StringBuilder();
        sb.append("ConfigurationCollection(activeReactions=");
        sb.append(a);
        sb.append(", inactiveReactions=");
        sb.append(b);
        sb.append(")");
        return sb.toString();
    }
    
    public static final class a
    {
    }
}
