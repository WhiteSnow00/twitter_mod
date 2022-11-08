import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class i8b
{
    public static final alp<i8b> d;
    public final bab a;
    public final Map<String, String> b;
    public final q7m c;
    
    static {
        i8b.d = new i8b.i8b$a();
    }
    
    public i8b(final bab a, final Map<String, String> b, final q7m c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && i8b.class == o.getClass()) {
            final i8b i8b = (i8b)o;
            if (!w4j.a((Object)this.a, (Object)i8b.a) || !w4j.a((Object)this.b, (Object)i8b.b) || !w4j.a((Object)this.c, (Object)i8b.c)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return w4j.g((Object)this.a, (Object)this.b);
    }
}
