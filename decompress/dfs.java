import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dfs extends ste implements qsb<fhp, fzv>
{
    public final xc0 D0;
    public final bfs E0;
    
    public dfs(final xc0 d0, final bfs e0) {
        this.D0 = d0;
        this.E0 = e0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final fhp fhp = (fhp)o;
        czd.f((Object)fhp, "$this$semantics");
        final xc0 d0 = this.D0;
        final coe<Object>[] a = chp.a;
        czd.f((Object)d0, "value");
        final zgp a2 = zgp.a;
        fhp.e((ehp<List>)zgp.t, s9i.r(d0));
        chp.c(fhp, (qsb)new cfs(this.E0));
        return fzv.a;
    }
}
