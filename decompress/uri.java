import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class uri
{
    public static final a Companion;
    public final String a;
    public final List<List<Integer>> b;
    public final List<List<Integer>> c;
    public final List<List<Integer>> d;
    
    static {
        Companion = new a();
    }
    
    public uri(final String a, final List<? extends List<Integer>> b, final List<? extends List<Integer>> c, final List<? extends List<Integer>> d) {
        e0e.f((Object)b, "highlightIndices");
        e0e.f((Object)c, "boldIndices");
        e0e.f((Object)d, "italicizeIndices");
        this.a = a;
        this.b = (List<List<Integer>>)b;
        this.c = (List<List<Integer>>)c;
        this.d = (List<List<Integer>>)d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof uri)) {
            return false;
        }
        final uri uri = (uri)o;
        return e0e.a((Object)this.a, (Object)uri.a) && e0e.a((Object)this.b, (Object)uri.b) && e0e.a((Object)this.c, (Object)uri.c) && e0e.a((Object)this.d, (Object)uri.d);
    }
    
    @Override
    public final int hashCode() {
        return this.d.hashCode() + go9.o((List)this.c, go9.o((List)this.b, this.a.hashCode() * 31, 31), 31);
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final List<List<Integer>> b = this.b;
        final List<List<Integer>> c = this.c;
        final List<List<Integer>> d = this.d;
        final StringBuilder c2 = po.C("NotificationCustomFormatting(hexColor=", a, ", highlightIndices=", (List)b, ", boldIndices=");
        c2.append(c);
        c2.append(", italicizeIndices=");
        c2.append(d);
        c2.append(")");
        return c2.toString();
    }
    
    public static final class a
    {
    }
}
