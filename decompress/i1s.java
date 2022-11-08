// 
// Decompiled by Procyon v0.6.0
// 

public final class i1s
{
    public static final b Companion;
    public static final i1s.i1s$c c;
    public final dtg a;
    public final wr8 b;
    
    static {
        Companion = new b();
        c = i1s.i1s$c.c;
    }
    
    public i1s(final dtg a, final wr8 b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof i1s)) {
            return false;
        }
        final i1s i1s = (i1s)o;
        return zzd.a((Object)this.a, (Object)i1s.a) && zzd.a((Object)this.b, (Object)i1s.b);
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final wr8 b = this.b;
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
        final dtg a = this.a;
        final wr8 b = this.b;
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
