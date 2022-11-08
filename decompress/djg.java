// 
// Decompiled by Procyon v0.6.0
// 

public final class djg
{
    public static final b Companion;
    public static final alp<djg> c;
    public final ndw a;
    public final String b;
    
    static {
        Companion = new b();
        djg.c = djg.djg$c.c;
    }
    
    public djg(final ndw a, final String b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof djg)) {
            return false;
        }
        final djg djg = (djg)o;
        return this.a == djg.a && zzd.a((Object)this.b, (Object)djg.b);
    }
    
    @Override
    public final int hashCode() {
        final ndw a = this.a;
        int hashCode = 0;
        int hashCode2;
        if (a == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = a.hashCode();
        }
        final String b = this.b;
        if (b != null) {
            hashCode = b.hashCode();
        }
        return hashCode2 * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final ndw a = this.a;
        final String b = this.b;
        final StringBuilder sb = new StringBuilder();
        sb.append("ManagedLabelSettings(labelType=");
        sb.append(a);
        sb.append(", ownerScreenName=");
        sb.append(b);
        sb.append(")");
        return sb.toString();
    }
    
    public static final class a extends h4j<djg>
    {
        public ndw a;
        public String b;
        
        public final Object i() {
            return new djg(this.a, this.b);
        }
    }
    
    public static final class b
    {
    }
}
