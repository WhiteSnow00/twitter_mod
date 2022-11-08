// 
// Decompiled by Procyon v0.6.0
// 

public final class e5a extends lsr
{
    public final ga8 j;
    public final ga8 k;
    public final xdj l;
    public final xdj m;
    public final String n;
    public final xdj o;
    public final kcj p;
    
    public e5a(final e5a.e5a$a e5a$a) {
        zzd.f((Object)e5a$a, "builder");
        super((lsr.lsr$a)e5a$a);
        this.j = e5a$a.l;
        this.k = e5a$a.m;
        this.l = e5a$a.o;
        this.m = e5a$a.p;
        final String k = e5a$a.k;
        if (k != null) {
            this.n = k;
            this.o = e5a$a.n;
            this.p = e5a$a.q;
            return;
        }
        zzd.m("hintText");
        throw null;
    }
    
    @Override
    public final asr b(final String s) {
        zzd.f((Object)s, "subtaskId");
        return (asr)new c5a(s, this);
    }
}
