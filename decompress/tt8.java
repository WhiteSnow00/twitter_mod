// 
// Decompiled by Procyon v0.6.0
// 

public final class tt8 implements gra<hdj, st8>
{
    public static final tt8.tt8$b Companion;
    public static final tt8$a f;
    public final vtt a;
    public final wdj b;
    public final qej c;
    public final g3j d;
    public final kcm e;
    
    static {
        Companion = new tt8.tt8$b();
        f = new st8() {
            public final void bind() {
            }
        };
    }
    
    public tt8(final vtt a, final wdj b, final qej c, final g3j g3j, final ddj ddj, final kcm e) {
        e0e.f((Object)a, "topicsRepository");
        e0e.f((Object)b, "urtViewHelper");
        e0e.f((Object)c, "ocfRichTextProcessorHelper");
        e0e.f((Object)g3j, "numTopicsSelectedManager");
        e0e.f((Object)ddj, "ocfDataReferenceReader");
        e0e.f((Object)e, "releaseCompletable");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = g3j;
        this.e = e;
        ddj.b = (o97)g3j;
    }
    
    public final /* bridge */ Object a(final Object o) {
        return this.f((hdj)o);
    }
    
    public final st8 f(final hdj hdj) {
        e0e.f((Object)hdj, "detailRichTextOptions");
        final ttr a = hdj.a;
        Object f;
        if (a != null && a.c == 9) {
            f = new qmt(this.a, (q1c)this.b, hdj, this.c, this.d, this.e);
        }
        else {
            f = tt8.f;
        }
        return (st8)f;
    }
}
