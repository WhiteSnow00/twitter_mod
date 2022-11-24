// 
// Decompiled by Procyon v0.6.0
// 

public abstract class m0k
{
    public final boolean a;
    public final boolean b;
    
    public m0k(boolean a, boolean b, final int n) {
        if ((n & 0x1) != 0x0) {
            a = false;
        }
        if ((n & 0x2) != 0x0) {
            b = false;
        }
        this.a = a;
        this.b = b;
    }
    
    public static final class a extends m0k
    {
        public final float c;
        public final float d;
        public final float e;
        public final boolean f;
        public final boolean g;
        public final float h;
        public final float i;
        
        public a(final float c, final float d, final float e, final boolean f, final boolean g, final float h, final float i) {
            super(false, false, 3);
            this.c = c;
            this.d = d;
            this.e = e;
            this.f = f;
            this.g = g;
            this.h = h;
            this.i = i;
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
            return e0e.a((Object)this.c, (Object)a.c) && e0e.a((Object)this.d, (Object)a.d) && e0e.a((Object)this.e, (Object)a.e) && this.f == a.f && this.g == a.g && e0e.a((Object)this.h, (Object)a.h) && e0e.a((Object)this.i, (Object)a.i);
        }
        
        @Override
        public final int hashCode() {
            final int g = dn.g(this.e, dn.g(this.d, Float.floatToIntBits(this.c) * 31, 31), 31);
            final int f = this.f ? 1 : 0;
            int n = 1;
            int n2 = f;
            if (f != 0) {
                n2 = 1;
            }
            final int g2 = this.g ? 1 : 0;
            if (g2 == 0) {
                n = g2;
            }
            return Float.floatToIntBits(this.i) + dn.g(this.h, ((g + n2) * 31 + n) * 31, 31);
        }
        
        @Override
        public final String toString() {
            final StringBuilder f = ehk.f("ArcTo(horizontalEllipseRadius=");
            f.append(this.c);
            f.append(", verticalEllipseRadius=");
            f.append(this.d);
            f.append(", theta=");
            f.append(this.e);
            f.append(", isMoreThanHalf=");
            f.append(this.f);
            f.append(", isPositiveArc=");
            f.append(this.g);
            f.append(", arcStartX=");
            f.append(this.h);
            f.append(", arcStartY=");
            return dn.C(f, this.i, ')');
        }
    }
    
    public static final class b extends m0k
    {
        public static final b c;
        
        static {
            c = new b();
        }
        
        public b() {
            super(false, false, 3);
        }
    }
    
    public static final class c extends m0k
    {
        public final float c;
        public final float d;
        public final float e;
        public final float f;
        public final float g;
        public final float h;
        
        public c(final float c, final float d, final float e, final float f, final float g, final float h) {
            super(true, false, 2);
            this.c = c;
            this.d = d;
            this.e = e;
            this.f = f;
            this.g = g;
            this.h = h;
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
            return e0e.a((Object)this.c, (Object)c.c) && e0e.a((Object)this.d, (Object)c.d) && e0e.a((Object)this.e, (Object)c.e) && e0e.a((Object)this.f, (Object)c.f) && e0e.a((Object)this.g, (Object)c.g) && e0e.a((Object)this.h, (Object)c.h);
        }
        
        @Override
        public final int hashCode() {
            return Float.floatToIntBits(this.h) + dn.g(this.g, dn.g(this.f, dn.g(this.e, dn.g(this.d, Float.floatToIntBits(this.c) * 31, 31), 31), 31), 31);
        }
        
        @Override
        public final String toString() {
            final StringBuilder f = ehk.f("CurveTo(x1=");
            f.append(this.c);
            f.append(", y1=");
            f.append(this.d);
            f.append(", x2=");
            f.append(this.e);
            f.append(", y2=");
            f.append(this.f);
            f.append(", x3=");
            f.append(this.g);
            f.append(", y3=");
            return dn.C(f, this.h, ')');
        }
    }
    
    public static final class d extends m0k
    {
        public final float c;
        
        public d(final float c) {
            super(false, false, 3);
            this.c = c;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof d && e0e.a((Object)this.c, (Object)((d)o).c));
        }
        
        @Override
        public final int hashCode() {
            return Float.floatToIntBits(this.c);
        }
        
        @Override
        public final String toString() {
            return dn.C(ehk.f("HorizontalTo(x="), this.c, ')');
        }
    }
    
    public static final class e extends m0k
    {
        public final float c;
        public final float d;
        
        public e(final float c, final float d) {
            super(false, false, 3);
            this.c = c;
            this.d = d;
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
            return e0e.a((Object)this.c, (Object)e.c) && e0e.a((Object)this.d, (Object)e.d);
        }
        
        @Override
        public final int hashCode() {
            return Float.floatToIntBits(this.d) + Float.floatToIntBits(this.c) * 31;
        }
        
        @Override
        public final String toString() {
            final StringBuilder f = ehk.f("LineTo(x=");
            f.append(this.c);
            f.append(", y=");
            return dn.C(f, this.d, ')');
        }
    }
    
    public static final class f extends m0k
    {
        public final float c;
        public final float d;
        
        public f(final float c, final float d) {
            super(false, false, 3);
            this.c = c;
            this.d = d;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof f)) {
                return false;
            }
            final f f = (f)o;
            return e0e.a((Object)this.c, (Object)f.c) && e0e.a((Object)this.d, (Object)f.d);
        }
        
        @Override
        public final int hashCode() {
            return Float.floatToIntBits(this.d) + Float.floatToIntBits(this.c) * 31;
        }
        
        @Override
        public final String toString() {
            final StringBuilder f = ehk.f("MoveTo(x=");
            f.append(this.c);
            f.append(", y=");
            return dn.C(f, this.d, ')');
        }
    }
    
    public static final class g extends m0k
    {
        public final float c;
        public final float d;
        public final float e;
        public final float f;
        
        public g(final float c, final float d, final float e, final float f) {
            super(false, true, 1);
            this.c = c;
            this.d = d;
            this.e = e;
            this.f = f;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof g)) {
                return false;
            }
            final g g = (g)o;
            return e0e.a((Object)this.c, (Object)g.c) && e0e.a((Object)this.d, (Object)g.d) && e0e.a((Object)this.e, (Object)g.e) && e0e.a((Object)this.f, (Object)g.f);
        }
        
        @Override
        public final int hashCode() {
            return Float.floatToIntBits(this.f) + dn.g(this.e, dn.g(this.d, Float.floatToIntBits(this.c) * 31, 31), 31);
        }
        
        @Override
        public final String toString() {
            final StringBuilder f = ehk.f("QuadTo(x1=");
            f.append(this.c);
            f.append(", y1=");
            f.append(this.d);
            f.append(", x2=");
            f.append(this.e);
            f.append(", y2=");
            return dn.C(f, this.f, ')');
        }
    }
    
    public static final class h extends m0k
    {
        public final float c;
        public final float d;
        public final float e;
        public final float f;
        
        public h(final float c, final float d, final float e, final float f) {
            super(true, false, 2);
            this.c = c;
            this.d = d;
            this.e = e;
            this.f = f;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof h)) {
                return false;
            }
            final h h = (h)o;
            return e0e.a((Object)this.c, (Object)h.c) && e0e.a((Object)this.d, (Object)h.d) && e0e.a((Object)this.e, (Object)h.e) && e0e.a((Object)this.f, (Object)h.f);
        }
        
        @Override
        public final int hashCode() {
            return Float.floatToIntBits(this.f) + dn.g(this.e, dn.g(this.d, Float.floatToIntBits(this.c) * 31, 31), 31);
        }
        
        @Override
        public final String toString() {
            final StringBuilder f = ehk.f("ReflectiveCurveTo(x1=");
            f.append(this.c);
            f.append(", y1=");
            f.append(this.d);
            f.append(", x2=");
            f.append(this.e);
            f.append(", y2=");
            return dn.C(f, this.f, ')');
        }
    }
    
    public static final class i extends m0k
    {
        public final float c;
        public final float d;
        
        public i(final float c, final float d) {
            super(false, true, 1);
            this.c = c;
            this.d = d;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof i)) {
                return false;
            }
            final i i = (i)o;
            return e0e.a((Object)this.c, (Object)i.c) && e0e.a((Object)this.d, (Object)i.d);
        }
        
        @Override
        public final int hashCode() {
            return Float.floatToIntBits(this.d) + Float.floatToIntBits(this.c) * 31;
        }
        
        @Override
        public final String toString() {
            final StringBuilder f = ehk.f("ReflectiveQuadTo(x=");
            f.append(this.c);
            f.append(", y=");
            return dn.C(f, this.d, ')');
        }
    }
    
    public static final class j extends m0k
    {
        public final float c;
        public final float d;
        public final float e;
        public final boolean f;
        public final boolean g;
        public final float h;
        public final float i;
        
        public j(final float c, final float d, final float e, final boolean f, final boolean g, final float h, final float i) {
            super(false, false, 3);
            this.c = c;
            this.d = d;
            this.e = e;
            this.f = f;
            this.g = g;
            this.h = h;
            this.i = i;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof j)) {
                return false;
            }
            final j j = (j)o;
            return e0e.a((Object)this.c, (Object)j.c) && e0e.a((Object)this.d, (Object)j.d) && e0e.a((Object)this.e, (Object)j.e) && this.f == j.f && this.g == j.g && e0e.a((Object)this.h, (Object)j.h) && e0e.a((Object)this.i, (Object)j.i);
        }
        
        @Override
        public final int hashCode() {
            final int g = dn.g(this.e, dn.g(this.d, Float.floatToIntBits(this.c) * 31, 31), 31);
            final int f = this.f ? 1 : 0;
            int n = 1;
            int n2 = f;
            if (f != 0) {
                n2 = 1;
            }
            final int g2 = this.g ? 1 : 0;
            if (g2 == 0) {
                n = g2;
            }
            return Float.floatToIntBits(this.i) + dn.g(this.h, ((g + n2) * 31 + n) * 31, 31);
        }
        
        @Override
        public final String toString() {
            final StringBuilder f = ehk.f("RelativeArcTo(horizontalEllipseRadius=");
            f.append(this.c);
            f.append(", verticalEllipseRadius=");
            f.append(this.d);
            f.append(", theta=");
            f.append(this.e);
            f.append(", isMoreThanHalf=");
            f.append(this.f);
            f.append(", isPositiveArc=");
            f.append(this.g);
            f.append(", arcStartDx=");
            f.append(this.h);
            f.append(", arcStartDy=");
            return dn.C(f, this.i, ')');
        }
    }
    
    public static final class k extends m0k
    {
        public final float c;
        public final float d;
        public final float e;
        public final float f;
        public final float g;
        public final float h;
        
        public k(final float c, final float d, final float e, final float f, final float g, final float h) {
            super(true, false, 2);
            this.c = c;
            this.d = d;
            this.e = e;
            this.f = f;
            this.g = g;
            this.h = h;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof k)) {
                return false;
            }
            final k k = (k)o;
            return e0e.a((Object)this.c, (Object)k.c) && e0e.a((Object)this.d, (Object)k.d) && e0e.a((Object)this.e, (Object)k.e) && e0e.a((Object)this.f, (Object)k.f) && e0e.a((Object)this.g, (Object)k.g) && e0e.a((Object)this.h, (Object)k.h);
        }
        
        @Override
        public final int hashCode() {
            return Float.floatToIntBits(this.h) + dn.g(this.g, dn.g(this.f, dn.g(this.e, dn.g(this.d, Float.floatToIntBits(this.c) * 31, 31), 31), 31), 31);
        }
        
        @Override
        public final String toString() {
            final StringBuilder f = ehk.f("RelativeCurveTo(dx1=");
            f.append(this.c);
            f.append(", dy1=");
            f.append(this.d);
            f.append(", dx2=");
            f.append(this.e);
            f.append(", dy2=");
            f.append(this.f);
            f.append(", dx3=");
            f.append(this.g);
            f.append(", dy3=");
            return dn.C(f, this.h, ')');
        }
    }
    
    public static final class l extends m0k
    {
        public final float c;
        
        public l(final float c) {
            super(false, false, 3);
            this.c = c;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof l && e0e.a((Object)this.c, (Object)((l)o).c));
        }
        
        @Override
        public final int hashCode() {
            return Float.floatToIntBits(this.c);
        }
        
        @Override
        public final String toString() {
            return dn.C(ehk.f("RelativeHorizontalTo(dx="), this.c, ')');
        }
    }
    
    public static final class m extends m0k
    {
        public final float c;
        public final float d;
        
        public m(final float c, final float d) {
            super(false, false, 3);
            this.c = c;
            this.d = d;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof m)) {
                return false;
            }
            final m m = (m)o;
            return e0e.a((Object)this.c, (Object)m.c) && e0e.a((Object)this.d, (Object)m.d);
        }
        
        @Override
        public final int hashCode() {
            return Float.floatToIntBits(this.d) + Float.floatToIntBits(this.c) * 31;
        }
        
        @Override
        public final String toString() {
            final StringBuilder f = ehk.f("RelativeLineTo(dx=");
            f.append(this.c);
            f.append(", dy=");
            return dn.C(f, this.d, ')');
        }
    }
    
    public static final class n extends m0k
    {
        public final float c;
        public final float d;
        
        public n(final float c, final float d) {
            super(false, false, 3);
            this.c = c;
            this.d = d;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof n)) {
                return false;
            }
            final n n = (n)o;
            return e0e.a((Object)this.c, (Object)n.c) && e0e.a((Object)this.d, (Object)n.d);
        }
        
        @Override
        public final int hashCode() {
            return Float.floatToIntBits(this.d) + Float.floatToIntBits(this.c) * 31;
        }
        
        @Override
        public final String toString() {
            final StringBuilder f = ehk.f("RelativeMoveTo(dx=");
            f.append(this.c);
            f.append(", dy=");
            return dn.C(f, this.d, ')');
        }
    }
    
    public static final class o extends m0k
    {
        public final float c;
        public final float d;
        public final float e;
        public final float f;
        
        public o(final float c, final float d, final float e, final float f) {
            super(false, true, 1);
            this.c = c;
            this.d = d;
            this.e = e;
            this.f = f;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof o)) {
                return false;
            }
            final o o2 = (o)o;
            return e0e.a((Object)this.c, (Object)o2.c) && e0e.a((Object)this.d, (Object)o2.d) && e0e.a((Object)this.e, (Object)o2.e) && e0e.a((Object)this.f, (Object)o2.f);
        }
        
        @Override
        public final int hashCode() {
            return Float.floatToIntBits(this.f) + dn.g(this.e, dn.g(this.d, Float.floatToIntBits(this.c) * 31, 31), 31);
        }
        
        @Override
        public final String toString() {
            final StringBuilder f = ehk.f("RelativeQuadTo(dx1=");
            f.append(this.c);
            f.append(", dy1=");
            f.append(this.d);
            f.append(", dx2=");
            f.append(this.e);
            f.append(", dy2=");
            return dn.C(f, this.f, ')');
        }
    }
}
