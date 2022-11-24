import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aal
{
    public static final a Companion;
    public static final dda a;
    public static final dda b;
    public static final dda c;
    public static final dda d;
    
    static {
        Companion = new a();
        final dda.a companion = dda.Companion;
        a = companion.e("profile", "category_label", "", "", "click");
        b = companion.e("profile", "category_label", "", "", "impression");
        c = companion.e("profile", "category_label", "half_sheet", "", "impression");
        d = companion.e("profile", "verified_phone_label", "", "", "impression");
    }
    
    public static final aal a() {
        Objects.requireNonNull(aal.Companion);
        Objects.requireNonNull(z4l.Companion);
        return ((z4l)((n5j)dr0.Companion.a()).B((Class)z4l.class)).v1();
    }
    
    public final void b(final dda dda) {
        sbw.b((tlm)new fg4(dda));
    }
    
    public static final class a
    {
    }
}
