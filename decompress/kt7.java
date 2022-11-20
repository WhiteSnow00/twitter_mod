// 
// Decompiled by Procyon v0.6.0
// 

public final class kt7
{
    public final String a;
    public final String b;
    public final String c;
    public final a d;
    
    public kt7(final String a, final String b, final String c, final a d) {
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
        if (!(o instanceof kt7)) {
            return false;
        }
        final kt7 kt7 = (kt7)o;
        return czd.a((Object)this.a, (Object)kt7.a) && czd.a((Object)this.b, (Object)kt7.b) && czd.a((Object)this.c, (Object)kt7.c) && czd.a((Object)this.d, (Object)kt7.d);
    }
    
    @Override
    public final int hashCode() {
        final int f = hmg.f(this.b, this.a.hashCode() * 31, 31);
        final String c = this.c;
        int hashCode;
        if (c == null) {
            hashCode = 0;
        }
        else {
            hashCode = c.hashCode();
        }
        return this.d.hashCode() + (f + hashCode) * 31;
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final String b = this.b;
        final String c = this.c;
        final a d = this.d;
        final StringBuilder q = tqf.q("DMReaction(id=", a, ", reaction_key=", b, ", created_at_millis=");
        q.append(c);
        q.append(", sender_results=");
        q.append(d);
        q.append(")");
        return q.toString();
    }
    
    public static final class a
    {
        public final String a;
        
        public a(final String a) {
            this.a = a;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof a && czd.a((Object)this.a, (Object)((a)o).a));
        }
        
        @Override
        public final int hashCode() {
            return this.a.hashCode();
        }
        
        @Override
        public final String toString() {
            return da8.j("Sender_results(rest_id=", this.a, ")");
        }
    }
}
