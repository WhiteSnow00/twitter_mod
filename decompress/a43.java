// 
// Decompiled by Procyon v0.6.0
// 

public final class a43
{
    public final ci3 a;
    public final ei3 b;
    public final a c;
    public final xi3 d;
    public final gi3 e;
    public final b f;
    public final Boolean g;
    
    public a43(final ci3 a, final ei3 b, final a c, final xi3 d, final gi3 e, final b f, final Boolean g) {
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
        if (!(o instanceof a43)) {
            return false;
        }
        final a43 a43 = (a43)o;
        return this.a == a43.a && this.b == a43.b && czd.a((Object)this.c, (Object)a43.c) && this.d == a43.d && this.e == a43.e && czd.a((Object)this.f, (Object)a43.f) && czd.a((Object)this.g, (Object)a43.g);
    }
    
    @Override
    public final int hashCode() {
        final ci3 a = this.a;
        int hashCode = 0;
        int hashCode2;
        if (a == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = a.hashCode();
        }
        final int hashCode3 = this.b.hashCode();
        final a c = this.c;
        int hashCode4;
        if (c == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = c.hashCode();
        }
        final xi3 d = this.d;
        int hashCode5;
        if (d == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = d.hashCode();
        }
        final gi3 e = this.e;
        int hashCode6;
        if (e == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = e.hashCode();
        }
        final b f = this.f;
        int hashCode7;
        if (f == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = f.hashCode();
        }
        final Boolean g = this.g;
        if (g != null) {
            hashCode = g.hashCode();
        }
        return (((((hashCode3 + hashCode2 * 31) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode6) * 31 + hashCode7) * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final ci3 a = this.a;
        final ei3 b = this.b;
        final a c = this.c;
        final xi3 d = this.d;
        final gi3 e = this.e;
        final b f = this.f;
        final Boolean g = this.g;
        final StringBuilder sb = new StringBuilder();
        sb.append("ButtonElement(action=");
        sb.append(a);
        sb.append(", button_type=");
        sb.append(b);
        sb.append(", destination_obj=");
        sb.append(c);
        sb.append(", icon_type=");
        sb.append(d);
        sb.append(", style=");
        sb.append(e);
        sb.append(", text=");
        sb.append(f);
        sb.append(", use_dominant_color=");
        sb.append(g);
        sb.append(")");
        return sb.toString();
    }
    
    public static final class a
    {
        public final String a;
        public final er8 b;
        
        public a(final String a, final er8 b) {
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
            final er8 b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("Destination_obj(__typename=");
            sb.append(a);
            sb.append(", destination=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class b
    {
        public final String a;
        public final rx8 b;
        
        public b(final String a, final rx8 b) {
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
            final rx8 b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("Text(__typename=");
            sb.append(a);
            sb.append(", directionalStringElement=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
}
