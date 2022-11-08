import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vj9
{
    public final String a;
    public final a b;
    
    public vj9(final String a, final a b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof vj9)) {
            return false;
        }
        final vj9 vj9 = (vj9)o;
        return zzd.a((Object)this.a, (Object)vj9.a) && zzd.a((Object)this.b, (Object)vj9.b);
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 31;
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final a b = this.b;
        final StringBuilder sb = new StringBuilder();
        sb.append("DropsActiveChat(name=");
        sb.append(a);
        sb.append(", chatSlice=");
        sb.append(b);
        sb.append(")");
        return sb.toString();
    }
    
    public static final class a
    {
        public final List<b> a;
        
        public a(final List<b> a) {
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
            return du1.x("ChatSlice(itemsResults=", (List)this.a, ")");
        }
    }
    
    public static final class b
    {
        public final String a;
        public final c b;
        
        public b(final String a, final c b) {
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
            return zzd.a((Object)this.a, (Object)b.a) && zzd.a((Object)this.b, (Object)b.b);
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
            sb.append("ItemsResult(chatId=");
            sb.append(a);
            sb.append(", result=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class c
    {
        public final String a;
        public final wu6 b;
        public final ou6 c;
        
        public c(final String a, final wu6 b, final ou6 c) {
            zzd.f((Object)a, "__typename");
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
            return zzd.a((Object)this.a, (Object)c.a) && zzd.a((Object)this.b, (Object)c.b) && zzd.a((Object)this.c, (Object)c.c);
        }
        
        @Override
        public final int hashCode() {
            final int hashCode = this.a.hashCode();
            final wu6 b = this.b;
            int hashCode2 = 0;
            int hashCode3;
            if (b == null) {
                hashCode3 = 0;
            }
            else {
                hashCode3 = b.hashCode();
            }
            final ou6 c = this.c;
            if (c != null) {
                hashCode2 = c.hashCode();
            }
            return (hashCode * 31 + hashCode3) * 31 + hashCode2;
        }
        
        @Override
        public final String toString() {
            final String a = this.a;
            final wu6 b = this.b;
            final ou6 c = this.c;
            final StringBuilder sb = new StringBuilder();
            sb.append("Result(__typename=");
            sb.append(a);
            sb.append(", conversationWithVisibilityResults=");
            sb.append(b);
            sb.append(", conversationUnavailable=");
            sb.append(c);
            sb.append(")");
            return sb.toString();
        }
    }
}
