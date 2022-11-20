// 
// Decompiled by Procyon v0.6.0
// 

public final class pss extends zus implements ntw
{
    public final bj3 q;
    public final int r;
    
    public pss(final a a) {
        super((zus$a<?, ?>)a, 25);
        final bj3 p = a.p;
        jee.l((Object)p);
        this.q = p;
        this.r = a.q;
    }
    
    public static final class a extends zus$a<pss, a>
    {
        public bj3 p;
        public int q;
        
        public final Object i() {
            return new pss(this);
        }
        
        public final boolean l() {
            return this.p != null && this.q != 0 && super.l();
        }
    }
}
