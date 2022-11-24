// 
// Decompiled by Procyon v0.6.0
// 

public final class on5
{
    public static final b Companion;
    public static final a c;
    public final String a;
    public final String b;
    
    static {
        Companion = new b();
        c = new a();
    }
    
    public on5(final String a, final String b) {
        e0e.f((Object)a, "hashtag");
        e0e.f((Object)b, "id");
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof on5)) {
            return false;
        }
        final on5 on5 = (on5)o;
        return e0e.a((Object)this.a, (Object)on5.a) && e0e.a((Object)this.b, (Object)on5.b);
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 31;
    }
    
    @Override
    public final String toString() {
        return dvc.d("CommunityHashtag(hashtag=", this.a, ", id=", this.b, ")");
    }
    
    public static final class a extends k5j<on5>
    {
        public final Object d(final rmp rmp, final int n) {
            e0e.f((Object)rmp, "input");
            final String c = rmp.C();
            e0e.e((Object)c, "input.readNotNullString()");
            final String c2 = rmp.C();
            e0e.e((Object)c2, "input.readNotNullString()");
            return new on5(c, c2);
        }
        
        public final void f(final smp smp, final Object o) {
            final on5 on5 = (on5)o;
            e0e.f((Object)smp, "output");
            e0e.f((Object)on5, "hashtag");
            smp.G(on5.a);
            smp.G(on5.b);
        }
    }
    
    public static final class b
    {
    }
}
