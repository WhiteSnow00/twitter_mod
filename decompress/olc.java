// 
// Decompiled by Procyon v0.6.0
// 

public final class olc extends r7a implements Comparable<r7a>
{
    public static final nmp<olc> K0;
    
    static {
        olc.K0 = new olc.olc$b();
        final d8a g0 = d8a.G0;
    }
    
    public olc(final a a) {
        super((r7a.a)a);
    }
    
    @Override
    public final int compareTo(final Object o) {
        return r7a.J0.compare(this, o);
    }
    
    @Override
    public final r7a.a g() {
        return new a(this);
    }
    
    public static final class a extends r7a.a<olc, a>
    {
        public a() {
        }
        
        public a(final olc olc) {
            super(olc);
        }
        
        public final Object i() {
            return new olc(this);
        }
        
        public final boolean k() {
            final int b = super.b;
            return b > -1 && b <= super.c;
        }
    }
}
