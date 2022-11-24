import java.util.Objects;
import java.io.IOException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abc
{
    public static final nmp<abc> d;
    public final String a;
    public final String b;
    public final wxl c;
    
    static {
        abc.d = new b();
    }
    
    public abc(final a a) {
        this.a = a.a;
        this.b = a.b;
        this.c = a.c;
    }
    
    public final void a(final yfe yfe) throws IOException {
        yfe.i("guide_item_details");
        yfe.r0();
        final String a = this.a;
        if (a != null) {
            yfe.u0("item_type", a);
        }
        final String b = this.b;
        if (b != null) {
            yfe.u0("source_data", b);
        }
        final wxl c = this.c;
        if (c != null) {
            yfe.i("transparent_guide_details");
            yfe.p0(c.a);
        }
        yfe.h();
    }
    
    @Override
    public final boolean equals(final Object o) {
        final boolean b = false;
        if (this != o) {
            boolean b2 = b;
            if (!(o instanceof abc)) {
                return b2;
            }
            final abc abc = (abc)o;
            final boolean b3 = this == abc || (abc != null && o5j.a((Object)this.a, (Object)abc.a) && o5j.a((Object)this.b, (Object)abc.b) && o5j.a((Object)this.c, (Object)abc.c));
            b2 = b;
            if (!b3) {
                return b2;
            }
        }
        return true;
    }
    
    @Override
    public final int hashCode() {
        return o5j.h((Object)this.a, (Object)this.b, (Object)this.c);
    }
    
    @Override
    public final String toString() {
        final StringBuilder f = ehk.f("GuideScribeDetails {identifier='");
        go9.r(f, this.a, '\'', ", token='");
        go9.r(f, this.b, '\'', ", mTransparentGuideDetails='");
        f.append(this.c);
        f.append('\'');
        f.append('}');
        return f.toString();
    }
    
    public static final class a extends z4j<abc>
    {
        public String a;
        public String b;
        public wxl c;
        
        public final Object i() {
            return new abc(this);
        }
    }
    
    public static final class b extends ss2<abc, a>
    {
        public b() {
            super(1);
        }
        
        public final void f(smp g, final Object o) throws IOException {
            final abc abc = (abc)o;
            g = g.G(abc.a).G(abc.b);
            final wxl c = abc.c;
            final wxl$a b = wxl.b;
            Objects.requireNonNull(g);
            ((k5j)b).c(g, (Object)c);
            final int a = o5j.a;
        }
        
        public final z4j g() {
            return new a();
        }
        
        public final void h(final rmp rmp, final z4j z4j, final int n) throws IOException, ClassNotFoundException {
            final a a = (a)z4j;
            a.a = rmp.I();
            a.b = rmp.I();
            if (n < 1) {
                gmp.d(rmp);
                a.c = null;
            }
            else {
                a.c = (wxl)((k5j)wxl.b).a(rmp);
            }
        }
    }
}
