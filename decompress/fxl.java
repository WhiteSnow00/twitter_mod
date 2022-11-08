// 
// Decompiled by Procyon v0.6.0
// 

public final class fxl implements ls6<a>
{
    public final a c;
    public final long d;
    public final String e;
    public final long f;
    public final long g;
    public final hxl$a h;
    public final int i;
    
    public fxl(final a c) {
        zzd.f((Object)c, "data");
        this.c = c;
        final uxl a = c.a;
        this.d = a.c;
        this.e = a.d;
        this.f = a.e;
        this.g = a.f;
        this.h = hxl$a.b;
        this.i = 28;
    }
    
    @Override
    public final long a() {
        return this.f;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof fxl && zzd.a((Object)this.c, (Object)((fxl)o).c));
    }
    
    @Override
    public final String getConversationId() {
        return this.e;
    }
    
    @Override
    public final Object getData() {
        return this.c;
    }
    
    @Override
    public final long getId() {
        return this.d;
    }
    
    @Override
    public final int getType() {
        return this.i;
    }
    
    @Override
    public final int hashCode() {
        return this.c.hashCode();
    }
    
    @Override
    public final long m() {
        return this.g;
    }
    
    @Override
    public final long t() {
        final a c = this.c;
        final or7 b = c.b;
        long n;
        if (b != null) {
            n = b.c;
        }
        else {
            n = c.a.h;
        }
        return n;
    }
    
    @Override
    public final String toString() {
        final a c = this.c;
        final StringBuilder sb = new StringBuilder();
        sb.append("ReactionAndParentMessageEntry(data=");
        sb.append(c);
        sb.append(")");
        return sb.toString();
    }
    
    @Override
    public final alp v() {
        return (alp)this.h;
    }
    
    public static final class a
    {
        public final uxl a;
        public final or7 b;
        
        public a(final uxl a, final or7 b) {
            this.a = a;
            this.b = b;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof a)) {
                return false;
            }
            final a a = (a)o;
            return zzd.a((Object)this.a, (Object)a.a) && zzd.a((Object)this.b, (Object)a.b);
        }
        
        @Override
        public final int hashCode() {
            final int hashCode = this.a.hashCode();
            final or7 b = this.b;
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
            final uxl a = this.a;
            final or7 b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("Metadata(reactionEntry=");
            sb.append(a);
            sb.append(", messageEntry=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
}
