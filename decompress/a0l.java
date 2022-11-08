import java.io.IOException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class a0l implements prd
{
    public final boolean b;
    public final boolean c;
    
    public a0l(final a a) {
        this.b = a.a;
        this.c = a.b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && a0l.class == o.getClass()) {
            final a0l a0l = (a0l)o;
            if (this.b != a0l.b || this.c != a0l.c) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return w4j.g((Object)this.b, (Object)this.c);
    }
    
    public static final class a extends h4j<a0l>
    {
        public boolean a;
        public boolean b;
        
        public final Object i() {
            return new a0l(this);
        }
    }
    
    public static final class b extends js2<a0l, a>
    {
        public b() {
            super(0);
        }
        
        public final void f(final flp flp, final Object o) throws IOException {
            final a0l a0l = (a0l)o;
            flp.t(a0l.b).t(a0l.c);
        }
        
        public final h4j g() {
            return new a();
        }
        
        public final void h(final elp elp, final h4j h4j, final int n) throws IOException, ClassNotFoundException {
            final a a = (a)h4j;
            a.a = elp.u();
            a.b = elp.u();
        }
    }
}
