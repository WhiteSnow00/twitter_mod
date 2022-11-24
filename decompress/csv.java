import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class csv implements kr6
{
    public static final nmp<csv> d;
    public static final Set<String> e;
    public final String a;
    public final hsv b;
    public final o7t c;
    
    static {
        csv.d = new csv.csv$a();
        e = aop.t((Object)"DisconnectedRepliesAncestor", (Object[])new String[] { "DisconnectedRepliesDescendant" });
    }
    
    public csv(final String a, final hsv b, final o7t c) {
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
        if (!(o instanceof csv)) {
            return false;
        }
        final csv csv = (csv)o;
        if (!o5j.a((Object)this.a, (Object)csv.a) || !o5j.a((Object)this.b, (Object)csv.b) || !o5j.a((Object)this.c, (Object)csv.c)) {
            b = false;
        }
        return b;
    }
    
    @Override
    public final int hashCode() {
        return o5j.h((Object)this.a, (Object)this.b, (Object)this.c);
    }
}
