import java.io.IOException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class f5h implements vrd
{
    public final String b;
    
    public f5h(final String b) {
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof f5h && o5j.a((Object)this.b, (Object)((f5h)o).b));
    }
    
    @Override
    public final int hashCode() {
        return o5j.f((Object)this.b);
    }
    
    public static final class a extends k5j<f5h>
    {
        public final Object d(final rmp rmp, final int n) throws IOException, ClassNotFoundException {
            return new f5h(rmp.C());
        }
        
        public final void f(final smp smp, final Object o) throws IOException {
            smp.G(((f5h)o).b);
        }
    }
}
