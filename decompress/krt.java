import java.io.IOException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class krt
{
    public static final a c;
    public final String a;
    public final String b;
    
    static {
        c = new a();
    }
    
    public krt(final String a, final String b) {
        this.a = a;
        this.b = b;
    }
    
    public static final class a extends k5j<krt>
    {
        public final Object d(final rmp rmp, final int n) throws IOException, ClassNotFoundException {
            return new krt(rmp.C(), rmp.C());
        }
        
        public final void f(final smp smp, final Object o) throws IOException {
            final krt krt = (krt)o;
            smp.G(krt.a).G(krt.b);
        }
    }
}
