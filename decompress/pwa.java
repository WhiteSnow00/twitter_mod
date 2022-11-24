// 
// Decompiled by Procyon v0.6.0
// 

public final class pwa implements vrd
{
    public static final pwa.pwa$a d;
    public final qwa.b b;
    public final String c;
    
    static {
        d = new pwa.pwa$a();
    }
    
    public pwa(final qwa.b b, final String c) {
        e0e.f((Object)b, "dataType");
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof pwa)) {
            return false;
        }
        final pwa pwa = (pwa)o;
        return this.b == pwa.b && e0e.a((Object)this.c, (Object)pwa.c);
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.b.hashCode();
        final String c = this.c;
        int hashCode2;
        if (c == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = c.hashCode();
        }
        return hashCode * 31 + hashCode2;
    }
    
    @Override
    public final String toString() {
        final qwa.b b = this.b;
        final String c = this.c;
        final StringBuilder sb = new StringBuilder();
        sb.append("FetchPersistedDataSubtaskInputData(dataType=");
        sb.append(b);
        sb.append(", stringInput=");
        sb.append(c);
        sb.append(")");
        return sb.toString();
    }
}
