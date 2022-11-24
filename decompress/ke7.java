import java.io.IOException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ke7
{
    public static final nmp<ke7> c;
    public final b8d a;
    public final int b;
    
    static {
        ke7.c = new b();
    }
    
    public ke7(final a a) {
        this.a = a.a;
        this.b = a.b;
    }
    
    public final String a() {
        final b8d a = this.a;
        String f0;
        if (a != null) {
            f0 = a.F0;
        }
        else {
            f0 = null;
        }
        return f0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && ke7.class == o.getClass()) {
            final ke7 ke7 = (ke7)o;
            if (!o5j.a((Object)this.a, (Object)ke7.a) || this.b != ke7.b) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return o5j.g((Object)this.a, (Object)this.b);
    }
    
    @Override
    public final String toString() {
        final StringBuilder f = ehk.f("CustomizationInfo{mImageModel=");
        f.append(this.a);
        f.append(", titleColor=");
        return gwl.x(f, this.b, '}');
    }
    
    public static final class a extends z4j<ke7>
    {
        public b8d a;
        public int b;
        
        public a() {
            this.b = 0;
        }
        
        public final Object i() {
            return new ke7(this);
        }
    }
    
    public static final class b extends k5j<ke7>
    {
        public static final nmp<b8d> b;
        
        static {
            ke7.b.b = b8d.I0;
        }
        
        public final Object d(final rmp rmp, int z) throws IOException, ClassNotFoundException {
            final b8d a = (b8d)((k5j)ke7.b.b).a(rmp);
            z = rmp.z();
            final a a2 = new a();
            a2.a = a;
            a2.b = z;
            return a2.e();
        }
        
        public final void f(final smp smp, final Object o) throws IOException {
            final ke7 ke7 = (ke7)o;
            ((k5j)ke7.b.b).c(smp, (Object)ke7.a);
            smp.z(ke7.b);
        }
    }
}
