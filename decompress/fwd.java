import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fwd extends lsr
{
    public final xdj j;
    public final List<rvd> k;
    public final List<String> l;
    public final String m;
    public final String n;
    public final String o;
    public final boolean p;
    
    public fwd(final fwd.fwd$a fwd$a) {
        super((lsr.lsr$a)fwd$a);
        this.j = fwd$a.k;
        final List l = fwd$a.l;
        pf8.r(l);
        this.k = l;
        Object i;
        if ((i = fwd$a.m) == null) {
            i = v2a.C0;
        }
        this.l = (List<String>)i;
        this.m = fwd$a.n;
        final String o = fwd$a.o;
        pf8.q(o);
        this.n = o;
        String p;
        if ((p = fwd$a.p) == null) {
            p = "typeahead";
        }
        this.o = p;
        this.p = fwd$a.q;
    }
    
    @Override
    public final asr b(final String s) {
        return (asr)new dwd(s, this);
    }
}
