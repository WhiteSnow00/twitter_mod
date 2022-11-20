import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class l4f
{
    public final List<a> a;
    public final b b;
    public final String c;
    public final String d;
    public final List<c> e;
    
    public l4f(final List<a> a, final b b, final String c, final String d, final List<c> e) {
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
        if (!(o instanceof l4f)) {
            return false;
        }
        final l4f l4f = (l4f)o;
        return czd.a((Object)this.a, (Object)l4f.a) && czd.a((Object)this.b, (Object)l4f.b) && czd.a((Object)this.c, (Object)l4f.c) && czd.a((Object)this.d, (Object)l4f.d) && czd.a((Object)this.e, (Object)l4f.e);
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
        final b b = this.b;
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = b.hashCode();
        }
        final String c = this.c;
        int hashCode4;
        if (c == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = c.hashCode();
        }
        final String d = this.d;
        int hashCode5;
        if (d == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = d.hashCode();
        }
        final List<c> e = this.e;
        if (e != null) {
            hashCode = e.hashCode();
        }
        return (((hashCode2 * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final List<a> a = this.a;
        final b b = this.b;
        final String c = this.c;
        final String d = this.d;
        final List<c> e = this.e;
        final StringBuilder sb = new StringBuilder();
        sb.append("LegacyCard(binding_values=");
        sb.append(a);
        sb.append(", card_platform=");
        sb.append(b);
        sb.append(", name=");
        nb0.z(sb, c, ", url=", d, ", user_refs_results=");
        return e1.z(sb, (List)e, ")");
    }
    
    public static final class a
    {
        public final String a;
        public final d b;
        
        public a(final String a, final d b) {
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
            final d b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("Binding_value(key=");
            sb.append(a);
            sb.append(", value=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class b
    {
        public final String a;
        public final te0 b;
        
        public b(final String a, final te0 b) {
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
            final te0 b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("Card_platform(__typename=");
            sb.append(a);
            sb.append(", apiCardPlatform=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class c
    {
        public final String a;
        public final piw b;
        
        public c(final String a, final piw b) {
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
            final piw b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("User_refs_result(__typename=");
            sb.append(a);
            sb.append(", userResults=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class d
    {
        public final String a;
        public final oe0 b;
        
        public d(final String a, final oe0 b) {
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
            final oe0 b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("Value(__typename=");
            sb.append(a);
            sb.append(", apiCardBindingValue=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
}
