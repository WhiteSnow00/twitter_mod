// 
// Decompiled by Procyon v0.6.0
// 

public final class z77 extends lsr
{
    public final String j;
    
    public z77(final a a) {
        super((lsr$a)a);
        String k;
        if ((k = a.k) == null) {
            k = "";
        }
        this.j = k;
    }
    
    @Override
    public final asr b(final String s) {
        return (asr)new y77(s, this);
    }
    
    public static final class a extends lsr$a<z77, a>
    {
        public String k;
        
        public final Object i() {
            return new z77(this);
        }
    }
}
