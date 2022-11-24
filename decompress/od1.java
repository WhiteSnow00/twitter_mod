// 
// Decompiled by Procyon v0.6.0
// 

public final class od1
{
    public final int a;
    public final float b;
    
    public od1() {
        this.a = 0;
        this.b = 0.0f;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && od1.class == o.getClass()) {
            final od1 od1 = (od1)o;
            if (this.a != od1.a || Float.compare(od1.b, this.b) != 0) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return Float.floatToIntBits(this.b) + (527 + this.a) * 31;
    }
}
