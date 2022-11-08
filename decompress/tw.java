// 
// Decompiled by Procyon v0.6.0
// 

public final class tw extends lsr
{
    public final xrv j;
    public final boolean k;
    
    public tw(final b b) {
        super((lsr$a)b);
        this.j = b.k;
        this.k = b.l;
    }
    
    @Override
    public final asr<tw> b(final String s) {
        if (this.k) {
            return (asr<tw>)new uw(s, this);
        }
        return (asr<tw>)new rw(s, this);
    }
    
    public static final class b extends lsr$a<tw, b>
    {
        public xrv k;
        public boolean l;
        
        public final Object i() {
            return new tw(this);
        }
    }
}
