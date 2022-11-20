// 
// Decompiled by Procyon v0.6.0
// 

public abstract class qdk extends dtr
{
    public final cej j;
    public final String k;
    public final ssv l;
    
    public qdk(final a a) {
        super((dtr$a)a);
        final cej k = a.k;
        final cej l0 = cej.L0;
        cej j = k;
        if (k == null) {
            j = l0;
        }
        this.j = j;
        String i;
        if ((i = a.l) == null) {
            i = "";
        }
        this.k = i;
        final ssv m = a.m;
        jee.l((Object)m);
        this.l = m;
    }
    
    public abstract static class a<SP extends qdk, B extends a<SP, B>> extends dtr$a<SP, B>
    {
        public cej k;
        public String l;
        public ssv m;
    }
}
