import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jr implements mxs
{
    public final List<tvs> a;
    
    public jr(final List<? extends tvs> a) {
        this.a = (List<tvs>)a;
        final tvs tvs = (tvs)rr4.E1((List)a);
    }
    
    public static final class a implements xtd
    {
        public final boolean a;
        public final d6h b;
        public final List<tvs> c;
        
        public a(final d6h d6h, final int n, final List<? extends tvs> a, final boolean b) {
            e0e.f((Object)n, "timelineEntities");
            this.a = (boolean)a;
            d6h d = d6h;
            if (d6h == null) {
                d = d6h.d;
            }
            this.b = d;
            this.c = rr4.i2((Iterable)n);
        }
        
        public final boolean a() {
            return this.b.a();
        }
    }
}
