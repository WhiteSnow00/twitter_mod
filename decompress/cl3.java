import java.io.IOException;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cl3 extends s78
{
    public static final nmp<cl3> c;
    
    static {
        cl3.c = new a();
    }
    
    public cl3() {
        super(kkg.t().q(true));
    }
    
    public cl3(final Map map, final xj0 xj0) {
        super(map);
    }
    
    public final void e(final String s, final Object o) {
        super.a.put(s, o);
    }
    
    public static final class a extends k5j<cl3>
    {
        public final Object d(final rmp rmp, final int n) throws IOException, ClassNotFoundException {
            final Map e = ar4.e(rmp, (nmp)rx6.f, (nmp)rx6.j);
            vmw.g((Object)e);
            return new cl3(e, null);
        }
        
        public final void f(final smp smp, final Object o) throws IOException {
            ar4.n(smp, ((cl3)o).a, (nmp)rx6.f, (nmp)rx6.j);
        }
    }
}
