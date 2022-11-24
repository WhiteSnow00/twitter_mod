// 
// Decompiled by Procyon v0.6.0
// 

public final class uou
{
    public static final k5j<uou> c;
    public final int a;
    public final String b;
    
    static {
        uou.c = new uou.uou$b();
    }
    
    public uou(final uou.uou$a uou$a) {
        this.a = uou$a.a;
        this.b = uou$a.b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && uou.class == o.getClass()) {
            final uou uou = (uou)o;
            if (this.a != uou.a || !o5j.a((Object)this.b, (Object)uou.b)) {
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
    
    @Override
    public final String toString() {
        final StringBuilder f = ehk.f("TweetPreviewInfo{timelineType=");
        f.append(this.a);
        f.append(", timelineTag='");
        f.append(this.b);
        f.append('\'');
        f.append('}');
        return f.toString();
    }
}
