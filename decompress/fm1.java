// 
// Decompiled by Procyon v0.6.0
// 

public abstract class fm1 extends bur
{
    public final p2t j;
    public final String k;
    public final tej l;
    public final tbi m;
    public final hdj n;
    
    public fm1(final a<?> a) {
        e0e.f((Object)a, "builder");
        super((bur$a)a);
        this.j = a.k;
        this.k = a.l;
        this.l = a.m;
        this.m = a.n;
        this.n = a.o;
    }
    
    public abstract static class a<S extends fm1> extends bur$a<S, a<S>>
    {
        public p2t k;
        public String l;
        public tej m;
        public tbi n;
        public hdj o;
        
        public final boolean k() {
            if (this.k != null || this.l != null) {
                return true;
            }
            throw new IllegalArgumentException("Timeline input is missing".toString());
        }
    }
}
