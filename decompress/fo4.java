import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fo4 extends ste implements qsb<Integer, Object>
{
    public final qsb D0;
    public final List E0;
    
    public fo4(final qsb d0, final List e0) {
        this.D0 = d0;
        this.E0 = e0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        return this.D0.invoke(this.E0.get(((Number)o).intValue()));
    }
}
