import java.io.IOException;
import java.util.Objects;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class opv
{
    public static final nmp<opv> b;
    public final List<vov> a;
    
    static {
        opv.b = new a();
    }
    
    public opv(final List<vov> a) {
        this.a = a;
    }
    
    public static final class a extends k5j<opv>
    {
        public final Object d(final rmp rmp, final int n) throws IOException, ClassNotFoundException {
            final ar4$a ar4$a = new ar4$a((nmp)vov.b);
            Objects.requireNonNull(rmp);
            return new opv((List<vov>)((k5j)ar4$a).a(rmp));
        }
        
        public final void f(final smp smp, final Object o) throws IOException {
            final List<vov> a = ((opv)o).a;
            final ar4$a ar4$a = new ar4$a((nmp)vov.b);
            Objects.requireNonNull(smp);
            ((k5j)ar4$a).c(smp, (Object)a);
            final int a2 = o5j.a;
        }
    }
}
