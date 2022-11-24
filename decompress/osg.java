import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class osg
{
    public final List<a> a;
    
    public osg(final List<a> a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof osg && e0e.a((Object)this.a, (Object)((osg)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        return rh.x("MediaColorInfo(palette=", (List)this.a, ")");
    }
    
    public static final class a
    {
        public final double a;
        public final b b;
        
        public a(final double a, final b b) {
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
            return Double.compare(this.a, a.a) == 0 && e0e.a((Object)this.b, (Object)a.b);
        }
        
        @Override
        public final int hashCode() {
            final long doubleToLongBits = Double.doubleToLongBits(this.a);
            return this.b.hashCode() + (int)(doubleToLongBits ^ doubleToLongBits >>> 32) * 31;
        }
        
        @Override
        public final String toString() {
            final double a = this.a;
            final b b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("Palette(percentage=");
            sb.append(a);
            sb.append(", rgb=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class b
    {
        public final int a;
        public final int b;
        public final int c;
        
        public b(final int a, final int b, final int c) {
            this.a = a;
            this.b = b;
            this.c = c;
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
            return this.a == b.a && this.b == b.b && this.c == b.c;
        }
        
        @Override
        public final int hashCode() {
            return (this.a * 31 + this.b) * 31 + this.c;
        }
        
        @Override
        public final String toString() {
            return ad.y(xnf.g("Rgb(blue=", this.a, ", green=", this.b, ", red="), this.c, ")");
        }
    }
}
