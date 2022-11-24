// 
// Decompiled by Procyon v0.6.0
// 

public final class p0t
{
    public static final a Companion;
    public static final p0t d;
    public final String a;
    public final j5t b;
    public final b3t c;
    
    static {
        Companion = new a();
        d = new p0t(null, null, null);
    }
    
    public p0t(final String a, final j5t b, final b3t c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof p0t)) {
            return false;
        }
        final p0t p0t = (p0t)o;
        return e0e.a((Object)this.a, (Object)p0t.a) && e0e.a((Object)this.b, (Object)p0t.b) && e0e.a((Object)this.c, (Object)p0t.c);
    }
    
    @Override
    public final int hashCode() {
        final String a = this.a;
        int hashCode = 0;
        int hashCode2;
        if (a == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = a.hashCode();
        }
        final j5t b = this.b;
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = b.hashCode();
        }
        final b3t c = this.c;
        if (c != null) {
            hashCode = c.hashCode();
        }
        return (hashCode2 * 31 + hashCode3) * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final j5t b = this.b;
        final b3t c = this.c;
        final StringBuilder sb = new StringBuilder();
        sb.append("TimelineMetadata(title=");
        sb.append(a);
        sb.append(", timelineScribeConfig=");
        sb.append(b);
        sb.append(", timelineReaderModeConfig=");
        sb.append(c);
        sb.append(")");
        return sb.toString();
    }
    
    public static final class a
    {
    }
}
