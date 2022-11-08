// 
// Decompiled by Procyon v0.6.0
// 

public final class zt7
{
    public final String a;
    public final String b;
    public final String c;
    public final a d;
    
    public zt7(final String a, final String b, final String c, final a d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof zt7)) {
            return false;
        }
        final zt7 zt7 = (zt7)o;
        return zzd.a((Object)this.a, (Object)zt7.a) && zzd.a((Object)this.b, (Object)zt7.b) && zzd.a((Object)this.c, (Object)zt7.c) && zzd.a((Object)this.d, (Object)zt7.d);
    }
    
    @Override
    public final int hashCode() {
        final int a = l7k.a(this.b, this.a.hashCode() * 31, 31);
        final String c = this.c;
        int hashCode;
        if (c == null) {
            hashCode = 0;
        }
        else {
            hashCode = c.hashCode();
        }
        return this.d.hashCode() + (a + hashCode) * 31;
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final String b = this.b;
        final String c = this.c;
        final a d = this.d;
        final StringBuilder y = mb0.y("DMReaction(id=", a, ", reaction_key=", b, ", created_at_millis=");
        y.append(c);
        y.append(", sender_results=");
        y.append(d);
        y.append(")");
        return y.toString();
    }
    
    public static final class a
    {
        public final String a;
        
        public a(final String a) {
            this.a = a;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof a && zzd.a((Object)this.a, (Object)((a)o).a));
        }
        
        @Override
        public final int hashCode() {
            return this.a.hashCode();
        }
        
        @Override
        public final String toString() {
            return zi.y("Sender_results(rest_id=", this.a, ")");
        }
    }
}
