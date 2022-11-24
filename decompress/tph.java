// 
// Decompiled by Procyon v0.6.0
// 

public final class tph extends vxs
{
    public final gph k;
    public final hp6 l;
    public final agv m;
    public final int n;
    
    public tph(final a a) {
        super((vxs$a)a);
        final gph l = a.l;
        vmw.g((Object)l);
        this.k = l;
        this.n = a.m;
        this.l = a.n;
        this.m = a.k;
    }
    
    public static final class a extends vxs$a<tph, a>
    {
        public agv k;
        public gph l;
        public int m;
        public hp6 n;
        
        public a(final long n) {
            super(n);
            this.m = 1;
        }
        
        public final Object i() {
            return new tph(this);
        }
        
        public final boolean k() {
            return this.l != null && this.m != 0;
        }
    }
}
