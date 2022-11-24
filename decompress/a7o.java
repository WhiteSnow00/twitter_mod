// 
// Decompiled by Procyon v0.6.0
// 

public final class a7o implements ccx
{
    public final String a;
    
    public a7o() {
        this.a = "";
    }
    
    public a7o(final String s, final int n, final wg8 wg8) {
        this.a = "";
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof a7o && e0e.a((Object)this.a, (Object)((a7o)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        return c0e.h("RoomSettingsMultiScheduledSpacesViewState(someText=", this.a, ")");
    }
}
