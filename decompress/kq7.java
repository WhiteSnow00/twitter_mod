import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kq7
{
    public final List<hx9> a;
    
    public kq7(final List<hx9> a) {
        czd.f((Object)a, "educationFlagList");
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof kq7 && czd.a((Object)this.a, (Object)((kq7)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        return wc0.z("DMJapanEducationFlagList(educationFlagList=", (List)this.a, ")");
    }
}
