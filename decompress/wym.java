// 
// Decompiled by Procyon v0.6.0
// 

public final class wym implements kgs
{
    public static final nmp<wym> H0;
    public final long F0;
    public final String G0;
    
    static {
        wym.H0 = new wym.wym$b();
    }
    
    public wym(final a a) {
        this.F0 = a.a;
        final String b = a.b;
        vmw.g((Object)b);
        this.G0 = b;
    }
    
    public static final class a extends z4j<wym>
    {
        public long a;
        public String b;
        
        public a() {
            this.a = -1L;
        }
        
        public final Object i() {
            return new wym(this);
        }
        
        public final boolean k() {
            return this.a != -1L && this.b != null;
        }
    }
}
