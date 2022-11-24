// 
// Decompiled by Procyon v0.6.0
// 

public final class s6a extends pue implements stb<nud, hud>
{
    public final stb<Integer, Integer> F0;
    
    public s6a(final stb<? super Integer, Integer> f0) {
        this.F0 = (stb<Integer, Integer>)f0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        return new hud(kqe.d(((Number)this.F0.invoke((Object)(int)(((nud)o).a >> 32))).intValue(), 0));
    }
}
