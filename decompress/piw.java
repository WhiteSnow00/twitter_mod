// 
// Decompiled by Procyon v0.6.0
// 

public final class piw
{
    public final c a;
    
    public piw(final c a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof piw && czd.a((Object)this.a, (Object)((piw)o).a));
    }
    
    @Override
    public final int hashCode() {
        final c a = this.a;
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
        final c a = this.a;
        final StringBuilder sb = new StringBuilder();
        sb.append("UserResults(result=");
        sb.append(a);
        sb.append(")");
        return sb.toString();
    }
    
    public static final class a
    {
        public final String a;
        public final f8w b;
        
        public a(final String a, final f8w b) {
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
            return czd.a((Object)this.a, (Object)a.a) && czd.a((Object)this.b, (Object)a.b);
        }
        
        @Override
        public final int hashCode() {
            return this.b.hashCode() + this.a.hashCode() * 31;
        }
        
        @Override
        public final String toString() {
            final String a = this.a;
            final f8w b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("OnUser(__typename=");
            sb.append(a);
            sb.append(", user=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class b
    {
        public final String a;
        public final dkw b;
        
        public b(final String a, final dkw b) {
            this.a = a;
            this.b = b;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof b)) {
                return false;
            }
            final b b = (b)o;
            return czd.a((Object)this.a, (Object)b.a) && czd.a((Object)this.b, (Object)b.b);
        }
        
        @Override
        public final int hashCode() {
            return this.b.hashCode() + this.a.hashCode() * 31;
        }
        
        @Override
        public final String toString() {
            final String a = this.a;
            final dkw b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("OnUserUnavailable(__typename=");
            sb.append(a);
            sb.append(", userUnavailable=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class c
    {
        public final String a;
        public final a b;
        public final b c;
        
        public c(final String a, final a b, final b c) {
            czd.f((Object)a, "__typename");
            this.a = a;
            this.b = b;
            this.c = c;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof c)) {
                return false;
            }
            final c c = (c)o;
            return czd.a((Object)this.a, (Object)c.a) && czd.a((Object)this.b, (Object)c.b) && czd.a((Object)this.c, (Object)c.c);
        }
        
        @Override
        public final int hashCode() {
            final int hashCode = this.a.hashCode();
            final a b = this.b;
            int hashCode2 = 0;
            int hashCode3;
            if (b == null) {
                hashCode3 = 0;
            }
            else {
                hashCode3 = b.hashCode();
            }
            final b c = this.c;
            if (c != null) {
                hashCode2 = c.hashCode();
            }
            return (hashCode * 31 + hashCode3) * 31 + hashCode2;
        }
        
        @Override
        public final String toString() {
            final String a = this.a;
            final a b = this.b;
            final b c = this.c;
            final StringBuilder sb = new StringBuilder();
            sb.append("Result(__typename=");
            sb.append(a);
            sb.append(", onUser=");
            sb.append(b);
            sb.append(", onUserUnavailable=");
            sb.append(c);
            sb.append(")");
            return sb.toString();
        }
    }
}
