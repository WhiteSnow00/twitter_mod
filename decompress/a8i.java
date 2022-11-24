import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class a8i extends pue implements stb<Integer, Object>
{
    public final stb F0;
    public final List G0;
    
    public a8i(final stb f0, final List g0) {
        this.F0 = f0;
        this.G0 = g0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        return this.F0.invoke(this.G0.get(((Number)o).intValue()));
    }
}
