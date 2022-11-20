// 
// Decompiled by Procyon v0.6.0
// 

public final class bce extends dtr
{
    public final String j;
    public final int k;
    
    public bce(final bce.bce$a bce$a) {
        czd.f((Object)bce$a, "builder");
        super((dtr$a)bce$a);
        final String k = bce$a.k;
        if (k != null) {
            this.j = k;
            this.k = bce$a.l;
            return;
        }
        czd.m("url");
        throw null;
    }
    
    public final ssr b(final String s) {
        czd.f((Object)s, "subtaskId");
        return new ybe(s, this);
    }
}
