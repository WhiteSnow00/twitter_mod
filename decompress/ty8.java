// 
// Decompiled by Procyon v0.6.0
// 

public final class ty8
{
    public final String a;
    public final a b;
    
    public ty8(final String a, final a b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ty8)) {
            return false;
        }
        final ty8 ty8 = (ty8)o;
        return e0e.a((Object)this.a, (Object)ty8.a) && e0e.a((Object)this.b, (Object)ty8.b);
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final a b = this.b;
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
        final a b = this.b;
        final StringBuilder sb = new StringBuilder();
        sb.append("DirectMessageUserResults(rest_id=");
        sb.append(a);
        sb.append(", result=");
        sb.append(b);
        sb.append(")");
        return sb.toString();
    }
    
    public static final class a
    {
        public final String a;
        public final my8 b;
        public final skw c;
        
        public a(final String a, final my8 b, final skw c) {
            e0e.f((Object)a, "__typename");
            this.a = a;
            this.b = b;
            this.c = c;
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
            return e0e.a((Object)this.a, (Object)a.a) && e0e.a((Object)this.b, (Object)a.b) && e0e.a((Object)this.c, (Object)a.c);
        }
        
        @Override
        public final int hashCode() {
            final int hashCode = this.a.hashCode();
            final my8 b = this.b;
            int hashCode2 = 0;
            int hashCode3;
            if (b == null) {
                hashCode3 = 0;
            }
            else {
                hashCode3 = b.hashCode();
            }
            final skw c = this.c;
            if (c != null) {
                hashCode2 = c.hashCode();
            }
            return (hashCode * 31 + hashCode3) * 31 + hashCode2;
        }
        
        @Override
        public final String toString() {
            final String a = this.a;
            final my8 b = this.b;
            final skw c = this.c;
            final StringBuilder sb = new StringBuilder();
            sb.append("Result(__typename=");
            sb.append(a);
            sb.append(", directMessageUser=");
            sb.append(b);
            sb.append(", userUnavailable=");
            sb.append(c);
            sb.append(")");
            return sb.toString();
        }
    }
}
