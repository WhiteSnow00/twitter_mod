import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jvg extends d8a<wtg>
{
    public static final nmp<jvg> H0;
    public static final jvg I0;
    
    static {
        jvg.H0 = new b();
        final ged$b g0 = ged.G0;
        final int a = o5j.a;
        I0 = new jvg((List<wtg>)g0);
    }
    
    public jvg(final List<wtg> list) {
        super(list);
    }
    
    public static jvg i(final List<wtg> list) {
        final a a = new a(list.size());
        a.o(list);
        return (jvg)a.e();
    }
    
    public final boolean j(final wtg$c wtg$c) {
        final Iterator<wtg> iterator = this.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().V0 == wtg$c) {
                return true;
            }
        }
        return false;
    }
    
    public final boolean k() {
        final Iterator<wtg> iterator = this.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().c1) {
                return true;
            }
        }
        return false;
    }
    
    public static final class a extends d8a.a<wtg, jvg, a>
    {
        public a() {
        }
        
        public a(final int n) {
            super(n);
        }
        
        public a(final jvg jvg) {
            super(jvg);
        }
        
        @Override
        public final d8a s(final List list) {
            jvg i0;
            if (!kr4.t((Collection)list)) {
                i0 = new jvg(list);
            }
            else {
                i0 = jvg.I0;
            }
            return i0;
        }
    }
    
    public static final class b extends k5j<jvg>
    {
        public final Object d(final rmp rmp, int i) throws IOException, ClassNotFoundException {
            final int z = rmp.z();
            final a a = new a();
            for (i = 0; i < z; ++i) {
                ((d8a.a<wtg, d8a, d8a.a>)a).p((wtg)((nmp)wtg.r1).b(rmp));
            }
            return ((d8a.a<wtg, jvg, d8a.a>)a).q();
        }
        
        public final void f(final smp smp, final Object o) throws IOException {
            final jvg jvg = (jvg)o;
            smp.z(jvg.size());
            final Iterator<wtg> iterator = jvg.iterator();
            while (iterator.hasNext()) {
                ((k5j)wtg.r1).c(smp, (Object)iterator.next());
            }
        }
    }
}
