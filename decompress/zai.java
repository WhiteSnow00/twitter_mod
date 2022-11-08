// 
// Decompiled by Procyon v0.6.0
// 

public final class zai implements bra<abi, yai>
{
    public static final zai.zai$b Companion;
    public static final zai$a e;
    public final ost a;
    public final edj b;
    public final n2j c;
    public final ibm d;
    
    static {
        Companion = new zai.zai$b();
        e = new yai() {
            public final void bind() {
            }
        };
    }
    
    public zai(final ost a, final edj b, final n2j c, final ibm d) {
        zzd.f((Object)a, "topicsRepository");
        zzd.f((Object)b, "urtViewHelper");
        zzd.f((Object)c, "numTopicsSelectedManager");
        zzd.f((Object)d, "releaseCompletable");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final yai f(final abi abi) {
        zzd.f((Object)abi, "navigationLinkOptions");
        final dsr d = abi.d;
        Object e;
        if (d != null && d.c == 9) {
            e = new fst(this.a, (n1c)this.b, abi, this.c, this.d);
        }
        else {
            e = zai.e;
        }
        return (yai)e;
    }
}
