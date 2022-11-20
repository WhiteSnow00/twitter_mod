import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nqc implements sd2
{
    public static final nqc.nqc$a Companion;
    public static final List<List<String>> a;
    
    static {
        Companion = new nqc.nqc$a();
        a = s9i.s(s9i.s("home", "timeline", "tweet", "click"), s9i.s("home", "timeline", "tweet", "avatar", "click"), s9i.s("home", "timeline", "tweet", "card", "click"), s9i.s("home", "timeline", "tweet", "image", "click"), s9i.s("home", "timeline", "tweet", "link", "click"), s9i.s("home", "timeline", "tweet", "video", "click"));
    }
    
    public final boolean a(final nv1 nv1) {
        czd.f((Object)nv1, "event");
        return nv1 instanceof n6a && nqc.a.contains(nv1.u());
    }
}
