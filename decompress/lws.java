// 
// Decompiled by Procyon v0.6.0
// 

public final class lws
{
    public final int a;
    public final String b;
    public final long c;
    
    public lws(final int a, final String b, final long c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof lws)) {
            return false;
        }
        final lws lws = (lws)o;
        return this.a == lws.a && czd.a((Object)this.b, (Object)lws.b) && this.c == lws.c;
    }
    
    @Override
    public final int hashCode() {
        final int a = this.a;
        final String b = this.b;
        int hashCode;
        if (b == null) {
            hashCode = 0;
        }
        else {
            hashCode = b.hashCode();
        }
        final long c = this.c;
        return (a * 31 + hashCode) * 31 + (int)(c ^ c >>> 32);
    }
    
    @Override
    public final String toString() {
        return hmg.i(fu8.k("TimelineId(timelineType=", this.a, ", timelineTag=", this.b, ", timelineOwnerId="), this.c, ")");
    }
}
