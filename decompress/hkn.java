// 
// Decompiled by Procyon v0.6.0
// 

public final class hkn implements jbx
{
    public final boolean a;
    
    public hkn() {
        this.a = false;
    }
    
    public hkn(final boolean b) {
        this.a = true;
    }
    
    public hkn(final boolean b, final int n, final rf8 rf8) {
        this.a = false;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof hkn && this.a == ((hkn)o).a);
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
        return ib0.C("RoomFollowPodcastWrapperStubViewState(show=", this.a, ")");
    }
}
