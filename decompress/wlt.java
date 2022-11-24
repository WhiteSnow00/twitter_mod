// 
// Decompiled by Procyon v0.6.0
// 

public final class wlt extends ort
{
    public final ult a;
    public final int b;
    public boolean c;
    
    public wlt(final ult a, final int b, final boolean c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && wlt.class == o.getClass()) {
            final wlt wlt = (wlt)o;
            if (!o5j.a((Object)this.a, (Object)wlt.a) || !o5j.a((Object)this.b, (Object)wlt.b)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return o5j.g((Object)this.a, (Object)this.b);
    }
}
