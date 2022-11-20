import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ax8
{
    public final String a;
    public final String b;
    public final d c;
    public final c d;
    public final String e;
    public final b f;
    public final List<a> g;
    
    public ax8(final String a, final String b, final d c, final c d, final String e, final b f, final List<a> g) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ax8)) {
            return false;
        }
        final ax8 ax8 = (ax8)o;
        return czd.a((Object)this.a, (Object)ax8.a) && czd.a((Object)this.b, (Object)ax8.b) && czd.a((Object)this.c, (Object)ax8.c) && czd.a((Object)this.d, (Object)ax8.d) && czd.a((Object)this.e, (Object)ax8.e) && czd.a((Object)this.f, (Object)ax8.f) && czd.a((Object)this.g, (Object)ax8.g);
    }
    
    @Override
    public final int hashCode() {
        final int f = hmg.f(this.b, this.a.hashCode() * 31, 31);
        final int hashCode = this.c.hashCode();
        final c d = this.d;
        int hashCode2;
        if (d == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = d.hashCode();
        }
        return this.g.hashCode() + (this.f.hashCode() + hmg.f(this.e, ((hashCode + f) * 31 + hashCode2) * 31, 31)) * 31;
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final String b = this.b;
        final d c = this.c;
        final c d = this.d;
        final String e = this.e;
        final b f = this.f;
        final List<a> g = this.g;
        final StringBuilder q = tqf.q("DirectMessageInfo(id=", a, ", created_at_sec=", b, ", sender_results=");
        q.append(c);
        q.append(", recipient_results=");
        q.append(d);
        q.append(", text=");
        q.append(e);
        q.append(", entities=");
        q.append(f);
        q.append(", attachments=");
        return e1.z(q, (List)g, ")");
    }
    
    public static final class a
    {
        public final String a;
        public final jf7 b;
        
        public a(final String a, final jf7 b) {
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
            final jf7 b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("Attachment(__typename=");
            sb.append(a);
            sb.append(", dMAttachment=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class b
    {
        public final String a;
        public final a7a b;
        
        public b(final String a, final a7a b) {
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
            final a7a b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("Entities(__typename=");
            sb.append(a);
            sb.append(", entitySet=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class c
    {
        public final String a;
        public final nx8 b;
        
        public c(final String a, final nx8 b) {
            this.a = a;
            this.b = b;
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
            return czd.a((Object)this.a, (Object)c.a) && czd.a((Object)this.b, (Object)c.b);
        }
        
        @Override
        public final int hashCode() {
            return this.b.hashCode() + this.a.hashCode() * 31;
        }
        
        @Override
        public final String toString() {
            final String a = this.a;
            final nx8 b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("Recipient_results(__typename=");
            sb.append(a);
            sb.append(", directMessageUserResults=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class d
    {
        public final String a;
        public final nx8 b;
        
        public d(final String a, final nx8 b) {
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
            return czd.a((Object)this.a, (Object)d.a) && czd.a((Object)this.b, (Object)d.b);
        }
        
        @Override
        public final int hashCode() {
            return this.b.hashCode() + this.a.hashCode() * 31;
        }
        
        @Override
        public final String toString() {
            final String a = this.a;
            final nx8 b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("Sender_results(__typename=");
            sb.append(a);
            sb.append(", directMessageUserResults=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
}
