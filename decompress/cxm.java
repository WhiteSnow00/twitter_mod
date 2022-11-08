// 
// Decompiled by Procyon v0.6.0
// 

public final class cxm implements xes
{
    public static final cxm.cxm$b D0;
    public final int C0;
    
    static {
        D0 = new cxm.cxm$b();
    }
    
    public cxm(final a a) {
        this.C0 = a.a;
    }
    
    @Override
    public final String toString() {
        return y70.y(w48.g("RichTextFormattedEntity{format="), this.C0, '}');
    }
    
    public static final class a extends h4j<cxm>
    {
        public int a;
        
        public final Object i() {
            return new cxm(this);
        }
    }
}
