// 
// Decompiled by Procyon v0.6.0
// 

public final class cxa extends lsr
{
    public static final alp<cxa> k;
    public final boolean j;
    
    static {
        cxa.k = new cxa.cxa$b();
    }
    
    public cxa(final cxa.cxa$a cxa$a) {
        super((lsr.lsr$a)cxa$a);
        this.j = cxa$a.k;
    }
    
    @Override
    public final asr b(final String s) {
        return (asr)new xwa(s, this);
    }
}
