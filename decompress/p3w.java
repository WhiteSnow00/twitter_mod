import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class p3w extends lsr
{
    public List<hfv> j;
    
    public p3w(final p3w.p3w$a p3w$a) {
        super((lsr.lsr$a)p3w$a);
        Object j;
        if ((j = p3w$a.k) == null) {
            j = v2a.C0;
        }
        this.j = (List<hfv>)j;
    }
    
    @Override
    public final asr b(final String s) {
        return (asr)new n3w(s, this);
    }
}
