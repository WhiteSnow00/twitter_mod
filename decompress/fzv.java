import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fzv extends b
{
    public static final a Companion;
    public static final fzv.fzv$b b;
    public static final alp<List<Long>> c;
    public final List<Long> a;
    
    static {
        Companion = new a();
        b = new fzv.fzv$b();
        fzv.c = new xq4$a((alp)hx6.c);
    }
    
    public fzv(final List<Long> a) {
        zzd.f((Object)a, "unmentionedUserIds");
        this.a = a;
    }
    
    public final boolean a(final long n) {
        return this.a.contains(n);
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof fzv && zzd.a((Object)this.a, (Object)((fzv)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        return du1.x("UnmentionInfo(unmentionedUserIds=", (List)this.a, ")");
    }
    
    public static final class a
    {
    }
}
