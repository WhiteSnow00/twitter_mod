import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ori
{
    public static final b Companion;
    public static final nmp<ori> c;
    public static final nmp<List<ori>> d;
    public final String a;
    public final String b;
    
    static {
        Companion = new b();
        ori.d = new ar4$a((nmp)(ori.c = ori.ori$c.c));
    }
    
    public ori(final ori.ori$a ori$a) {
        e0e.f((Object)ori$a, "builder");
        final String a = ori$a.a;
        final String b = ori$a.b;
        e0e.f((Object)a, "screenName");
        e0e.f((Object)b, "imageUrl");
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ori)) {
            return false;
        }
        final ori ori = (ori)o;
        return e0e.a((Object)this.a, (Object)ori.a) && e0e.a((Object)this.b, (Object)ori.b);
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 31;
    }
    
    @Override
    public final String toString() {
        return dvc.d("NotificationContextUser(screenName=", this.a, ", imageUrl=", this.b, ")");
    }
    
    public static final class b
    {
    }
}
