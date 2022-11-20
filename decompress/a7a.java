import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class a7a
{
    public final List<a> a;
    public final List<c> b;
    public final List<d> c;
    public final List<e> d;
    public final List<b> e;
    
    public a7a(final List<a> a, final List<c> b, final List<d> c, final List<e> d, final List<b> e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof a7a)) {
            return false;
        }
        final a7a a7a = (a7a)o;
        return czd.a((Object)this.a, (Object)a7a.a) && czd.a((Object)this.b, (Object)a7a.b) && czd.a((Object)this.c, (Object)a7a.c) && czd.a((Object)this.d, (Object)a7a.d) && czd.a((Object)this.e, (Object)a7a.e);
    }
    
    @Override
    public final int hashCode() {
        final List<a> a = this.a;
        int hashCode = 0;
        int hashCode2;
        if (a == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = a.hashCode();
        }
        final List<c> b = this.b;
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = b.hashCode();
        }
        final List<d> c = this.c;
        int hashCode4;
        if (c == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = c.hashCode();
        }
        final List<e> d = this.d;
        int hashCode5;
        if (d == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = d.hashCode();
        }
        final List<b> e = this.e;
        if (e != null) {
            hashCode = e.hashCode();
        }
        return (((hashCode2 * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final List<a> a = this.a;
        final List<c> b = this.b;
        final List<d> c = this.c;
        final List<e> d = this.d;
        final List<b> e = this.e;
        final StringBuilder sb = new StringBuilder();
        sb.append("EntitySet(hashtags=");
        sb.append(a);
        sb.append(", symbols=");
        sb.append(b);
        sb.append(", urls=");
        sb.append(c);
        sb.append(", user_mentions=");
        sb.append(d);
        sb.append(", media=");
        return e1.z(sb, (List)e, ")");
    }
    
    public static final class a
    {
        public final String a;
        public final lh0 b;
        
        public a(final String a, final lh0 b) {
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
            final lh0 b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("Hashtag(__typename=");
            sb.append(a);
            sb.append(", apiTagEntity=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class b
    {
        public final String a;
        public final ctg b;
        
        public b(final String a, final ctg b) {
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
            final ctg b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("Medium(__typename=");
            sb.append(a);
            sb.append(", mediaEntity=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class c
    {
        public final String a;
        public final lh0 b;
        
        public c(final String a, final lh0 b) {
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
            final lh0 b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("Symbol(__typename=");
            sb.append(a);
            sb.append(", apiTagEntity=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class d
    {
        public final String a;
        public final m6w b;
        
        public d(final String a, final m6w b) {
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
            final m6w b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("Url(__typename=");
            sb.append(a);
            sb.append(", urlsEntity=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class e
    {
        public final String a;
        public final wg0 b;
        
        public e(final String a, final wg0 b) {
            this.a = a;
            this.b = b;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof e)) {
                return false;
            }
            final e e = (e)o;
            return czd.a((Object)this.a, (Object)e.a) && czd.a((Object)this.b, (Object)e.b);
        }
        
        @Override
        public final int hashCode() {
            return this.b.hashCode() + this.a.hashCode() * 31;
        }
        
        @Override
        public final String toString() {
            final String a = this.a;
            final wg0 b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("User_mention(__typename=");
            sb.append(a);
            sb.append(", apiMentionEntity=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
}
