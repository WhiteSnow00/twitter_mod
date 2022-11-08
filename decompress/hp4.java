import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hp4 extends gue implements rtb<Integer, Object>
{
    public final /* synthetic */ rtb C0;
    public final /* synthetic */ List D0;
    
    public hp4(final rtb c0, final List d0) {
        this.C0 = c0;
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        return this.C0.invoke(this.D0.get(((Number)o).intValue()));
    }
}
