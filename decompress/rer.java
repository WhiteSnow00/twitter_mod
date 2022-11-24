// 
// Decompiled by Procyon v0.6.0
// 

public final class rer implements sdw
{
    public final boolean a;
    
    public rer(final boolean a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof rer && this.a == ((rer)o).a);
    }
    
    @Override
    public final int hashCode() {
        int a;
        if ((a = (this.a ? 1 : 0)) != 0) {
            a = 1;
        }
        return a;
    }
    
    @Override
    public final String toString() {
        return jba.o("StationListClicked(viaStationListButton=", this.a, ")");
    }
}
