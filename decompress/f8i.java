// 
// Decompiled by Procyon v0.6.0
// 

public final class f8i implements ccx
{
    public final hed<r9i.a> a;
    
    public f8i(final hed<r9i.a> a) {
        e0e.f((Object)a, "narrowcastItems");
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof f8i && e0e.a((Object)this.a, (Object)((f8i)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        final hed<r9i.a> a = this.a;
        final StringBuilder sb = new StringBuilder();
        sb.append("NarrowcastBottomSheetCommunityPickerViewState(narrowcastItems=");
        sb.append(a);
        sb.append(")");
        return sb.toString();
    }
}
