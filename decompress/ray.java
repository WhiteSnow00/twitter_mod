import java.util.Map;
import java.util.HashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ray
{
    public String a;
    public final long b;
    public final HashMap c;
    
    public ray(final String a, final long b, final Map map) {
        this.a = a;
        this.b = b;
        final HashMap c = new HashMap();
        this.c = c;
        if (map != null) {
            c.putAll(map);
        }
    }
    
    public final ray a() {
        return new ray(this.a, this.b, new HashMap(this.c));
    }
    
    public final /* bridge */ Object clone() throws CloneNotSupportedException {
        return this.a();
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ray)) {
            return false;
        }
        final ray ray = (ray)o;
        return this.b == ray.b && this.a.equals(ray.a) && this.c.equals(ray.c);
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final long b = this.b;
        return this.c.hashCode() + (hashCode * 31 + (int)(b ^ b >>> 32)) * 31;
    }
    
    @Override
    public final String toString() {
        return wa0.y(a88.o("Event{name='", this.a, "', timestamp=", this.b), ", params=", this.c.toString(), "}");
    }
}
