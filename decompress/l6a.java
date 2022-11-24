// 
// Decompiled by Procyon v0.6.0
// 

public final class l6a extends pue implements stb<nud, nud>
{
    public final stb<Integer, Integer> F0;
    
    public l6a(final stb<? super Integer, Integer> f0) {
        this.F0 = (stb<Integer, Integer>)f0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final long a = ((nud)o).a;
        return new nud(shw.f((int)(a >> 32), ((Number)this.F0.invoke((Object)nud.b(a))).intValue()));
    }
}
