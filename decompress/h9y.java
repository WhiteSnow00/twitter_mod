import java.util.Map;
import java.util.HashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class h9y
{
    public String a;
    public final long b;
    public final HashMap c;
    
    public h9y(final String a, final long b, final Map map) {
        this.a = a;
        this.b = b;
        final HashMap c = new HashMap();
        this.c = c;
        if (map != null) {
            c.putAll(map);
        }
    }
    
    public final h9y a() {
        return new h9y(this.a, this.b, new HashMap(this.c));
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof h9y)) {
            return false;
        }
        final h9y h9y = (h9y)o;
        return this.b == h9y.b && this.a.equals(h9y.a) && this.c.equals(h9y.c);
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final long b = this.b;
        return this.c.hashCode() + (hashCode * 31 + (int)(b ^ b >>> 32)) * 31;
    }
    
    @Override
    public final String toString() {
        return xa0.B(hfe.i("Event{name='", this.a, "', timestamp=", this.b), ", params=", this.c.toString(), "}");
    }
}
