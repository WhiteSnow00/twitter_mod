// 
// Decompiled by Procyon v0.6.0
// 

public final class v2s
{
    public static final b Companion;
    public static final v2s.v2s$c c;
    public final wtg a;
    public final ls8 b;
    
    static {
        Companion = new b();
        c = v2s.v2s$c.c;
    }
    
    public v2s(final wtg a, final ls8 b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof v2s)) {
            return false;
        }
        final v2s v2s = (v2s)o;
        return e0e.a((Object)this.a, (Object)v2s.a) && e0e.a((Object)this.b, (Object)v2s.b);
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final ls8 b = this.b;
        int hashCode2;
        if (b == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = b.hashCode();
        }
        return hashCode * 31 + hashCode2;
    }
    
    @Override
    public final String toString() {
        final wtg a = this.a;
        final ls8 b = this.b;
        final StringBuilder sb = new StringBuilder();
        sb.append("SwipeableComponentItem(mediaEntity=");
        sb.append(a);
        sb.append(", destination=");
        sb.append(b);
        sb.append(")");
        return sb.toString();
    }
    
    public static final class b
    {
    }
}
