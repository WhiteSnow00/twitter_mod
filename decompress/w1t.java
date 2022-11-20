// 
// Decompiled by Procyon v0.6.0
// 

public final class w1t
{
    public static final w1t.w1t$a c;
    public final String a;
    public final String b;
    
    static {
        c = new w1t.w1t$a();
    }
    
    public w1t(final String a, final String b) {
        czd.f((Object)a, "timelineKey");
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof w1t)) {
            return false;
        }
        final w1t w1t = (w1t)o;
        return czd.a((Object)this.a, (Object)w1t.a) && czd.a((Object)this.b, (Object)w1t.b);
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final String b = this.b;
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
        return zh8.o("TimelineQuery(timelineKey=", this.a, ", timelineContext=", this.b, ")");
    }
}
