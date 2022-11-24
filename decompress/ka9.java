import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ka9
{
    public final String a;
    public final String b;
    
    public ka9(final String a, final String b) {
        e0e.f((Object)a, "text");
        this.a = a;
        this.b = b;
    }
    
    public static ka9 a(final ka9 ka9, String a, String b, final int n) {
        if ((n & 0x1) != 0x0) {
            a = ka9.a;
        }
        if ((n & 0x2) != 0x0) {
            b = ka9.b;
        }
        Objects.requireNonNull(ka9);
        e0e.f((Object)a, "text");
        return new ka9(a, b);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ka9)) {
            return false;
        }
        final ka9 ka9 = (ka9)o;
        return e0e.a((Object)this.a, (Object)ka9.a) && e0e.a((Object)this.b, (Object)ka9.b);
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final String b = this.b;
        int hashCode2;
        if (b == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = b.hashCode();
        }
        return hashCode * 31 + hashCode2;
    }
    
    @Override
    public final String toString() {
        return dvc.d("DraftMessage(text=", this.a, ", mediaId=", this.b, ")");
    }
}
