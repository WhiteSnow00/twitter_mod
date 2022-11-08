import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class z6p implements zqt
{
    public final m6p a;
    
    public z6p(final m6p a) {
        this.a = a;
    }
    
    public final void a(final String s, final String s2) {
        final m6p a = this.a;
        Objects.requireNonNull(a);
        final mev$a mev$a = new mev$a();
        mev$a.a = s;
        mev$a.b = s;
        mev$a.g = Long.parseLong(s2);
        mev$a.n = new dqt(s, s2);
        iz5.k((rj)new l6p((Object)a, (Object)((h4j)mev$a).e(), 0)).t(yvo.c()).p();
    }
}
