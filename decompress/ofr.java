import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import com.twitter.util.user.UserIdentifier;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

@Deprecated
public final class ofr extends i1v<List<rh0>>
{
    public final List<Long> i1;
    public final ofr.ofr$a j1;
    public List<rh0> k1;
    
    public ofr(final UserIdentifier userIdentifier, final List<Long> i1, final ofr.ofr$a j1) {
        super(userIdentifier, 0);
        this.i1 = i1;
        this.j1 = j1;
    }
    
    @Override
    public final qrc f0() {
        final rbv u = lf.u("/1.1/statuses/lookup.json", "/");
        final int a = w4j.a;
        u.p();
        ((qrc.a)u).f("include_carousels", true);
        ((qrc.a)u).e("id", this.i1);
        ((qrc.a)u).f("include_blocking", true);
        u.q();
        u.o();
        u.r();
        u.s();
        return ((qrc.a)u).k();
    }
    
    @Override
    public final wsc<List<rh0>, pav> g0() {
        return new b();
    }
    
    @Override
    public final void n0(final tsc<List<rh0>, pav> tsc) {
        final List k1 = (List)tsc.g;
        this.k1 = k1;
        final ofr.ofr$a j1 = this.j1;
        if (j1 != null) {
            final pg3$a pg3$a = (pg3$a)j1;
            ij1.e();
            if (k1 != null) {
                pg3$a.a.N3((Collection)k1, pg3$a.b.D0.getId(), pg3$a.b.E0, -1L, false, (hn6)null, false);
            }
        }
    }
    
    public static final class b extends nhe<List<rh0>, pav>
    {
        @Override
        public final Object a(final khe khe) throws IOException {
            lje lje = khe.i0();
            final ArrayList list = new ArrayList();
            while (lje != null && lje != lje.N0) {
                if (lje == lje.K0) {
                    list.add(bih.c(khe, (Class)rh0.class, false));
                }
                lje = khe.i0();
            }
            return list;
        }
        
        @Override
        public final Object b(final khe khe, final int n) {
            return bih.c(khe, (Class)pav.class, false);
        }
    }
}
