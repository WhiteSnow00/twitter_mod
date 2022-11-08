// 
// Decompiled by Procyon v0.6.0
// 

public final class br6
{
    public final df0 a;
    public final a b;
    
    public br6(final df0 a, final a b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof br6)) {
            return false;
        }
        final br6 br6 = (br6)o;
        return this.a == br6.a && zzd.a((Object)this.b, (Object)br6.b);
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 31;
    }
    
    @Override
    public final String toString() {
        final df0 a = this.a;
        final a b = this.b;
        final StringBuilder sb = new StringBuilder();
        sb.append("ConversationControl(policy=");
        sb.append(a);
        sb.append(", conversation_owner_results=");
        sb.append(b);
        sb.append(")");
        return sb.toString();
    }
    
    public static final class a
    {
        public final d a;
        
        public a(final d a) {
            this.a = a;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof a && zzd.a((Object)this.a, (Object)((a)o).a));
        }
        
        @Override
        public final int hashCode() {
            final d a = this.a;
            int hashCode;
            if (a == null) {
                hashCode = 0;
            }
            else {
                hashCode = a.hashCode();
            }
            return hashCode;
        }
        
        @Override
        public final String toString() {
            final d a = this.a;
            final StringBuilder sb = new StringBuilder();
            sb.append("Conversation_owner_results(result=");
            sb.append(a);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class b
    {
        public final String a;
        
        public b(final String a) {
            this.a = a;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof b && zzd.a((Object)this.a, (Object)((b)o).a));
        }
        
        @Override
        public final int hashCode() {
            final String a = this.a;
            int hashCode;
            if (a == null) {
                hashCode = 0;
            }
            else {
                hashCode = a.hashCode();
            }
            return hashCode;
        }
        
        @Override
        public final String toString() {
            return zi.y("Legacy(screen_name=", this.a, ")");
        }
    }
    
    public static final class c
    {
        public final b a;
        
        public c(final b a) {
            this.a = a;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof c && zzd.a((Object)this.a, (Object)((c)o).a));
        }
        
        @Override
        public final int hashCode() {
            final b a = this.a;
            int hashCode;
            if (a == null) {
                hashCode = 0;
            }
            else {
                hashCode = a.hashCode();
            }
            return hashCode;
        }
        
        @Override
        public final String toString() {
            final b a = this.a;
            final StringBuilder sb = new StringBuilder();
            sb.append("OnUser(legacy=");
            sb.append(a);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class d
    {
        public final String a;
        public final c b;
        
        public d(final String a, final c b) {
            zzd.f((Object)a, "__typename");
            this.a = a;
            this.b = b;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof d)) {
                return false;
            }
            final d d = (d)o;
            return zzd.a((Object)this.a, (Object)d.a) && zzd.a((Object)this.b, (Object)d.b);
        }
        
        @Override
        public final int hashCode() {
            final int hashCode = this.a.hashCode();
            final c b = this.b;
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
            final String a = this.a;
            final c b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("Result(__typename=");
            sb.append(a);
            sb.append(", onUser=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
}
